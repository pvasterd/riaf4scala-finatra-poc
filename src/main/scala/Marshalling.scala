package nl.ing.poc.finatra

import com.fasterxml.jackson.annotation.JsonProperty

case class MarshallRequest(flag: Boolean = false,
                           num32: Int = 0,
                           num64: Long = 0L,
                           str: String = null,
                           children: Seq[MarshallRequest] = null)

case class MarshallResponse(@JsonProperty("descendants-count") descendants: Int)


object Type extends Enumeration {
  type Type = Value
  val UNKNOWN = Value("UNKNOWN")
  val FOO = Value("FOO")
  val BAR = Value("BAR")
}

