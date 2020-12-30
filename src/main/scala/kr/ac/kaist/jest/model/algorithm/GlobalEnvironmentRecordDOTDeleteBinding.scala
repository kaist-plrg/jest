package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GlobalEnvironmentRecordDOTDeleteBinding extends Algorithm {
  val name: String = "GlobalEnvironmentRecordDOTDeleteBinding"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GlobalEnvironmentRecord.DeleteBinding" (this, N) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    if (= __x0__ true) {
      app __x1__ = (DclRec["DeleteBinding"] DclRec N)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x3__ = (HasOwnProperty globalObject N)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let existingProp = __x3__
    if (= existingProp true) {
      app __x4__ = (ObjRec["DeleteBinding"] ObjRec N)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let status = __x4__
      if (= status true) {
        let varNames = envRec["VarNames"]
        let __x5__ = 0i
        let __x6__ = varNames["length"]
        while (&& (< __x5__ __x6__) (! (= varNames[__x5__] N))) __x5__ = (+ __x5__ 1i)
        if (< __x5__ __x6__) (pop varNames __x5__) else {}
      } else {}
      app __x7__ = (WrapCompletion status)
      return __x7__
    } else {}
    app __x8__ = (WrapCompletion true)
    return __x8__
  }"""), this)
}
