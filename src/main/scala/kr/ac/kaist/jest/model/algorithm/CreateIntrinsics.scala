package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateIntrinsics extends Algorithm {
  val name: String = "CreateIntrinsics"
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
  }"""), this)
}
