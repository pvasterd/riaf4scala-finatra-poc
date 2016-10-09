import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter



object ServerMain extends Server

class Server extends HttpServer{
    override def configureHttp(router: HttpRouter) {
      router.add[PoCController]
    }
}
