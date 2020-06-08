package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object PrimitiveBigInt {
  val map: Map[Value, Value] = Map[Value, Value](
    Str("unaryMinus") -> BigIntCOLONCOLONunaryMinus.func,
    Str("divide") -> BigIntCOLONCOLONdivide.func,
    Str("bitwiseOR") -> BigIntCOLONCOLONbitwiseOR.func,
    Str("sameValueZero") -> BigIntCOLONCOLONsameValueZero.func,
    Str("signedRightShift") -> BigIntCOLONCOLONsignedRightShift.func,
    Str("toString") -> BigIntCOLONCOLONtoString.func,
    Str("exponentiate") -> BigIntCOLONCOLONexponentiate.func,
    Str("sameValue") -> BigIntCOLONCOLONsameValue.func,
    Str("bitwiseXOR") -> BigIntCOLONCOLONbitwiseXOR.func,
    Str("unsignedRightShift") -> BigIntCOLONCOLONunsignedRightShift.func,
    Str("remainder") -> BigIntCOLONCOLONremainder.func,
    Str("bitwiseAND") -> BigIntCOLONCOLONbitwiseAND.func,
    Str("leftShift") -> BigIntCOLONCOLONleftShift.func
  ) ++ BasePrimitive.getMap("PrimitiveBigInt")
}
