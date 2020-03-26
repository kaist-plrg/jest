package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncGeneratorStart {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.AsyncGeneratorStart""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""generatorBody"""), ERef(RefId(Id("""__x1__""")))), IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState"""))), EUndef)), ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""generatorBody"""))), EStr("""Evaluation""")), ILet(Id("""result"""), ERef(RefId(Id("""__x2__""")))), IAccess(Id("""__ret__"""), ERef(RefId(Id("""genContext"""))), EStr("""ReturnCont""")), IAssign(RefId(Id("""__ret__""")), EPop(ERef(RefId(Id("""__ret__"""))), EINum(0L))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x3__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x3__"""))))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal"""))))), ILet(Id("""resultValue"""), EUndef), ISeq(List(ILet(Id("""resultValue"""), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""AsyncGeneratorReject"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""resultValue"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List()))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""resultValue"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorContext""")), ERef(RefId(Id("""genContext""")))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""suspendedStart""")), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")), EList(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "GLOBAL.AsyncGeneratorStart" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let generatorBody = __x1__
    assert (= generator["AsyncGeneratorState"] undefined)
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
      generator["AsyncGeneratorState"] = "completed"
      if (&& (= (typeof result) "Completion") (= result["Type"] CONST_normal)) let resultValue = undefined else {
        let resultValue = result["Value"]
        if (! (= result["Type"] CONST_return)) {
          app __x4__ = (AsyncGeneratorReject generator resultValue)
          if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
          app __x5__ = (WrapCompletion __x4__)
          return __x5__
        } else {}
      }
      app __x6__ = (AsyncGeneratorResolve generator resultValue true)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    }
    generator["AsyncGeneratorContext"] = genContext
    generator["AsyncGeneratorState"] = "suspendedStart"
    generator["AsyncGeneratorQueue"] = (new [])
    app __x8__ = (WrapCompletion undefined)
    return __x8__
  }
  */
}
