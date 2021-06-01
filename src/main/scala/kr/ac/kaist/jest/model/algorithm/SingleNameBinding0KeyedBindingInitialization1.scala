package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SingleNameBinding0KeyedBindingInitialization1 extends Algorithm {
  val name: String = "SingleNameBinding0KeyedBindingInitialization1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SingleNameBinding0KeyedBindingInitialization1" (this, BindingIdentifier, Initializer, value, environment, propertyName) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let bindingId = __x0__
    app __x1__ = (ResolveBinding bindingId environment)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lhs = __x1__
    app __x2__ = (GetV value propertyName)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let v = __x2__
    if (&& (! (= Initializer absent)) (= v undefined)) {
      app __x3__ = (IsAnonymousFunctionDefinition Initializer)
      if (= __x3__ true) {
        access __x4__ = (Initializer "NamedEvaluation")
        app __x5__ = (__x4__ bindingId)
        v = __x5__
      } else {
        access __x6__ = (Initializer "Evaluation")
        let defaultValue = __x6__
        app __x7__ = (GetValue defaultValue)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        v = __x7__
      }
    } else {}
    if (= environment undefined) {
      app __x8__ = (PutValue lhs v)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    app __x10__ = (InitializeReferencedBinding lhs v)
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }"""), this)
}
