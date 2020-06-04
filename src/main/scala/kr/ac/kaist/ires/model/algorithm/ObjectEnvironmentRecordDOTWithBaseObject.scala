package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectEnvironmentRecordDOTWithBaseObject extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ObjectEnvironmentRecord.WithBaseObject" (this) => {
    let envRec = this
    if (= envRec["withEnvironment"] true) {
      app __x0__ = (WrapCompletion envRec["BindingObject"])
      return __x0__
    } else {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    }
  }""")
}
