let mockDelay;
let mockError;
let mockResponse = {
  get: jest.fn(),
  ok: true,
  status: 200,
  toError: jest.fn(),
};

let mockResponseBodies;
let responseBodiesIndex;

const Request = {
  __setMockDelay(boolValue) {
    mockDelay = boolValue;
  },
  __setMockError(mockErr) {
    mockError = mockErr;
  },
  __setMockResponse(mockRes) {
    mockResponse = mockRes;
  },
  __setMockResponseBodies(bodies) {
    mockResponseBodies = bodies;
    responseBodiesIndex = -1;
  },
  __setMockResponseBody(body) {
    mockResponse.body = body;
    responseBodiesIndex = undefined;
  },
  accept: jest.fn().mockReturnThis(),
  catch: jest.fn().mockReturnThis(),
  delete: jest.fn().mockReturnThis(),
  end: jest.fn().mockImplementation(callback => {
    if (mockDelay) {
      this.delayTimer = setTimeout(callback, 0, mockError, mockResponse);

      return;
    }

    callback(mockError, mockResponse);
  }),
  field: jest.fn().mockReturnThis(),
  get: jest.fn().mockReturnThis(),
  head: jest.fn().mockReturnThis(),
  patch: jest.fn().mockReturnThis(),
  post: jest.fn().mockReturnThis(),
  put: jest.fn().mockReturnThis(),
  query: jest.fn().mockReturnThis(),
  redirects: jest.fn().mockReturnThis(),
  send: jest.fn().mockReturnThis(),
  set: jest.fn().mockReturnThis(),
  then: cb =>
    new Promise((resolve, reject) => {
      if (typeof responseBodiesIndex !== 'undefined') {
        responseBodiesIndex += 1;
        mockResponse.body = mockResponseBodies[responseBodiesIndex];
      }
      if (mockError) {
        reject(mockError);
      } else {
        resolve(cb(mockResponse));
      }
    }),
  timeout: jest.fn().mockReturnThis(),
  type: jest.fn().mockReturnThis(),
};

module.exports = Request;