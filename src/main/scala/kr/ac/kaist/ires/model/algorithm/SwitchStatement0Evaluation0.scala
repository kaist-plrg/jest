package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SwitchStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""SwitchStatement0Evaluation0""", List(Id("""this"""), Id("""Expression"""), Id("""CaseBlock""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""switchValue"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""oldEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""oldEnv"""))))), ILet(Id("""blockEnv"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""BlockDeclarationInstantiation"""))), List(ERef(RefId(Id("""CaseBlock"""))), ERef(RefId(Id("""blockEnv"""))))), IExpr(ERef(RefId(Id("""__x3__""")))), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""blockEnv""")))), IAccess(Id("""__x4__"""), ERef(RefId(Id("""CaseBlock"""))), EStr("""CaseBlockEvaluation""")), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""switchValue"""))))), ILet(Id("""R"""), ERef(RefId(Id("""__x5__""")))), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""R"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "SwitchStatement0Evaluation0" (this, Expression, CaseBlock) => {
    access __x0__ = (Expression "Evaluation")
    let exprRef = __x0__
    app __x1__ = (GetValue exprRef)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let switchValue = __x1__
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x2__ = (NewDeclarativeEnvironment oldEnv)
    let blockEnv = __x2__
    app __x3__ = (BlockDeclarationInstantiation CaseBlock blockEnv)
    __x3__
    GLOBAL_context["LexicalEnvironment"] = blockEnv
    access __x4__ = (CaseBlock "CaseBlockEvaluation")
    app __x5__ = (__x4__ switchValue)
    let R = __x5__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x6__ = (WrapCompletion R)
    return __x6__
  }
  */
}
