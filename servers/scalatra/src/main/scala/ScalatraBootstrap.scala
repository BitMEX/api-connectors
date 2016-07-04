import com.wordnik.client.api._
import akka.actor.ActorSystem
import io.swagger.app.{ResourcesApp, SwaggerApp}
import javax.servlet.ServletContext
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  implicit val swagger = new SwaggerApp

  override def init(context: ServletContext) {
    implicit val system = ActorSystem("appActorSystem")
    try {
      context mount (new OrderApi, "/Order/*")
      context mount (new ApiKeyApi, "/ApiKey/*")
      context mount (new UserApi, "/User/*")
      context mount (new AnnouncementApi, "/Announcement/*")
      context mount (new LeaderboardApi, "/Leaderboard/*")
      context mount (new FundingApi, "/Funding/*")
      context mount (new OrderBookApi, "/OrderBook/*")
      context mount (new PositionApi, "/Position/*")
      context mount (new SchemaApi, "/Schema/*")
      context mount (new QuoteApi, "/Quote/*")
      context mount (new SettlementApi, "/Settlement/*")
      context mount (new TradeApi, "/Trade/*")
      context mount (new ExecutionApi, "/Execution/*")
      context mount (new InsuranceApi, "/Insurance/*")
      context mount (new ChatApi, "/Chat/*")
      context mount (new InstrumentApi, "/Instrument/*")
      context mount (new StatsApi, "/Stats/*")
      context mount (new LiquidationApi, "/Liquidation/*")
      
      context mount (new ResourcesApp, "/api-docs/*")
    } catch {
      case e: Throwable => e.printStackTrace()
    }
  }
}