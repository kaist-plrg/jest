package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTfromCharCode {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.fromCharCode""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""codeUnits""")), EStr("""length""")))), ILet(Id("""elements"""), EList(List())), ILet(Id("""nextIndex"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""nextIndex"""))), ERef(RefId(Id("""length""")))), ISeq(List(ILet(Id("""next"""), ERef(RefProp(RefId(Id("""codeUnits""")), ERef(RefId(Id("""nextIndex""")))))), IApp(Id("""__x0__"""), ERef(RefId(Id("""ToUint16"""))), List(ERef(RefId(Id("""next"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""nextCU"""), ERef(RefId(Id("""__x0__""")))), IAppend(ERef(RefId(Id("""nextCU"""))), ERef(RefId(Id("""elements""")))), IAssign(RefId(Id("""nextIndex""")), EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), EINum(1L)))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""StringOp"""))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "GLOBAL.String.fromCharCode" (this, argumentsList, NewTarget) => {
    !!! "Etc"
    let length = codeUnits["length"]
    let elements = (new [])
    let nextIndex = 0i
    while (< nextIndex length) {
      let next = codeUnits[nextIndex]
      app __x0__ = (ToUint16 next)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let nextCU = __x0__
      append nextCU -> elements
      nextIndex = (+ nextIndex 1i)
    }
    app __x1__ = (WrapCompletion !!! "StringOp")
    return __x1__
  }
  */
}
