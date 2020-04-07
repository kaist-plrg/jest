package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.AST
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.parser.UnicodeRegex

object BaseType {
  private val map: Map[String, Map[String, Value]] = Map(
    "ObjectEnvironmentRecord" -> Map(
      "withEnvironment" -> Bool(false)
    )
  )

  def getMap(s: String): Map[Value, Value] = map.getOrElse(s, Map()).map {
    case (s, v) => Str(s) -> v
  }
}
