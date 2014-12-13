import apis._
import akka.actor.ActorSystem
import com.wordnik.swagger.app.{ResourcesApp, SwaggerApp}
import javax.servlet.ServletContext
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  implicit val swagger = new SwaggerApp

  override def init(context: ServletContext) {
    implicit val system = ActorSystem("appActorSystem")
    try {
      context mount (new SchemaApi, "/schema/*")
      context mount (new OrderBookApi, "/orderBook/*")
      context mount (new ExecutionApi, "/execution/*")
      context mount (new PositionApi, "/position/*")
      context mount (new InstrumentApi, "/instrument/*")
      context mount (new ChatApi, "/chat/*")
      context mount (new ApiKeyApi, "/apiKey/*")
      context mount (new TradeApi, "/trade/*")
      context mount (new QuoteApi, "/quote/*")
      context mount (new OrderApi, "/order/*")
      context mount (new UserApi, "/user/*")
      context mount (new ResourcesApp, "/api-docs/*")
    } catch {
      case e: Throwable => e.printStackTrace()
    }
  }
}
