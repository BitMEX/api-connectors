part of api;

class ApiClient {
  static ApiClient defaultApiClient = new ApiClient();

  Map<String, String> _defaultHeaderMap = {};
  Map<String, Authentication> _authentications = {};
  static final dson = new Dartson.JSON();
  final DateFormat _dateFormatter = new DateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

  ApiClient() {
    // Setup authentications (key: authentication name, value: authentication).
  }

  void addDefaultHeader(String key, String value) {
     _defaultHeaderMap[key] = value;
  }

  /// Format the given Date object into string.
  String formatDate(DateTime date) {
    return _dateFormatter.format(date);
  }

  /// Format the given parameter object into string.
  String parameterToString(Object param) {
    if (param == null) {
      return '';
    } else if (param is DateTime) {
      return formatDate(param);
    } else if (param is List) {
      return (param).join(',');
    } else {
      return param.toString();
    }
  }

  static dynamic deserialize(String json, dynamic clazz) {
    var result = json;

    try {
      var decodedJson = JSON.decode(json);

      if(decodedJson is List) {
        result = [];
        for(var obj in decodedJson) {
          result.add(_createEntity(obj, clazz));
        }
      } else {
        result = _createEntity(json, clazz);
      }
    } on FormatException {
      // Just return the passed in value
    }

    return result;
  }

  static dynamic _createEntity(dynamic json, dynamic clazz) {
    bool isMap = json is Map;

    switch(clazz) {
      
      
      case Chat:
        return isMap ? dson.map(json, new Chat()) : dson.decode(json, new Chat());
      
      
      
      case Error:
        return isMap ? dson.map(json, new Error()) : dson.decode(json, new Error());
      
      
      
      case ConnectedUsers:
        return isMap ? dson.map(json, new ConnectedUsers()) : dson.decode(json, new ConnectedUsers());
      
      
      
      case Announcement:
        return isMap ? dson.map(json, new Announcement()) : dson.decode(json, new Announcement());
      
      
      
      case ApiKey:
        return isMap ? dson.map(json, new ApiKey()) : dson.decode(json, new ApiKey());
      
      
      
      case Execution:
        return isMap ? dson.map(json, new Execution()) : dson.decode(json, new Execution());
      
      
      
      case Instrument:
        return isMap ? dson.map(json, new Instrument()) : dson.decode(json, new Instrument());
      
      
      
      case InstrumentInterval:
        return isMap ? dson.map(json, new InstrumentInterval()) : dson.decode(json, new InstrumentInterval());
      
      
      
      case Insurance:
        return isMap ? dson.map(json, new Insurance()) : dson.decode(json, new Insurance());
      
      
      
      case Leaderboard:
        return isMap ? dson.map(json, new Leaderboard()) : dson.decode(json, new Leaderboard());
      
      
      
      case Liquidation:
        return isMap ? dson.map(json, new Liquidation()) : dson.decode(json, new Liquidation());
      
      
      
      case Order:
        return isMap ? dson.map(json, new Order()) : dson.decode(json, new Order());
      
      
      
      case OrderBook:
        return isMap ? dson.map(json, new OrderBook()) : dson.decode(json, new OrderBook());
      
      
      
      case OrderBookL2:
        return isMap ? dson.map(json, new OrderBookL2()) : dson.decode(json, new OrderBookL2());
      
      
      
      case Position:
        return isMap ? dson.map(json, new Position()) : dson.decode(json, new Position());
      
      
      
      case Quote:
        return isMap ? dson.map(json, new Quote()) : dson.decode(json, new Quote());
      
      
      
      case Settlement:
        return isMap ? dson.map(json, new Settlement()) : dson.decode(json, new Settlement());
      
      
      
      case Funding:
        return isMap ? dson.map(json, new Funding()) : dson.decode(json, new Funding());
      
      
      
      case Stats:
        return isMap ? dson.map(json, new Stats()) : dson.decode(json, new Stats());
      
      
      
      case StatsHistory:
        return isMap ? dson.map(json, new StatsHistory()) : dson.decode(json, new StatsHistory());
      
      
      
      case Trade:
        return isMap ? dson.map(json, new Trade()) : dson.decode(json, new Trade());
      
      
      
      case TradeBin:
        return isMap ? dson.map(json, new TradeBin()) : dson.decode(json, new TradeBin());
      
      
      
      case Transaction:
        return isMap ? dson.map(json, new Transaction()) : dson.decode(json, new Transaction());
      
      
      
      case AccessToken:
        return isMap ? dson.map(json, new AccessToken()) : dson.decode(json, new AccessToken());
      
      
      
      case Affiliate:
        return isMap ? dson.map(json, new Affiliate()) : dson.decode(json, new Affiliate());
      
      
      
      case User:
        return isMap ? dson.map(json, new User()) : dson.decode(json, new User());
      
      
      
      case UserCommission:
        return isMap ? dson.map(json, new UserCommission()) : dson.decode(json, new UserCommission());
      
      
      
      case Margin:
        return isMap ? dson.map(json, new Margin()) : dson.decode(json, new Margin());
      
      
      
      case UserPreferences:
        return isMap ? dson.map(json, new UserPreferences()) : dson.decode(json, new UserPreferences());
      
      
      
      case InlineResponse200:
        return isMap ? dson.map(json, new InlineResponse200()) : dson.decode(json, new InlineResponse200());
      
      
      
      case InlineResponse2001:
        return isMap ? dson.map(json, new InlineResponse2001()) : dson.decode(json, new InlineResponse2001());
      
      
      default:
        throw new ApiException(500, 'Could not find a suitable class for deserialization');
    }
  }

