package nl.ing.poc.finatra

import com.twitter.finatra.http.Controller

/**
  * Created by peter on 8-10-16.
  */
class PoCController extends Controller {

  post("/test/marshalling") { req : MarshallRequest =>
    MarshallResponse(countDescendents(req))
  }

  def countDescendents(request: MarshallRequest): Int = request.children match {
    case Nil | null => 0
    case list => list.foldLeft[Int](list.size)((a, b) => a + countDescendents(b))
  }

}
