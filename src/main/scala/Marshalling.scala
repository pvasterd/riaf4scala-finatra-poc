import com.fasterxml.jackson.annotation.JsonProperty

object Marshalling {
  final case class Request(//`type`: Type = Type.UNKNOWN,
                                      flag: Boolean = false,
                                      num32: Int = 0,
                                      num64: Long = 0L,
                                      str: String = null,
                                      children: Seq[Request] = Seq.empty)


  final case class Response(descendants: Int)
}

case class SimpleRequest(@JsonProperty("num32") num32: Int = 0,
                         @JsonProperty("num64") num64: Long = 0L,
                         @JsonProperty("str") str: String = null,
                         @JsonProperty("flag") flag: Boolean = true,
                         @JsonProperty("children") children: Option[List[Child]])

case class Child(@JsonProperty("num32") num32: Int = 0,
                         @JsonProperty("num64") num64: Long = 0L,
                         @JsonProperty("str") str: String = null)

object Type extends Enumeration {
  type Type = Value
  val UNKNOWN = Value("UNKNOWN")
  val FOO = Value("FOO")
  val BAR = Value("BAR")
}

