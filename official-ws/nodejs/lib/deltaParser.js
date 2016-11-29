'use strict';
var _ = require('lodash');
var debug = require('debug')('BitMEX:realtime-api:deltaParser');
var util = require('util');

/**
 * A mixin that binds a store's data to a websocket.
 * Accepts multiple socket descriptors.
 * @param  {Object|Array} socketDescriptors Description of a socket connection.
 * @return {Mixin}                          Fluxxor Store mixin.
 */
module.exports = {

  /**
   * Called when data comes in via the websocket.
   *
   * Returns new data. We ensure that the object identity check will fail by constructing a new array
   * or object whenever data updates.
   *
   * We handle four different kinds of events:
   *
   * 'partial': Replace the store entirely.
   * 'update': Iterate through items sent. Find the items that match those items (via keys)
   *           and replace them with new items. Do not merge properties; create new objects
   *           for faster shouldComponentUpdate.
   * 'insert': Insert a new item to the front or to the back.
   * 'delete': Delete an item from the store.
   *
   * @param  {String} action    Action name.
   * @param  {String} tableName Table to update.
   * @param  {String} symbol    Symbol we're updating (instrument).
   * @param  {Object} client    Client store.
   * @param  {Array}  data      Array of new data.
   * @return {Array}            Updated data.
   */
  onAction: function(action, tableName, symbol, client, data) {
    // Deltas before the getSymbol() call returns can be safely discarded.
    if (action !== 'partial' && !isInitialized(tableName, symbol, client)) return;
    if (action === 'partial') {
      return this._partial(tableName, symbol, client, data);
    }
    return module.exports['_' + action](client._data[symbol], tableName, data.data, client._keys[tableName]);
  },

  _delete: function(context, key, data, keys) {
    return removeFromStore.apply(null, arguments);
  },

  _insert: function(context, key, data, keys) {
    return insertIntoStore.apply(null, arguments);
  },

  _partial: function(tableName, symbol, client, data) {
    if (!client._data[symbol]) client._data[symbol] = {};
    // Intitialize data.
    client._data[symbol][tableName] = data.data;
    // Initialize keys.
    client._keys[tableName] = Object.keys(data.foreignKeys);
    return client._data[symbol][tableName];
  },

  _update: function(context, key, data, keys) {
    return updateStore.apply(null, arguments);
  }
};

function isInitialized(tableName, symbol, client) {
  return client._data[symbol] && client._data[symbol][tableName];
}

/**
 * Add items  to a store.
 * @param  {Object} context Context.
 * @param  {String} key     Key of store.
 * @param  {Array}  newData Replacement data.
 * @param  {Array}  keys    Key names that uniquely identify a datum.
 */
function insertIntoStore(context, key, newData) {
  var store = context[key] || [];

  // Create a new working object.
  var storeData = [].concat(store).concat(newData);

  return replaceStore(context, key, storeData);
}

/**
 * Update items in a store.
 * @param  {Object} context Context.
 * @param  {String} key     Key of store.
 * @param  {Array}  newData Replacement data.
 * @param  {Array}  keys    Key names that uniquely identify a datum.
 */
function updateStore(context, key, newData, keys) {
  var store = context[key] || [];

  // Create a new working object.
  var storeData = [].concat(store);

  // Loop through data, updating items in `storeData` when necessary.
  for (var i = 0; i < newData.length; i++) {
    var newDatum = newData[i];

    // Find the item we're updating, if it exists.
    var criteria = _.pick(newDatum, keys);
    var itemToUpdate = _.find(storeData, criteria);

    // If the item exists, replace it with an updated item.
    // This will actually replace the existing store with a new array
    // containing a completely new updated object. A little more GC work
    // but unique object references, for better shouldComponentUpdate.
    if (itemToUpdate) {
      newDatum = updateItem(itemToUpdate, newDatum);
      storeData[storeData.indexOf(itemToUpdate)] = newDatum;
    }
    // This is bad - the item didn't exist and we're trying to update it.
    // A lot of bad things can happen here since we basically have an incomplete
    // data set. An insert should have come first, but we can't treat this as an
    // insert because we'd end up with an item that has missing properties.
    else {
      throw new Error("Update for missing item came through on " + key + ". Data: " + JSON.stringify(newDatum));
    }
  }

  return replaceStore(context, key, storeData);
}

/**
 * Removes items from a store.
 * @param  {Object} context Context.
 * @param  {String} key     Key of store.
 * @param  {Array}  newData Replacement data.
 * @param  {Array}  keys    Key names that uniquely identify a datum.
 */
function removeFromStore(context, key, newData, keys) {
  var store = context[key] || [];

  // Create a new working object.
  var storeData = [].concat(store);

  // Loop through incoming data and remove items that match.
  for (var i = 0; i < newData.length; i++) {

    // Find the item to remove and remove it.
    var criteria = _.pick(newData[i], keys);
    var itemToRemove = _.find(storeData, criteria);
    storeData = _.without(storeData, itemToRemove);
  }

  return replaceStore(context, key, storeData);
}

/**
 * Replaces an object at a path with a new object.
 * @param  {Object} obj     Context.
 * @param  {String} key     Key of store.
 * @param  {Array}  newData New data.
 * @return {Object}         Context.
 */
function replaceStore(context, key, newData) {
  // Store could be an array or singular object/model.
  if (!Array.isArray(context[key])) {
    // Not an array - simply replace with the first item in our new array.
    // This is for single object stores, like margin.
    context[key] = newData[0];
  } else {
    context[key] = newData;
  }
  return context[key];
}

/**
 * Update an item. Creates a new item, does not modify the old one.
 * @param  {Object|Model} item    Item to update.
 * @param  {Object} newData       Hash of new data.
 * @return {Object|Model}         A new item with new data.
 */
function updateItem(item, newData) {
  return _.extend({}, item, newData);
}
