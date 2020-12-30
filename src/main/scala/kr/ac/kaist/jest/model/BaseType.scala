package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.AST
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error._
import kr.ac.kaist.jest.util.Useful._
import kr.ac.kaist.jest.parser.UnicodeRegex

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
