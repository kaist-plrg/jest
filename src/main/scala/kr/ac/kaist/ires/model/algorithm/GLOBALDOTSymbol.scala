package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTSymbol {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Symbol""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""description"""), ERef(RefId(Id("""__x0__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""description"""))), EUndef), ILet(Id("""descString"""), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""description"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""descString"""), ERef(RefId(Id("""__x2__"""))))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ESymbol(ERef(RefId(Id("""descString""")))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "GLOBAL.Symbol" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let description = __x0__
    if (! (= NewTarget undefined)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (= description undefined) let descString = undefined else {
      app __x2__ = (ToString description)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let descString = __x2__
    }
    app __x3__ = (WrapCompletion (new 'descString))
    return __x3__
  }
  */
}
