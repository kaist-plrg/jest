package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToPrimitive {
  val length: Int = 1
  val func: Func = Func("""ToPrimitive""", List(Id("""input"""), Id("""PreferredType""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""input"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object""")))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""PreferredType"""))), EAbsent), ILet(Id("""hint"""), EStr("""default""")), IIf(EBOp(OEq, ERef(RefId(Id("""PreferredType"""))), ERef(RefId(Id("""String""")))), ILet(Id("""hint"""), EStr("""string""")), ILet(Id("""hint"""), EStr("""number""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""input"""))), ERef(RefId(Id("""SYMBOL_toPrimitive"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""exoticToPrim"""), ERef(RefId(Id("""__x1__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""exoticToPrim"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""exoticToPrim"""))), ERef(RefId(Id("""input"""))), EList(List(ERef(RefId(Id("""hint"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""result"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""hint"""))), EStr("""default""")), IAssign(RefId(Id("""hint""")), EStr("""number""")), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""OrdinaryToPrimitive"""))), List(ERef(RefId(Id("""input"""))), ERef(RefId(Id("""hint"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""input"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "ToPrimitive" (input, PreferredType) => {
    app __x0__ = (Type input)
    if (= __x0__ Object) {
      if (= PreferredType absent) let hint = "default" else if (= PreferredType String) let hint = "string" else let hint = "number"
      app __x1__ = (GetMethod input SYMBOL_toPrimitive)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let exoticToPrim = __x1__
      if (! (= exoticToPrim undefined)) {
        app __x2__ = (Call exoticToPrim input (new [hint]))
        if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let result = __x2__
        app __x3__ = (Type result)
        if (! (= __x3__ Object)) {
          app __x4__ = (WrapCompletion result)
          return __x4__
        } else {}
        app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x5__
      } else {}
      if (= hint "default") hint = "number" else {}
      app __x6__ = (OrdinaryToPrimitive input hint)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    app __x8__ = (WrapCompletion input)
    return __x8__
  }
  */
}
