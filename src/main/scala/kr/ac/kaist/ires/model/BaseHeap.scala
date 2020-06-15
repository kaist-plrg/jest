package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.AST
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.parser.UnicodeRegex

object BaseHeap {
  private val map: Map[String, Obj] = Map(
    "GlobalSymbolRegistry" -> IRList(Vector()),
    "executionStack" -> IRList(Vector()),
    "jobQueue" -> IRList(Vector())
  )

  lazy val get: Map[Addr, Obj] = map.map {
    case (s, v) => NamedAddr(s) -> v
  }
}
