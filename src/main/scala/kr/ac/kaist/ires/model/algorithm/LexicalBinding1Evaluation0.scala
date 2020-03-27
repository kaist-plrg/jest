package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LexicalBinding1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LexicalBinding1Evaluation0""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")), ILet(Id("""rhs"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rhs"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""env"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""BindingInitialization""")), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""env"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "LexicalBinding1Evaluation0" (this, BindingPattern, Initializer) => {
    access __x0__ = (Initializer "Evaluation")
    let rhs = __x0__
    app __x1__ = (GetValue rhs)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let value = __x1__
    let env = GLOBAL_context["LexicalEnvironment"]
    access __x2__ = (BindingPattern "BindingInitialization")
    app __x3__ = (__x2__ value env)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
