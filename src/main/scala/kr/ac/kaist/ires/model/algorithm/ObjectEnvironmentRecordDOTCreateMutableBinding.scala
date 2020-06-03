package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectEnvironmentRecordDOTCreateMutableBinding {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""ObjectEnvironmentRecord.CreateMutableBinding" (this, N, D) => {
    let envRec = this
    let bindings = envRec["BindingObject"]
    app __x0__ = (DefinePropertyOrThrow bindings N (new PropertyDescriptor("Value" -> undefined, "Writable" -> true, "Enumerable" -> true, "Configurable" -> D)))
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
