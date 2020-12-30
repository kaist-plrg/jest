package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingElement1IteratorBindingInitialization1 extends Algorithm {
  val name: String = "BindingElement1IteratorBindingInitialization1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingElement1IteratorBindingInitialization1" (this, BindingPattern, Initializer, iteratorRecord, environment) => {
    if (= iteratorRecord["Done"] false) {
      app __x0__ = (IteratorStep iteratorRecord)
      let next = __x0__
      app __x1__ = (IsAbruptCompletion next)
      if __x1__ iteratorRecord["Done"] = true else {}
      if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) iteratorRecord["Done"] = true else {
        app __x2__ = (IteratorValue next)
        let v = __x2__
        app __x3__ = (IsAbruptCompletion v)
        if __x3__ iteratorRecord["Done"] = true else {}
        if (is-completion v) if (= v["Type"] CONST_normal) v = v["Value"] else return v else {}
        v
      }
    } else {}
    if (= iteratorRecord["Done"] true) let v = undefined else {}
    if (&& (! (= Initializer absent)) (= v undefined)) {
      access __x4__ = (Initializer "Evaluation")
      let defaultValue = __x4__
      app __x5__ = (GetValue defaultValue)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      v = __x5__
    } else {}
    access __x6__ = (BindingPattern "BindingInitialization")
    app __x7__ = (__x6__ v environment)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }"""), this)
}
