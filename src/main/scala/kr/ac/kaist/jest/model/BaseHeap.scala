package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.AST
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error._
import kr.ac.kaist.jest.util.Useful._
import kr.ac.kaist.jest.parser.UnicodeRegex

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
