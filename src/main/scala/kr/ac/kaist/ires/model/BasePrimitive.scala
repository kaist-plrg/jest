package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.AST
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.parser.UnicodeRegex

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
