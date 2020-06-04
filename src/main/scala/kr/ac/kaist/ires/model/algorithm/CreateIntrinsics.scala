package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateIntrinsics extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateIntrinsics" (realmRec) => {
    let intrinsics = (new Record("SubMap" -> (new SubMap())))
    realmRec["Intrinsics"] = intrinsics
    intrinsics["INTRINSIC_ObjectPrototype"] = INTRINSIC_ObjectPrototype
    intrinsics["INTRINSIC_ThrowTypeError"] = INTRINSIC_ThrowTypeError
    intrinsics["INTRINSIC_FunctionPrototype"] = INTRINSIC_FunctionPrototype
    app __x0__ = (AddRestrictedFunctionProperties INTRINSIC_FunctionPrototype realmRec)
    __x0__
    app __x1__ = (WrapCompletion intrinsics)
    return __x1__
  }"""))
}
