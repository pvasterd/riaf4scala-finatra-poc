package nl.ing.poc.finatra

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by peter on 9-10-16.
  */
class PoCControllerTest extends FlatSpec with Matchers {

  it should "handle 0 child"  in {
    assert(0 === new PoCController().countDescendents(new MarshallRequest()))
  }

  it should "handle 1 child"  in {
    val request = new MarshallRequest(children=List(new MarshallRequest()))
    assert(1 === new PoCController().countDescendents(request))
  }

  it should "handle 2 children"  in {
    val request = new MarshallRequest(children=List(new MarshallRequest(),
                                                        new MarshallRequest()))
    assert(2 === new PoCController().countDescendents(request))
  }

  it should "handle 2 deep children"  in {
    val request = new MarshallRequest(children=List(new MarshallRequest( children = List(new MarshallRequest()))))

    assert(2 === new PoCController().countDescendents(request))
  }
  it should "handle null children"  in {
    val request = new MarshallRequest(children = null)
    assert(0== new PoCController().countDescendents(request))
  }


}
