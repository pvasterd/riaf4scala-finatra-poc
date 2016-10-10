import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by peter on 9-10-16.
  */
class PoCControllerTest extends FlatSpec with Matchers {

  it should "handle 0 child"  in {
    assert(0 === new PoCController().countDescendents(new Marshalling.Request()))
  }

  it should "handle 1 child"  in {
    val request = new Marshalling.Request(children=List(new Marshalling.Request()))
    assert(1 === new PoCController().countDescendents(request))
  }

  it should "handle 2 children"  in {
    val request = new Marshalling.Request(children=List(new Marshalling.Request(),
                                                        new Marshalling.Request()))
    assert(2== new PoCController().countDescendents(request))
  }

  it should "handle 2 deep children"  in {
    val request = new Marshalling.Request(children=List(new Marshalling.Request( children = List(new Marshalling.Request()))))

    assert(2 === new PoCController().countDescendents(request))
  }
  it should "handle null children"  in {
    val request = new Marshalling.Request(children = null)
    assert(0== new PoCController().countDescendents(request))
  }


}
