package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryGet {
  val length: Int = 3
  val func: Func = Func("""OrdinaryGet""", List(Id("""O"""), Id("""P"""), Id("""Receiver""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPropertyKey"""))), List(ERef(RefId(Id("""P"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""desc"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""parent"""), ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""parent"""))), ENull), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""parent""")), EStr("""Get"""))), List(ERef(RefId(Id("""parent"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Receiver"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""desc"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""desc""")), EStr("""Value"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""desc"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true))), ILet(Id("""getter"""), ERef(RefProp(RefId(Id("""desc""")), EStr("""Get""")))), IIf(EBOp(OEq, ERef(RefId(Id("""getter"""))), EUndef), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""getter"""))), ERef(RefId(Id("""Receiver"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))))
  /* Beautified form:
  "OrdinaryGet" (O, P, Receiver) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (O["GetOwnProperty"] O P)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let desc = __x1__
    if (= desc undefined) {
      app __x2__ = (O["GetPrototypeOf"] O)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let parent = __x2__
      if (= parent null) {
        app __x3__ = (WrapCompletion undefined)
        return __x3__
      } else {}
      app __x4__ = (parent["Get"] parent P Receiver)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (IsDataDescriptor desc)
    if (= __x6__ true) {
      app __x7__ = (WrapCompletion desc["Value"])
      return __x7__
    } else {}
    app __x8__ = (IsAccessorDescriptor desc)
    assert (= __x8__ true)
    let getter = desc["Get"]
    if (= getter undefined) {
      app __x9__ = (WrapCompletion undefined)
      return __x9__
    } else {}
    app __x10__ = (Call getter Receiver)
    if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }
  */
}
