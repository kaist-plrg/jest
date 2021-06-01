package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SingleNameBinding0IteratorBindingInitialization1 extends Algorithm {
  val name: String = "SingleNameBinding0IteratorBindingInitialization1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SingleNameBinding0IteratorBindingInitialization1" (this, BindingIdentifier, Initializer, iteratorRecord, environment) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let bindingId = __x0__
    app __x1__ = (ResolveBinding bindingId environment)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lhs = __x1__
    if (= iteratorRecord["Done"] false) {
      app __x2__ = (IteratorStep iteratorRecord)
      let next = __x2__
      app __x3__ = (IsAbruptCompletion next)
      if __x3__ iteratorRecord["Done"] = true else {}
      if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) iteratorRecord["Done"] = true else {
        app __x4__ = (IteratorValue next)
        let v = __x4__
        app __x5__ = (IsAbruptCompletion v)
        if __x5__ iteratorRecord["Done"] = true else {}
        if (is-completion v) if (= v["Type"] CONST_normal) v = v["Value"] else return v else {}
        v
      }
    } else {}
    if (= iteratorRecord["Done"] true) let v = undefined else {}
    if (&& (! (= Initializer absent)) (= v undefined)) {
      app __x6__ = (IsAnonymousFunctionDefinition Initializer)
      if (= __x6__ true) {
        access __x7__ = (Initializer "NamedEvaluation")
        app __x8__ = (__x7__ bindingId)
        v = __x8__
      } else {
        access __x9__ = (Initializer "Evaluation")
        let defaultValue = __x9__
        app __x10__ = (GetValue defaultValue)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        v = __x10__
      }
    } else {}
    if (= environment undefined) {
      app __x11__ = (PutValue lhs v)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (WrapCompletion __x11__)
      return __x12__
    } else {}
    app __x13__ = (InitializeReferencedBinding lhs v)
    app __x14__ = (WrapCompletion __x13__)
    return __x14__
  }"""), this)
}
