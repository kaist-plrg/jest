package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToBigInt extends Algorithm {
  val name: String = "ToBigInt"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ToBigInt" (argument) => {
    app prim = (ToPrimitive argument Number)
    ? prim
    app atype = (Type argument)
    let typeError = (new Completion (
      "Type" -> CONST_throw,
      "Value" -> (new OrdinaryObject(
        "Prototype" -> INTRINSIC_TypeErrorPrototype,
        "ErrorData" -> undefined,
        "SubMap" -> (new SubMap())
      )),
      "Target" -> CONST_empty
    ))
    if (= atype "Undefined") return typeError
    else if (= atype "Null") reutrn typeError
    else if (= atype "Boolean") if prim 1n else 0n
    else if (= atype "BigInt") return prim
    else if (= atype "Number") return typeError
    else if (= atype "String") {
      app n = (StringToBigInt prim)
      ! n
      if (= n NaN) return (new Completion (
        "Type" -> CONST_throw,
        "Value" -> (new OrdinaryObject(
          "Prototype" -> INTRINSIC_SyntaxErrorPrototype,
          "ErrorData" -> undefined,
          "SubMap" -> (new SubMap())
        )),
        "Target" -> CONST_empty
      ))
      return n
    } else return typeError
  }"""), this)
}
