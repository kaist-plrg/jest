package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncIteratorClose {
  val length: Int = 2
  val func: Func = Func("""AsyncIteratorClose""", List(Id("""iteratorRecord"""), Id("""completion""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ILet(Id("""iterator"""), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""iterator"""))), EStr("""return"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""return"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""return"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completion"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""return"""))), ERef(RefId(Id("""iterator"""))))), ILet(Id("""innerResult"""), ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""innerResult""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefProp(RefId(Id("""innerResult""")), EStr("""Value"""))))), IAssign(RefId(Id("""innerResult""")), ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completion"""))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""innerResult""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""innerResult"""))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""innerResult""")), EStr("""Value"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x10__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completion"""))))), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))), IReturn(ERef(RefId(Id("""__x13__""")))))))
  /* Beautified form:
  "AsyncIteratorClose" (iteratorRecord, completion) => {
    app __x0__ = (Type iteratorRecord["Iterator"])
    assert (= __x0__ Object)
    let iterator = iteratorRecord["Iterator"]
    app __x1__ = (GetMethod iterator "return")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let return = __x1__
    if (= return undefined) {
      app __x2__ = (Completion completion)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call return iterator)
    let innerResult = __x4__
    if (= innerResult["Type"] CONST_normal) {
      app __x5__ = (Await innerResult["Value"])
      innerResult = __x5__
    } else {}
    if (= completion["Type"] CONST_throw) {
      app __x6__ = (Completion completion)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    if (= innerResult["Type"] CONST_throw) {
      app __x8__ = (Completion innerResult)
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    app __x10__ = (Type innerResult["Value"])
    if (! (= __x10__ Object)) {
      app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x11__
    } else {}
    app __x12__ = (Completion completion)
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }
  */
}
