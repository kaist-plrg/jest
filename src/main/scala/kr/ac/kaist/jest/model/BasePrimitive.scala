package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.AST
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error._
import kr.ac.kaist.jest.util.Useful._
import kr.ac.kaist.jest.parser.UnicodeRegex

object BasePrimitive {
  private val map: Map[String, Map[String, Value]] = Map(
    "PrimitiveNumber" -> Map(
      "unit" -> INum(1),
      "add" -> NumberCOLONCOLONadd.func,
      "subtract" -> NumberCOLONCOLONsubtract.func,
      "exponentiate" -> NumberCOLONCOLONexponentiate.func,
      "multiply" -> NumberCOLONCOLONmultiply.func,
      "divide" -> NumberCOLONCOLONdivide.func,
      "remainder" -> NumberCOLONCOLONremainder.func
    ),
    "PrimitiveBigInt" -> Map(
      "unit" -> BigINum(BigInt(1)),
      "add" -> BigIntCOLONCOLONadd.func,
      "subtract" -> BigIntCOLONCOLONsubtract.func,
      "multiply" -> BigIntCOLONCOLONmultiply.func,
      "equal" -> BigIntCOLONCOLONequal.func,
      "lessThan" -> BigIntCOLONCOLONlessThan.func,
      "bitwiseNOT" -> BigIntCOLONCOLONbitwiseNOT.func
    )
  )

  def getMap(s: String): Map[Value, Value] = map.getOrElse(s, Map()).map {
    case (s, v) => Str(s) -> v
  }
}
