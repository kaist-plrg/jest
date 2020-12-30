package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GlobalEnvironmentRecordDOTCanDeclareGlobalFunction extends Algorithm {
  val name: String = "GlobalEnvironmentRecordDOTCanDeclareGlobalFunction"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GlobalEnvironmentRecord.CanDeclareGlobalFunction" (this, N) => {
    let envRec = this
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x0__ = (globalObject["GetOwnProperty"] globalObject N)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let existingProp = __x0__
    if (= existingProp undefined) {
      app __x1__ = (IsExtensible globalObject)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    if (= existingProp["Configurable"] true) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app result = (IsDataDescriptor existingProp)
    if (&& (&& (= result true) (= existingProp.Writable true)) (= existingProp.Enumerable true)) return true else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }"""), this)
}