  static String serialize(Object obj) {
    String serialized = '';
    if (obj == null) {
      serialized = '';
    } else if (obj is String) {
      serialized = obj;
    } else {
      serialized = dson.encode(obj);
    }
    return serialized;
  }

  Future<Response> invokeAPI( String host, 
                              String path,
                              String method,
                              Map<String, String> queryParams,
                              Object body,
                              Map<String, String> headerParams,
                              Map<String, String> formParams,
                              String contentType,
                              List<String> authNames)  {

    updateParamsForAuth(authNames, queryParams, headerParams);

    var client = new BrowserClient();

    StringBuffer sb = new StringBuffer();
    
    for(String key in queryParams.keys) {
      String value = queryParams[key];
      if (value != null){
        if(sb.toString().length == 0) {
          sb.write("?");
        } else {
          sb.write("&");
        }
        sb.write(key);
        sb.write("=");
        sb.write(value);
      }
    }
    String querystring = sb.toString();

    String url = host + path + querystring;

    headerParams.addAll(_defaultHeaderMap);
    headerParams['Content-Type'] = contentType;

    var completer = new Completer();

    if(body is MultipartRequest) {
      var request = new MultipartRequest(method, Uri.parse(url));      
      request.fields.addAll(body.fields);
      request.files.addAll(body.files);
      request.headers.addAll(body.headers);
      request.headers.addAll(headerParams);
      client.send(request).then((response) => completer.complete(Response.fromStream(response)));
    } else {
      var msgBody = contentType == "application/x-www-form-urlencoded" ? formParams : serialize(body);
      switch(method) {
        case "GET":
          return client.get(url, headers: headerParams);
        case "POST":
          return client.post(url, headers: headerParams, body: msgBody);
        case "PUT":
          return client.put(url, headers: headerParams, body: msgBody);
        case "DELETE":
          return client.delete(url, headers: headerParams);
      }
    }

    return completer.future;
  }

  /// Update query and header parameters based on authentication settings.
  /// @param authNames The authentications to apply  
  void updateParamsForAuth(List<String> authNames, Map<String, String> queryParams, Map<String, String> headerParams) {
    authNames.forEach((authName) {
      Authentication auth = _authentications[authName];
      if (auth == null) throw new ArgumentError("Authentication undefined: " + authName);
      auth.applyToParams(queryParams, headerParams);
    });
  }

}
