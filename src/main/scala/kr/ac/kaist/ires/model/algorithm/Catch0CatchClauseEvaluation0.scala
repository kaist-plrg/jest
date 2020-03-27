package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch0CatchClauseEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""Catch0CatchClauseEvaluation0""", List(Id("""this"""), Id("""CatchParameter"""), Id("""Block"""), Id("""thrownValue""")), None, ISeq(List(ILet(Id("""oldEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""oldEnv"""))))), ILet(Id("""catchEnv"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""catchEnvRec"""), ERef(RefProp(RefId(Id("""catchEnv""")), EStr("""EnvironmentRecord""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""CatchParameter"""))), EStr("""BoundNames""")), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""__x3__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""argName"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""catchEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""catchEnvRec"""))), ERef(RefId(Id("""argName"""))), EBool(false))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x4__""")))), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L)))))), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""catchEnv""")))), IAccess(Id("""__x5__"""), ERef(RefId(Id("""CatchParameter"""))), EStr("""BindingInitialization""")), IApp(Id("""__x6__"""), ERef(RefId(Id("""__x5__"""))), List(ERef(RefId(Id("""thrownValue"""))), ERef(RefId(Id("""catchEnv"""))))), ILet(Id("""status"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IAccess(Id("""__x10__"""), ERef(RefId(Id("""Block"""))), EStr("""Evaluation""")), ILet(Id("""B"""), ERef(RefId(Id("""__x10__""")))), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""B"""))))), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))))
  /* Beautified form:
  "Catch0CatchClauseEvaluation0" (this, CatchParameter, Block, thrownValue) => {
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment oldEnv)
    let catchEnv = __x0__
    let catchEnvRec = catchEnv["EnvironmentRecord"]
    access __x1__ = (CatchParameter "BoundNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let argName = __x2__[__x3__]
      app __x4__ = (catchEnvRec["CreateMutableBinding"] catchEnvRec argName false)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      __x3__ = (+ __x3__ 1i)
    }
    GLOBAL_context["LexicalEnvironment"] = catchEnv
    access __x5__ = (CatchParameter "BindingInitialization")
    app __x6__ = (__x5__ thrownValue catchEnv)
    let status = __x6__
    app __x7__ = (IsAbruptCompletion status)
    if __x7__ {
      GLOBAL_context["LexicalEnvironment"] = oldEnv
      app __x8__ = (Completion status)
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    access __x10__ = (Block "Evaluation")
    let B = __x10__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x11__ = (Completion B)
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }
  */
}
