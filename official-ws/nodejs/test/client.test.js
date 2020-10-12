const BitMEXClient = require('../index');
const data = require('./fixtures/data');
const sinon = require('sinon');
const sandbox = sinon.createSandbox();
const superagent = require('superagent');

//
// Helpers
//
function delay(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}
function playback(client, data) {
  for (const datum of data) {
    client.socket.onmessage(JSON.stringify(datum));
  }
}

//
// Setup
//
jest.mock('../lib/ReconnectingSocket');
beforeAll(() => {
  superagent.__setMockResponseBody(data.websocketHelp);
});
let client;
beforeEach(() => {
  client = new BitMEXClient();
  client.socket.onopen();
});
afterEach(() => {
  client.socket.onclose();
  sandbox.restore();
})

//
// Specs
//
test('Basic socket creation', async () => {
  expect(client).toBeInstanceOf(require('eventemitter2').EventEmitter2);
  expect(client.socket.onmessage).toBeInstanceOf(Function);
});

test('Sends subscription request on open', async () => {
  sandbox.stub(client.socket, 'send');
  client.addStream('*', 'trade', () => {});
  expect(client.socket.send.firstCall.args).toEqual(['{"op":"subscribe","args":"trade:*"}']);
});

test('Sends symboled subscription request on open', async () => {
  sandbox.stub(client.socket, 'send');
  client.addStream('XBTUSD', 'trade', () => {});
  expect(client.socket.send.firstCall.args).toEqual(['{"op":"subscribe","args":"trade:XBTUSD"}']);
});

test('Basic trade insert', async () => {
  const onTrade = sinon.spy();
  client.addStream('*', 'trade', onTrade);
  playback(client, data.basicTradeInsert);
  const trades = data.basicTradeInsert[data.basicTradeInsert.length - 1].data;

  // Expect the first call to include all data
  expect(onTrade.firstCall.firstArg).toEqual(trades);

  // Expect 129 calls (129 instruments) plus the initial '*' call
  expect(onTrade.callCount).toEqual(trades.length + 1);
});

test.only('Symboled trade insert', async () => {
  const onTrade = sinon.spy();
  client.addStream('XBTUSD', 'trade', onTrade);
  playback(client, data.symboledTradeInsert);
  const trades = data.symboledTradeInsert[data.symboledTradeInsert.length - 1].data;
  console.log(onTrade.getCalls())

  // Expect only the first call, which is only XBTUSD data
  expect(onTrade.firstCall.firstArg).toEqual(trades);
  expect(onTrade.callCount).toEqual(1);
});