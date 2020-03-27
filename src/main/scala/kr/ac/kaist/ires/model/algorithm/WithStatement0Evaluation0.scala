package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object WithStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""WithStatement0Evaluation0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")), ILet(Id("""val"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""val"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""__x1__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""obj"""), ERef(RefId(Id("""__x2__""")))), ILet(Id("""oldEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""NewObjectEnvironment"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""oldEnv"""))))), ILet(Id("""newEnv"""), ERef(RefId(Id("""__x3__""")))), IAssign(RefProp(RefProp(RefId(Id("""newEnv""")), EStr("""EnvironmentRecord""")), EStr("""withEnvironment""")), EBool(true)), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""newEnv""")))), IAccess(Id("""__x4__"""), ERef(RefId(Id("""Statement"""))), EStr("""Evaluation""")), ILet(Id("""C"""), ERef(RefId(Id("""__x4__""")))), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""C"""))), EUndef)), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x5__"""))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))))
  /* Beautified form:
  "WithStatement0Evaluation0" (this, Expression, Statement) => {
    access __x0__ = (Expression "Evaluation")
    let val = __x0__
    app __x1__ = (GetValue val)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToObject __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let obj = __x2__
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x3__ = (NewObjectEnvironment obj oldEnv)
    let newEnv = __x3__
    newEnv["EnvironmentRecord"]["withEnvironment"] = true
    GLOBAL_context["LexicalEnvironment"] = newEnv
    access __x4__ = (Statement "Evaluation")
    let C = __x4__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x5__ = (UpdateEmpty C undefined)
    app __x6__ = (Completion __x5__)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
