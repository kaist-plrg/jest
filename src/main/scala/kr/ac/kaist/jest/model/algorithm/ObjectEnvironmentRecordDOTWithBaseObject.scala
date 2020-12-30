package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectEnvironmentRecordDOTWithBaseObject extends Algorithm {
  val name: String = "ObjectEnvironmentRecordDOTWithBaseObject"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectEnvironmentRecord.WithBaseObject" (this) => {
    let envRec = this
    if (= envRec["withEnvironment"] true) {
      app __x0__ = (WrapCompletion envRec["BindingObject"])
      return __x0__
    } else {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    }
  }"""), this)
}
