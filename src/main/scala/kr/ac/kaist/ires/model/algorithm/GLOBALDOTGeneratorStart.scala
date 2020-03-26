package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTGeneratorStart {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.GeneratorStart""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""generatorBody"""), ERef(RefId(Id("""__x1__""")))), IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState"""))), EUndef)), ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""generatorBody"""))), EStr("""Evaluation""")), ILet(Id("""result"""), ERef(RefId(Id("""__x2__""")))), IAccess(Id("""__ret__"""), ERef(RefId(Id("""genContext"""))), EStr("""ReturnCont""")), IAssign(RefId(Id("""__ret__""")), EPop(ERef(RefId(Id("""__ret__"""))), EINum(0L))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x3__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x3__"""))))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""completed""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ILet(Id("""resultValue"""), EUndef), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ILet(Id("""resultValue"""), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))), ISeq(List(IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""resultValue"""))), EBool(true))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorContext""")), ERef(RefId(Id("""genContext""")))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""suspendedStart""")), IApp(Id("""__x8__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))))
  /* Beautified form:
  "GLOBAL.GeneratorStart" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let generatorBody = __x1__
    assert (= generator["GeneratorState"] undefined)
    let genContext = GLOBAL_context
    genContext["Generator"] = generator
    genContext["ResumeCont"] = () [=>] {
      access __x2__ = (generatorBody "Evaluation")
      let result = __x2__
      access __ret__ = (genContext "ReturnCont")
      __ret__ = (pop __ret__ 0i)
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
        __x3__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x3__)
      } else {}
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      generator["GeneratorState"] = "completed"
      if (= result["Type"] CONST_normal) let resultValue = undefined else if (= result["Type"] CONST_return) let resultValue = result["Value"] else {
        assert (= result["Type"] CONST_throw)
        app __x4__ = (Completion result)
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      }
      app __x6__ = (CreateIterResultObject resultValue true)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    }
    generator["GeneratorContext"] = genContext
    generator["GeneratorState"] = "suspendedStart"
    app __x8__ = (NormalCompletion undefined)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
