package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement4LabelledEvaluation3 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement4LabelledEvaluation3""", List(Id("""this"""), Id("""LexicalDeclaration"""), Id("""Expression0"""), Id("""Expression1"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(ILet(Id("""oldEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""oldEnv"""))))), ILet(Id("""loopEnv"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""loopEnvRec"""), ERef(RefProp(RefId(Id("""loopEnv""")), EStr("""EnvironmentRecord""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""LexicalDeclaration"""))), EStr("""IsConstantDeclaration""")), ILet(Id("""isConst"""), ERef(RefId(Id("""__x1__""")))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""LexicalDeclaration"""))), EStr("""BoundNames""")), ILet(Id("""boundNames"""), ERef(RefId(Id("""__x2__""")))), ILet(Id("""__x3__"""), ERef(RefId(Id("""boundNames""")))), ILet(Id("""__x4__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""length""")))), ISeq(List(ILet(Id("""dn"""), ERef(RefProp(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x4__""")))))), IIf(EBOp(OEq, ERef(RefId(Id("""isConst"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""loopEnvRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""loopEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(true))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x5__""")))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""loopEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""loopEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(false))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x6__"""))))))), IAssign(RefId(Id("""__x4__""")), EBOp(OPlus, ERef(RefId(Id("""__x4__"""))), EINum(1L)))))), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""loopEnv""")))), IAccess(Id("""__x7__"""), ERef(RefId(Id("""LexicalDeclaration"""))), EStr("""Evaluation""")), ILet(Id("""forDcl"""), ERef(RefId(Id("""__x7__""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""forDcl"""))))), IIf(ERef(RefId(Id("""__x8__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))), IApp(Id("""__x9__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""forDcl"""))))), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""isConst"""))), EBool(false)), ILet(Id("""perIterationLets"""), ERef(RefId(Id("""boundNames""")))), ILet(Id("""perIterationLets"""), EList(List()))), IApp(Id("""__x11__"""), ERef(RefId(Id("""ForBodyEvaluation"""))), List(ERef(RefId(Id("""Expression0"""))), ERef(RefId(Id("""Expression1"""))), ERef(RefId(Id("""Statement"""))), ERef(RefId(Id("""perIterationLets"""))), ERef(RefId(Id("""labelSet"""))))), ILet(Id("""bodyResult"""), ERef(RefId(Id("""__x11__""")))), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))), IApp(Id("""__x12__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""bodyResult"""))))), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))), IReturn(ERef(RefId(Id("""__x13__""")))))))
  /* Beautified form:
  "IterationStatement4LabelledEvaluation3" (this, LexicalDeclaration, Expression0, Expression1, Statement, labelSet) => {
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment oldEnv)
    let loopEnv = __x0__
    let loopEnvRec = loopEnv["EnvironmentRecord"]
    access __x1__ = (LexicalDeclaration "IsConstantDeclaration")
    let isConst = __x1__
    access __x2__ = (LexicalDeclaration "BoundNames")
    let boundNames = __x2__
    let __x3__ = boundNames
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let dn = __x3__[__x4__]
      if (= isConst true) {
        app __x5__ = (loopEnvRec["CreateImmutableBinding"] loopEnvRec dn true)
        if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        __x5__
      } else {
        app __x6__ = (loopEnvRec["CreateMutableBinding"] loopEnvRec dn false)
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        __x6__
      }
      __x4__ = (+ __x4__ 1i)
    }
    GLOBAL_context["LexicalEnvironment"] = loopEnv
    access __x7__ = (LexicalDeclaration "Evaluation")
    let forDcl = __x7__
    app __x8__ = (IsAbruptCompletion forDcl)
    if __x8__ {
      GLOBAL_context["LexicalEnvironment"] = oldEnv
      app __x9__ = (Completion forDcl)
      app __x10__ = (WrapCompletion __x9__)
      return __x10__
    } else {}
    if (= isConst false) let perIterationLets = boundNames else let perIterationLets = (new [])
    app __x11__ = (ForBodyEvaluation Expression0 Expression1 Statement perIterationLets labelSet)
    let bodyResult = __x11__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x12__ = (Completion bodyResult)
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }
  */
}
