package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IteratorClose {
  val length: Int = 2
  val func: Func = Func("""IteratorClose""", List(Id("""iteratorRecord"""), Id("""completion""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ILet(Id("""iterator"""), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""iterator"""))), EStr("""return"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""return"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""return"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completion"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""return"""))), ERef(RefId(Id("""iterator"""))))), ILet(Id("""innerResult"""), ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completion"""))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""innerResult""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""innerResult"""))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))), ISeq(List())), IApp(Id("""__x9__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""innerResult""")), EStr("""Value"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x9__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completion"""))))), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))))
  /* Beautified form:
  "IteratorClose" (iteratorRecord, completion) => {
    app __x0__ = (Type iteratorRecord["Iterator"])
    assert (= __x0__ Object)
    let iterator = iteratorRecord["Iterator"]
    app __x1__ = (GetMethod iterator "return")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let return = __x1__
    if (= return undefined) {
      app __x2__ = (Completion completion)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call return iterator)
    let innerResult = __x4__
    if (= completion["Type"] CONST_throw) {
      app __x5__ = (Completion completion)
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    if (= innerResult["Type"] CONST_throw) {
      app __x7__ = (Completion innerResult)
      app __x8__ = (WrapCompletion __x7__)
      return __x8__
    } else {}
    app __x9__ = (Type innerResult["Value"])
    if (! (= __x9__ Object)) {
      app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x10__
    } else {}
    app __x11__ = (Completion completion)
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }
  */
}
