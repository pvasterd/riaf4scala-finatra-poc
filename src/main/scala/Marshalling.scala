import Type.Type

object Marshalling {
  final case class Request(`type`: Type = Type.UNKNOWN,
                                      flag: Boolean = false,
                                      num32: Int = 0,
                                      num64: Long = 0L,
                                      str: String = null,
                                      children: List[Request] = List.empty)

  final case class Response(descendants: Int)
}


object Type extends Enumeration {
  type Type = Value
  val UNKNOWN = Value("UNKNOWN")
  val FOO = Value("FOO")
  val BAR = Value("BAR")
}

