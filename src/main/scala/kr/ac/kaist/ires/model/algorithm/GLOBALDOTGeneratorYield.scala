package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTGeneratorYield {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.GeneratorYield""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""iterNextObj"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))), ILet(Id("""generator"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetGeneratorKind"""))), List()), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""CONST_sync"""))))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""suspendedYield""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x2__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x2__"""))))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(Id("""resumptionValue""")), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""resumptionValue"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""iterNextObj"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "GLOBAL.GeneratorYield" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterNextObj = __x0__
    let genContext = GLOBAL_context
    let generator = genContext["Generator"]
    app __x1__ = (GetGeneratorKind )
    assert (= __x1__ CONST_sync)
    generator["GeneratorState"] = "suspendedYield"
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
      __x2__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x2__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    genContext["ResumeCont"] = (resumptionValue) [=>] {
      app __x3__ = (WrapCompletion resumptionValue)
      return __x3__
    }
    app __x4__ = (NormalCompletion iterNextObj)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
