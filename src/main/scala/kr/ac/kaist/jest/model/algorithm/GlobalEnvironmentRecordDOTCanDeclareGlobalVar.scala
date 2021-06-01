package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GlobalEnvironmentRecordDOTCanDeclareGlobalVar extends Algorithm {
  val name: String = "GlobalEnvironmentRecordDOTCanDeclareGlobalVar"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GlobalEnvironmentRecord.CanDeclareGlobalVar" (this, N) => {
    let envRec = this
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x0__ = (HasOwnProperty globalObject N)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let hasProperty = __x0__
    if (= hasProperty true) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    app __x2__ = (IsExtensible globalObject)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
