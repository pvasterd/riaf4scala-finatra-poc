package nl.ing.poc.finatra

import com.fasterxml.jackson.annotation.JsonProperty
import org.joda.time.DateTime


case class MarshallRequest(//`type`: Type = Type.UNKNOWN,
                           flag: Boolean = false,
                           num32: Int = 0,
                           num64: Long = 0L,
                           str: String = null,
                           children: Seq[MarshallRequest] = null)

case class MarshallResponse(@JsonProperty("descendants-count") descendants: Int)

case class DateTimeResponse(@JsonProperty("current-date-time") datetime: DateTime)

object Type extends Enumeration {
  type Type = Value
  val UNKNOWN = Value("UNKNOWN")
  val FOO = Value("FOO")
  val BAR = Value("BAR")
}
