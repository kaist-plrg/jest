package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectEnvironmentRecordDOTSetMutableBinding extends Algorithm {
  val name: String = "ObjectEnvironmentRecordDOTSetMutableBinding"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectEnvironmentRecord.SetMutableBinding" (this, N, V, S) => {
    let envRec = this
    let bindings = envRec["BindingObject"]
    app __x0__ = (Set bindings N V S)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
