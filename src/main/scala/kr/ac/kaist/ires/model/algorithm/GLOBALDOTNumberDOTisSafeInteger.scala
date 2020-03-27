package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTisSafeInteger {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.isSafeInteger""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""number"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""abs"""))), List(ERef(RefId(Id("""number"""))))), IIf(EUOp(ONot, EBOp(OLt, EBOp(OSub, EINum(9007199254740992L), EINum(1L)), ERef(RefId(Id("""__x2__"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "GLOBAL.Number.isSafeInteger" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let number = __x0__
    app __x1__ = (IsInteger number)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    if (= __x1__ true) {
      app __x2__ = (abs number)
      if (! (< (- 9007199254740992i 1i) __x2__)) {
        app __x3__ = (WrapCompletion true)
        return __x3__
      } else {}
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }
  */
}
