package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GlobalEnvironmentRecordDOTCreateGlobalFunctionBinding extends Algorithm {
  val name: String = "GlobalEnvironmentRecordDOTCreateGlobalFunctionBinding"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GlobalEnvironmentRecord.CreateGlobalFunctionBinding" (this, N, V, D) => {
    let envRec = this
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x0__ = (globalObject["GetOwnProperty"] globalObject N)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let existingProp = __x0__
    if (|| (= existingProp undefined) (= existingProp["Configurable"] true)) let desc = (new PropertyDescriptor("Value" -> V, "Writable" -> true, "Enumerable" -> true, "Configurable" -> D)) else let desc = (new PropertyDescriptor("Value" -> V))
    app __x1__ = (DefinePropertyOrThrow globalObject N desc)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    if (! (= ObjRec["SubMap"][N] absent)) ObjRec["SubMap"][N]["initialized"] = true else {}
    app __x2__ = (Set globalObject N V false)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    let varDeclaredNames = envRec["VarNames"]
    if (! (contains varDeclaredNames N)) append N -> varDeclaredNames else {}
    app __x3__ = (NormalCompletion CONST_empty)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
