package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryToPrimitive {
  val length: Int = 2
  val func: Func = Func("""OrdinaryToPrimitive""", List(Id("""O"""), Id("""hint""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""hint"""))), EStr("""string""")), ILet(Id("""methodNames"""), EList(List(EStr("""toString"""), EStr("""valueOf""")))), ILet(Id("""methodNames"""), EList(List(EStr("""valueOf"""), EStr("""toString"""))))), ILet(Id("""__x1__"""), ERef(RefId(Id("""methodNames""")))), ILet(Id("""__x2__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""name"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""method"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""method"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""method"""))), ERef(RefId(Id("""O"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""result"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())))), ISeq(List())), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L)))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "OrdinaryToPrimitive" (O, hint) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    if (= hint "string") let methodNames = (new ["toString", "valueOf"]) else let methodNames = (new ["valueOf", "toString"])
    let __x1__ = methodNames
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let name = __x1__[__x2__]
      app __x3__ = (Get O name)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let method = __x3__
      app __x4__ = (IsCallable method)
      if (= __x4__ true) {
        app __x5__ = (Call method O)
        if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        let result = __x5__
        app __x6__ = (Type result)
        if (! (= __x6__ Object)) {
          app __x7__ = (WrapCompletion result)
          return __x7__
        } else {}
      } else {}
      __x2__ = (+ __x2__ 1i)
    }
    app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x8__
  }
  */
}
