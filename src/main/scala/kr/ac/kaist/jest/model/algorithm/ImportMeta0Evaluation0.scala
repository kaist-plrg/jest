package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ImportMeta0Evaluation0 extends Algorithm {
  val name: String = "ImportMeta0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ImportMeta0Evaluation0" (this) => {
    app __x0__ = (GetActiveScriptOrModule )
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let module = __x0__
    assert (= (typeof module) "SourceTextModuleRecord")
    let importMeta = module["ImportMeta"]
    if (= importMeta CONST_empty) {
      app __x1__ = (OrdinaryObjectCreate null)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      importMeta = __x1__
      app __x2__ = (HostGetImportMetaProperties module)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let importMetaValues = __x2__
      let __x3__ = importMetaValues
      let __x4__ = 0i
      while (< __x4__ __x3__["length"]) {
        let p = __x3__[__x4__]
        app __x5__ = (CreateDataPropertyOrThrow importMeta p["Key"] p["Value"])
        if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        __x5__
        __x4__ = (+ __x4__ 1i)
      }
      app __x6__ = (HostFinalizeImportMeta importMeta module)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      __x6__
      module["ImportMeta"] = importMeta
      app __x7__ = (WrapCompletion importMeta)
      return __x7__
    } else {
      app __x8__ = (Type importMeta)
      assert (= __x8__ Object)
      app __x9__ = (WrapCompletion importMeta)
      return __x9__
    }
  }"""), this)
}
