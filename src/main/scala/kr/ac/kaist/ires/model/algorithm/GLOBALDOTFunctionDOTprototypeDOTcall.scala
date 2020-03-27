package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFunctionDOTprototypeDOTcall {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Function.prototype.call""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""func"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""func"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), ILet(Id("""argList"""), EList(List())), IIf(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))), IExpr(EPop(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ISeq(List())), IAssign(RefId(Id("""argList""")), ERef(RefId(Id("""argumentsList""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""PrepareForTailCall"""))), List()), IExpr(ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""thisArg"""))), ERef(RefId(Id("""argList"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "GLOBAL.Function.prototype.call" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let thisArg = __x0__
    let func = this
    app __x1__ = (IsCallable func)
    if (= __x1__ false) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let argList = (new [])
    if (< 0i argumentsList["length"]) (pop argumentsList 0i) else {}
    argList = argumentsList
    app __x3__ = (PrepareForTailCall )
    __x3__
    app __x4__ = (Call func thisArg argList)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
