package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GlobalEnvironmentRecordDOTCreateGlobalVarBinding extends Algorithm {
  val name: String = "GlobalEnvironmentRecordDOTCreateGlobalVarBinding"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GlobalEnvironmentRecord.CreateGlobalVarBinding" (this, N, D) => {
    let envRec = this
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x0__ = (HasOwnProperty globalObject N)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let hasProperty = __x0__
    app __x1__ = (IsExtensible globalObject)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let extensible = __x1__
    if (&& (= hasProperty false) (= extensible true)) {
      app __x2__ = (ObjRec["CreateMutableBinding"] ObjRec N D)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
      app __x3__ = (ObjRec["InitializeBinding"] ObjRec N undefined)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
    } else {}
    let varDeclaredNames = envRec["VarNames"]
    if (! (contains varDeclaredNames N)) append N -> varDeclaredNames else {}
    app __x4__ = (NormalCompletion CONST_empty)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
