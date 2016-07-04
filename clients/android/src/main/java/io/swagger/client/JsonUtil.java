package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Chat".equalsIgnoreCase(className)) {
      return new TypeToken<List<Chat>>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<List<Error>>(){}.getType();
    }
    
    if ("ConnectedUsers".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConnectedUsers>>(){}.getType();
    }
    
    if ("Announcement".equalsIgnoreCase(className)) {
      return new TypeToken<List<Announcement>>(){}.getType();
    }
    
    if ("ApiKey".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiKey>>(){}.getType();
    }
    
    if ("Execution".equalsIgnoreCase(className)) {
      return new TypeToken<List<Execution>>(){}.getType();
    }
    
    if ("Instrument".equalsIgnoreCase(className)) {
      return new TypeToken<List<Instrument>>(){}.getType();
    }
    
    if ("InstrumentInterval".equalsIgnoreCase(className)) {
      return new TypeToken<List<InstrumentInterval>>(){}.getType();
    }
    
    if ("Insurance".equalsIgnoreCase(className)) {
      return new TypeToken<List<Insurance>>(){}.getType();
    }
    
    if ("Leaderboard".equalsIgnoreCase(className)) {
      return new TypeToken<List<Leaderboard>>(){}.getType();
    }
    
    if ("Liquidation".equalsIgnoreCase(className)) {
      return new TypeToken<List<Liquidation>>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<List<Order>>(){}.getType();
    }
    
    if ("OrderBook".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderBook>>(){}.getType();
    }
    
    if ("OrderBookL2".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderBookL2>>(){}.getType();
    }
    
    if ("Position".equalsIgnoreCase(className)) {
      return new TypeToken<List<Position>>(){}.getType();
    }
    
    if ("Quote".equalsIgnoreCase(className)) {
      return new TypeToken<List<Quote>>(){}.getType();
    }
    
    if ("Settlement".equalsIgnoreCase(className)) {
      return new TypeToken<List<Settlement>>(){}.getType();
    }
    
    if ("Funding".equalsIgnoreCase(className)) {
      return new TypeToken<List<Funding>>(){}.getType();
    }
    
    if ("Stats".equalsIgnoreCase(className)) {
      return new TypeToken<List<Stats>>(){}.getType();
    }
    
    if ("StatsHistory".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatsHistory>>(){}.getType();
    }
    
    if ("Trade".equalsIgnoreCase(className)) {
      return new TypeToken<List<Trade>>(){}.getType();
    }
    
    if ("TradeBin".equalsIgnoreCase(className)) {
      return new TypeToken<List<TradeBin>>(){}.getType();
    }
    
    if ("Transaction".equalsIgnoreCase(className)) {
      return new TypeToken<List<Transaction>>(){}.getType();
    }
    
    if ("AccessToken".equalsIgnoreCase(className)) {
      return new TypeToken<List<AccessToken>>(){}.getType();
    }
    
    if ("Affiliate".equalsIgnoreCase(className)) {
      return new TypeToken<List<Affiliate>>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<List<User>>(){}.getType();
    }
    
    if ("UserCommission".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserCommission>>(){}.getType();
    }
    
    if ("Margin".equalsIgnoreCase(className)) {
      return new TypeToken<List<Margin>>(){}.getType();
    }
    
    if ("UserPreferences".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserPreferences>>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse200>>(){}.getType();
    }
    
    if ("InlineResponse2001".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2001>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Chat".equalsIgnoreCase(className)) {
      return new TypeToken<Chat>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<Error>(){}.getType();
    }
    
    if ("ConnectedUsers".equalsIgnoreCase(className)) {
      return new TypeToken<ConnectedUsers>(){}.getType();
    }
    
    if ("Announcement".equalsIgnoreCase(className)) {
      return new TypeToken<Announcement>(){}.getType();
    }
    
    if ("ApiKey".equalsIgnoreCase(className)) {
      return new TypeToken<ApiKey>(){}.getType();
    }
    
    if ("Execution".equalsIgnoreCase(className)) {
      return new TypeToken<Execution>(){}.getType();
    }
    
    if ("Instrument".equalsIgnoreCase(className)) {
      return new TypeToken<Instrument>(){}.getType();
    }
    
    if ("InstrumentInterval".equalsIgnoreCase(className)) {
      return new TypeToken<InstrumentInterval>(){}.getType();
    }
    
    if ("Insurance".equalsIgnoreCase(className)) {
      return new TypeToken<Insurance>(){}.getType();
    }
    
    if ("Leaderboard".equalsIgnoreCase(className)) {
      return new TypeToken<Leaderboard>(){}.getType();
    }
    
    if ("Liquidation".equalsIgnoreCase(className)) {
      return new TypeToken<Liquidation>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<Order>(){}.getType();
    }
    
    if ("OrderBook".equalsIgnoreCase(className)) {
      return new TypeToken<OrderBook>(){}.getType();
    }
    
    if ("OrderBookL2".equalsIgnoreCase(className)) {
      return new TypeToken<OrderBookL2>(){}.getType();
    }
    
    if ("Position".equalsIgnoreCase(className)) {
      return new TypeToken<Position>(){}.getType();
    }
    
    if ("Quote".equalsIgnoreCase(className)) {
      return new TypeToken<Quote>(){}.getType();
    }
    
    if ("Settlement".equalsIgnoreCase(className)) {
      return new TypeToken<Settlement>(){}.getType();
    }
    
    if ("Funding".equalsIgnoreCase(className)) {
      return new TypeToken<Funding>(){}.getType();
    }
    
    if ("Stats".equalsIgnoreCase(className)) {
      return new TypeToken<Stats>(){}.getType();
    }
    
    if ("StatsHistory".equalsIgnoreCase(className)) {
      return new TypeToken<StatsHistory>(){}.getType();
    }
    
    if ("Trade".equalsIgnoreCase(className)) {
      return new TypeToken<Trade>(){}.getType();
    }
    
    if ("TradeBin".equalsIgnoreCase(className)) {
      return new TypeToken<TradeBin>(){}.getType();
    }
    
    if ("Transaction".equalsIgnoreCase(className)) {
      return new TypeToken<Transaction>(){}.getType();
    }
    
    if ("AccessToken".equalsIgnoreCase(className)) {
      return new TypeToken<AccessToken>(){}.getType();
    }
    
    if ("Affiliate".equalsIgnoreCase(className)) {
      return new TypeToken<Affiliate>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<User>(){}.getType();
    }
    
    if ("UserCommission".equalsIgnoreCase(className)) {
      return new TypeToken<UserCommission>(){}.getType();
    }
    
    if ("Margin".equalsIgnoreCase(className)) {
      return new TypeToken<Margin>(){}.getType();
    }
    
    if ("UserPreferences".equalsIgnoreCase(className)) {
      return new TypeToken<UserPreferences>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse200>(){}.getType();
    }
    
    if ("InlineResponse2001".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2001>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
