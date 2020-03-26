package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PerformPromiseAll {
  val length: Int = 3
  val func: Func = Func("""PerformPromiseAll""", List(Id("""iteratorRecord"""), Id("""constructor"""), Id("""resultCapability""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""constructor"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), ILet(Id("""values"""), EList(List())), ILet(Id("""remainingElementsCount"""), EMap(Ty("""Record"""), List((EStr("""Value"""), EINum(1L))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""constructor"""))), EStr("""resolve"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""promiseResolve"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""promiseResolve"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), ILet(Id("""index"""), EINum(0L)), IWhile(EBool(true), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), ILet(Id("""next"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))), IIf(ERef(RefId(Id("""__x5__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List())), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""next"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""next""")))), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), IAssign(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value""")), EBOp(OSub, ERef(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value"""))), EINum(1L))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value"""))), EINum(0L)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""values"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""valuesArray"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""valuesArray"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))), ISeq(List())), IApp(Id("""__x9__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x9__""")))), IApp(Id("""__x10__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""nextValue"""))))), IIf(ERef(RefId(Id("""__x10__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List())), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""nextValue""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""nextValue""")), ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""nextValue"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""nextValue""")))), IAppend(EUndef, ERef(RefId(Id("""values""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""promiseResolve"""))), ERef(RefId(Id("""constructor"""))), EList(List(ERef(RefId(Id("""nextValue"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), ILet(Id("""nextPromise"""), ERef(RefId(Id("""__x11__""")))), ILet(Id("""steps"""), ENotSupported("""Algorithms""")), IApp(Id("""__x12__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List(EStr("""AlreadyCalled"""), EStr("""Index"""), EStr("""Values"""), EStr("""Capability"""), EStr("""RemainingElements"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), ILet(Id("""resolveElement"""), ERef(RefId(Id("""__x12__""")))), IAssign(RefProp(RefId(Id("""resolveElement""")), EStr("""AlreadyCalled""")), EMap(Ty("""Record"""), List((EStr("""Value"""), EBool(false))))), IAssign(RefProp(RefId(Id("""resolveElement""")), EStr("""Index""")), ERef(RefId(Id("""index""")))), IAssign(RefProp(RefId(Id("""resolveElement""")), EStr("""Values""")), ERef(RefId(Id("""values""")))), IAssign(RefProp(RefId(Id("""resolveElement""")), EStr("""Capability""")), ERef(RefId(Id("""resultCapability""")))), IAssign(RefProp(RefId(Id("""resolveElement""")), EStr("""RemainingElements""")), ERef(RefId(Id("""remainingElementsCount""")))), IAssign(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value""")), EBOp(OPlus, ERef(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value"""))), EINum(1L))), IApp(Id("""__x13__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""nextPromise"""))), EStr("""then"""), EList(List(ERef(RefId(Id("""resolveElement"""))), ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Reject"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x13__""")))), IAssign(RefId(Id("""index""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L)))))))))
  /* Beautified form:
  "PerformPromiseAll" (iteratorRecord, constructor, resultCapability) => {
    app __x0__ = (IsConstructor constructor)
    assert (= __x0__ true)
    let values = (new [])
    let remainingElementsCount = (new Record("Value" -> 1i))
    app __x1__ = (Get constructor "resolve")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseResolve = __x1__
    app __x2__ = (IsCallable promiseResolve)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    let index = 0i
    while true {
      app __x4__ = (IteratorStep iteratorRecord)
      let next = __x4__
      app __x5__ = (IsAbruptCompletion next)
      if __x5__ iteratorRecord["Done"] = true else {}
      if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) {
        iteratorRecord["Done"] = true
        remainingElementsCount["Value"] = (- remainingElementsCount["Value"] 1i)
        if (= remainingElementsCount["Value"] 0i) {
          app __x6__ = (CreateArrayFromList values)
          if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          let valuesArray = __x6__
          app __x7__ = (Call resultCapability["Resolve"] undefined (new [valuesArray]))
          if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          __x7__
        } else {}
        app __x8__ = (WrapCompletion resultCapability["Promise"])
        return __x8__
      } else {}
      app __x9__ = (IteratorValue next)
      let nextValue = __x9__
      app __x10__ = (IsAbruptCompletion nextValue)
      if __x10__ iteratorRecord["Done"] = true else {}
      if (= (typeof nextValue) "Completion") if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      append undefined -> values
      app __x11__ = (Call promiseResolve constructor (new [nextValue]))
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let nextPromise = __x11__
      let steps = !!! "Algorithms"
      app __x12__ = (CreateBuiltinFunction steps (new ["AlreadyCalled", "Index", "Values", "Capability", "RemainingElements"]))
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let resolveElement = __x12__
      resolveElement["AlreadyCalled"] = (new Record("Value" -> false))
      resolveElement["Index"] = index
      resolveElement["Values"] = values
      resolveElement["Capability"] = resultCapability
      resolveElement["RemainingElements"] = remainingElementsCount
      remainingElementsCount["Value"] = (+ remainingElementsCount["Value"] 1i)
      app __x13__ = (Invoke nextPromise "then" (new [resolveElement, resultCapability["Reject"]]))
      if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      __x13__
      index = (+ index 1i)
    }
  }
  */
}
