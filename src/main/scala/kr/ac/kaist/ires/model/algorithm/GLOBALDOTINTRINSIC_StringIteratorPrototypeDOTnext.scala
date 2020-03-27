package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_StringIteratorPrototypeDOTnext {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.INTRINSIC_StringIteratorPrototype.next""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IIf(EBOp(OOr, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedString"""))), EAbsent), EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""StringIteratorNextIndex"""))), EAbsent)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), ILet(Id("""s"""), ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedString""")))), IIf(EBOp(OEq, ERef(RefId(Id("""s"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), ILet(Id("""position"""), ERef(RefProp(RefId(Id("""O""")), EStr("""StringIteratorNextIndex""")))), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""s""")), EStr("""length""")))), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""position"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IAssign(RefProp(RefId(Id("""O""")), EStr("""IteratedString""")), EUndef), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""CodePointAt"""))), List(ERef(RefId(Id("""s"""))), ERef(RefId(Id("""position"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""cp"""), ERef(RefId(Id("""__x7__""")))), ILet(Id("""resultString"""), ENotSupported("""StringOp""")), IAssign(RefProp(RefId(Id("""O""")), EStr("""StringIteratorNextIndex""")), EBOp(OPlus, ERef(RefId(Id("""position"""))), ERef(RefProp(RefId(Id("""cp""")), EStr("""CodeUnitCount"""))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""resultString"""))), EBool(false))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))))
  /* Beautified form:
  "GLOBAL.INTRINSIC_StringIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (|| (= O["IteratedString"] absent) (= O["StringIteratorNextIndex"] absent)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let s = O["IteratedString"]
    if (= s undefined) {
      app __x3__ = (CreateIterResultObject undefined true)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    let position = O["StringIteratorNextIndex"]
    let len = s["length"]
    if (! (< position len)) {
      O["IteratedString"] = undefined
      app __x5__ = (CreateIterResultObject undefined true)
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    app __x7__ = (CodePointAt s position)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let cp = __x7__
    let resultString = !!! "StringOp"
    O["StringIteratorNextIndex"] = (+ position cp["CodeUnitCount"])
    app __x8__ = (CreateIterResultObject resultString false)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
