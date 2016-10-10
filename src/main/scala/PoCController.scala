package nl.ing.poc.finatra

import java.time.LocalDateTime

import com.fasterxml.jackson.annotation.JsonProperty
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller
import org.joda.time.DateTime

class PoCController extends Controller {

  get("/test/datetime") { req: Request  =>
    DateTimeResponse(DateTime.now())
  }

  post("/test/marshalling") { req : MarshallRequest =>
    MarshallResponse(countDescendents(req))
  }

  def countDescendents(request: MarshallRequest): Int = request.children match {
    case Nil | null => 0
    case list => list.foldLeft[Int](list.size)((a, b) => a + countDescendents(b))
  }

}

