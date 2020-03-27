package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTeval {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.eval""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""x"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""callerContext"""), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(2L))))), ILet(Id("""callerRealm"""), ERef(RefProp(RefId(Id("""callerContext""")), EStr("""Realm""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""PerformEval"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""callerRealm"""))), EBool(false), EBool(false))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "GLOBAL.eval" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let x = __x0__
    let callerContext = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 2i)]
    let callerRealm = callerContext["Realm"]
    app __x1__ = (PerformEval x callerRealm false false)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
