package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateIntrinsics {
  val length: Int = 1
  val func: Func = parseFunc(""""CreateIntrinsics" (realmRec) => {
    let intrinsics = (new Record("SubMap" -> (new SubMap())))
    realmRec["Intrinsics"] = intrinsics
    app __x0__ = (ObjectCreate null)
    let objProto = __x0__
    intrinsics["INTRINSIC_ObjectPrototype"] = objProto
    let throwerSteps = (new algorithm("name" -> "", "length" -> 0i, "step" -> INTRINSIC_ThrowTypeError))
    app __x1__ = (CreateBuiltinFunction throwerSteps (new []) realmRec null)
    let thrower = __x1__
    intrinsics["INTRINSIC_ThrowTypeError"] = thrower
    let noSteps = (new algorithm("name" -> "", "length" -> 0i, "step" -> EmptyFunction))
    app __x2__ = (CreateBuiltinFunction noSteps (new []) realmRec objProto)
    let funcProto = __x2__
    intrinsics["INTRINSIC_FunctionPrototype"] = funcProto
    app __x3__ = (thrower["SetPrototypeOf"] thrower funcProto)
    __x3__
    app __x4__ = (AddRestrictedFunctionProperties funcProto realmRec)
    __x4__
    app __x5__ = (WrapCompletion intrinsics)
    return __x5__
  }""")
}
