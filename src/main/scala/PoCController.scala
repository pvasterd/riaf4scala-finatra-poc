import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

/**
  * Created by peter on 8-10-16.
  */
class PoCController extends Controller {

  get("/hi") { request: Request =>
  info("hi")
  "Hello " + request.params.getOrElse("name", "unnamed")
}

  post("/test/marshalling") { req : Marshalling.Request =>
    Marshalling.Response(countDescendents(req))
  }

  post("/test/marshalling2") { req : SimpleRequest =>
    "Hi " + req.num32
  }

  def countDescendents(request: Marshalling.Request): Int = request.children match {
    case Nil | null => 0
    case list => list.foldLeft[Int](list.size)((a, b) => a + countDescendents(b))
  }

}
