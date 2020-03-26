package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTGeneratorResume {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.GeneratorResume""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GeneratorValidate"""))), List(ERef(RefId(Id("""generator"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""state"""), ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IAssert(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedStart""")), EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedYield""")))), ILet(Id("""genContext"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""GeneratorContext""")))), ILet(Id("""methodContext"""), ERef(RefId(Id("""GLOBAL_context""")))), IAssign(RefId(Id("""GLOBAL_context""")), ENull), IAssign(RefId(Id("""methodContext""")), ENull), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""executing""")), IAppend(ERef(RefId(Id("""genContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""value"""))))), IWithCont(Id("""__x6__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")), EList(List())), ISeq(List())), IAppend(ERef(RefId(Id("""__x6__"""))), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")))), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""__x5__""")))))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))))
  /* Beautified form:
  "GLOBAL.GeneratorResume" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    app __x2__ = (GeneratorValidate generator)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let state = __x2__
    if (= state "completed") {
      app __x3__ = (CreateIterResultObject undefined true)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    assert (|| (= state "suspendedStart") (= state "suspendedYield"))
    let genContext = generator["GeneratorContext"]
    let methodContext = GLOBAL_context
    GLOBAL_context = null
    methodContext = null
    generator["GeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x5__ = (NormalCompletion value)
    withcont __x6__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x6__ -> genContext["ReturnCont"]
      app __x7__ = (genContext["ResumeCont"] __x5__)
    }
    app __x8__ = (Completion result)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
