package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object PrimitiveNumber {
  val map: Map[Value, Value] = Map[Value, Value](
    Str("unsignedRightShift") -> NumberCOLONCOLONunsignedRightShift.func,
    Str("lessThan") -> NumberCOLONCOLONlessThan.func,
    Str("unaryMinus") -> NumberCOLONCOLONunaryMinus.func,
    Str("bitwiseOR") -> NumberCOLONCOLONbitwiseOR.func,
    Str("equal") -> NumberCOLONCOLONequal.func,
    Str("bitwiseNOT") -> NumberCOLONCOLONbitwiseNOT.func,
    Str("sameValueZero") -> NumberCOLONCOLONsameValueZero.func,
    Str("signedRightShift") -> NumberCOLONCOLONsignedRightShift.func,
    Str("toString") -> NumberCOLONCOLONtoString.func,
    Str("sameValue") -> NumberCOLONCOLONsameValue.func,
    Str("bitwiseXOR") -> NumberCOLONCOLONbitwiseXOR.func,
    Str("bitwiseAND") -> NumberCOLONCOLONbitwiseAND.func,
    Str("leftShift") -> NumberCOLONCOLONleftShift.func
  ) ++ BasePrimitive.getMap("PrimitiveNumber")
}
