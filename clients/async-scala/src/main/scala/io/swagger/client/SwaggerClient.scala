package io.swagger.client

import io.swagger.client.api._

import com.wordnik.swagger.client._

import java.io.Closeable

class SwaggerClient(config: SwaggerConfig) extends Closeable {
  val locator = config.locator
  val name = config.name

  private[this] val client = transportClient

  protected def transportClient: TransportClient = new RestClient(config)
  
  val aPIKey = new APIKeyApi(client, config)
  
  val announcement = new AnnouncementApi(client, config)
  
  val chat = new ChatApi(client, config)
  
  val execution = new ExecutionApi(client, config)
  
  val funding = new FundingApi(client, config)
  
  val instrument = new InstrumentApi(client, config)
  
  val insurance = new InsuranceApi(client, config)
  
  val leaderboard = new LeaderboardApi(client, config)
  
  val liquidation = new LiquidationApi(client, config)
  
  val order = new OrderApi(client, config)
  
  val orderBook = new OrderBookApi(client, config)
  
  val position = new PositionApi(client, config)
  
  val quote = new QuoteApi(client, config)
  
  val schema = new SchemaApi(client, config)
  
  val settlement = new SettlementApi(client, config)
  
  val stats = new StatsApi(client, config)
  
  val trade = new TradeApi(client, config)
  
  val user = new UserApi(client, config)
  

  def close() {
    client.close()
  }
}
