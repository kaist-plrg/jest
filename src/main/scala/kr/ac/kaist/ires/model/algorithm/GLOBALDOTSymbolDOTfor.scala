package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTSymbolDOTfor {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Symbol.for""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""key"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""stringKey"""), ERef(RefId(Id("""__x1__""")))), IExpr(ENotSupported("""Etc""")), ILet(Id("""newSymbol"""), ESymbol(ERef(RefId(Id("""stringKey"""))))), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""newSymbol"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "GLOBAL.Symbol.for" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    app __x1__ = (ToString key)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let stringKey = __x1__
    !!! "Etc"
    let newSymbol = (new 'stringKey)
    !!! "Etc"
    app __x2__ = (WrapCompletion newSymbol)
    return __x2__
  }
  */
}
