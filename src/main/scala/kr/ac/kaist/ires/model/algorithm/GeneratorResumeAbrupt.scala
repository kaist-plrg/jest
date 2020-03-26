package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorResumeAbrupt {
  val length: Int = 2
  val func: Func = Func("""GeneratorResumeAbrupt""", List(Id("""generator"""), Id("""abruptCompletion""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GeneratorValidate"""))), List(ERef(RefId(Id("""generator"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""state"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedStart""")), ISeq(List(IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""completed""")), IAssign(RefId(Id("""state""")), EStr("""completed""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""abruptCompletion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefProp(RefId(Id("""abruptCompletion""")), EStr("""Value"""))), EBool(true))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""abruptCompletion"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IAssert(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedYield"""))), ILet(Id("""genContext"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""GeneratorContext""")))), ILet(Id("""methodContext"""), ERef(RefId(Id("""GLOBAL_context""")))), IAssign(RefId(Id("""GLOBAL_context""")), ENull), IAssign(RefId(Id("""methodContext""")), ENull), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""executing""")), IAppend(ERef(RefId(Id("""genContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IWithCont(Id("""__x5__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")), EList(List())), ISeq(List())), IAppend(ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")))), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""abruptCompletion""")))))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "GeneratorResumeAbrupt" (generator, abruptCompletion) => {
    app __x0__ = (GeneratorValidate generator)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let state = __x0__
    if (= state "suspendedStart") {
      generator["GeneratorState"] = "completed"
      state = "completed"
    } else {}
    if (= state "completed") {
      if (= abruptCompletion["Type"] CONST_return) {
        app __x1__ = (CreateIterResultObject abruptCompletion["Value"] true)
        app __x2__ = (WrapCompletion __x1__)
        return __x2__
      } else {}
      app __x3__ = (Completion abruptCompletion)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    assert (= state "suspendedYield")
    let genContext = generator["GeneratorContext"]
    let methodContext = GLOBAL_context
    GLOBAL_context = null
    methodContext = null
    generator["GeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x5__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x5__ -> genContext["ReturnCont"]
      app __x6__ = (genContext["ResumeCont"] abruptCompletion)
    }
    app __x7__ = (Completion result)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
