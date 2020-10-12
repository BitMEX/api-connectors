'use strict';
/*eslint no-unused-vars:0*/
const _ = require('lodash');
const debug = require('debug')('BitMEX:realtime-api:deltaParser');

/**
 * A mixin that binds a store's data to a websocket.
 * Accepts multiple socket descriptors.
 * @param  {Object|Array} socketDescriptors Description of a socket connection.
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
  onAction(action, tableName, symbol, client, data) {
    // Deltas before the getSymbol() call returns can be safely discarded.
    if (action !== 'partial' && !isInitialized(tableName, symbol, client)) return [];
    // Partials initialize the table, so there's a different signature.
    if (action === 'partial') return this._partial(tableName, symbol, client, data);

    // Some tables don't have keys, like 'trade' and 'quote'. They are insert-only tables
    // and you should never see updates or deletes on them.
    const keys = client._keys[tableName];
    if ((action === 'update' || action === 'delete') && keys.length === 0) {
      throw new Error("The data in the store " + tableName + " is not keyed for " + action + "s. " +
        "Please email support@bitmex.com if you see this.");
    }

    // This dispatches delete/insert/update.
    return module.exports['_' + action](client._data[tableName], symbol, data.data, client._keys[tableName]);
  },

  _delete(context, key, data, keys) {
    return removeFromStore.apply(null, arguments);
  },

  _insert(context, key, data, keys) {
    return insertIntoStore.apply(null, arguments);
  },

  _partial(tableName, symbol, client, data) {
    if (!client._data[tableName]) client._data[tableName] = {};
    debug('partial: %s %s, data: %j', tableName, symbol, data);
    const dataArr = data.data || [];
    // Intitialize data.
    // FIXME: we need to echo back `filter` with each partial, otherwise we can't tell the difference
    // between no data for a symbol and a partial for a different symbol.
    if (!client._data[tableName][symbol] || dataArr.length) {
      client._data[tableName][symbol] = dataArr;
    }
    // Initialize keys.
    client._keys[tableName] = data.keys;
    // Return inserted data
    return dataArr;
  },

  _update(context, key, data, keys) {
    return updateStore.apply(null, arguments);
  }
};

// Returns `true` if a partial has already been received, and therefore the data saubscription is live.
// We check if either a symbol partial has been received, or a '*' partial (all symbols)
function isInitialized(tableName, symbol, client) {
  const out = Boolean(client._data[tableName] && (client._data[tableName][symbol] || client._data[tableName]['*']));
  debug('isInitialized(%s, %s, client)?: %s', tableName, symbol, out);
  return out;
}

/**
 * Add items  to a store.
 * @param  {Object} context Context.
 * @param  {String} key     Key of store.
 * @param  {Array}  newData Replacement data.
 * @param  {Array}  keys    Key names that uniquely identify a datum.
 */
function insertIntoStore(context, key, newData) {
  const store = context[key] || [];

  // Create a new working object.
  const storeData = [...store, ...newData];

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
  const store = context[key] || [];

  // Create a new working object.
  const storeData = [...store];

  // Loop through data, updating items in `storeData` when necessary.
  for (let i = 0; i < newData.length; i++) {
    let newDatum = newData[i];

    // Find the item we're updating, if it exists.
    const criteria = _.pick(newDatum, keys);
    const itemToUpdate = _.find(storeData, criteria);

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
      throw new Error(`Update for missing item came through on ${key}. Data: ${JSON.stringify(newDatum)}`);
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
  const store = context[key] || [];

  // Create a new working object.
  let storeData = [...store];

  // Loop through incoming data and remove items that match.
  for (let i = 0; i < newData.length; i++) {

    // Find the item to remove and remove it.
    const criteria = _.pick(newData[i], keys);
    const itemToRemove = _.find(storeData, criteria);
    if (itemToRemove) {
      storeData = _.without(storeData, itemToRemove);
    }
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
  if (context[key] && !Array.isArray(context[key])) {
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
  return {...item, ...newData};
}
