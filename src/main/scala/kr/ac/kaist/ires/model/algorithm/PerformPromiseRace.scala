package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PerformPromiseRace {
  val length: Int = 3
  val func: Func = Func("""PerformPromiseRace""", List(Id("""iteratorRecord"""), Id("""constructor"""), Id("""resultCapability""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""constructor"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""constructor"""))), EStr("""resolve"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""promiseResolve"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""promiseResolve"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IWhile(EBool(true), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), ILet(Id("""next"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))), IIf(ERef(RefId(Id("""__x5__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List())), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""next"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""next""")))), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x7__""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""nextValue"""))))), IIf(ERef(RefId(Id("""__x8__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List())), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""nextValue""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""nextValue""")), ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""nextValue"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""nextValue""")))), IApp(Id("""__x9__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""promiseResolve"""))), ERef(RefId(Id("""constructor"""))), EList(List(ERef(RefId(Id("""nextValue"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), ILet(Id("""nextPromise"""), ERef(RefId(Id("""__x9__""")))), IApp(Id("""__x10__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""nextPromise"""))), EStr("""then"""), EList(List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Resolve"""))), ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Reject"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x10__"""))))))))))
  /* Beautified form:
  "PerformPromiseRace" (iteratorRecord, constructor, resultCapability) => {
    app __x0__ = (IsConstructor constructor)
    assert (= __x0__ true)
    app __x1__ = (Get constructor "resolve")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseResolve = __x1__
    app __x2__ = (IsCallable promiseResolve)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    while true {
      app __x4__ = (IteratorStep iteratorRecord)
      let next = __x4__
      app __x5__ = (IsAbruptCompletion next)
      if __x5__ iteratorRecord["Done"] = true else {}
      if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) {
        iteratorRecord["Done"] = true
        app __x6__ = (WrapCompletion resultCapability["Promise"])
        return __x6__
      } else {}
      app __x7__ = (IteratorValue next)
      let nextValue = __x7__
      app __x8__ = (IsAbruptCompletion nextValue)
      if __x8__ iteratorRecord["Done"] = true else {}
      if (= (typeof nextValue) "Completion") if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      app __x9__ = (Call promiseResolve constructor (new [nextValue]))
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let nextPromise = __x9__
      app __x10__ = (Invoke nextPromise "then" (new [resultCapability["Resolve"], resultCapability["Reject"]]))
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      __x10__
    }
  }
  */
}
