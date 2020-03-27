package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LexicalDeclaration0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LexicalDeclaration0Evaluation0""", List(Id("""this"""), Id("""LetOrConst"""), Id("""BindingList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingList"""))), EStr("""Evaluation""")), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))), IIf(EIsCompletion(ERef(RefId(Id("""next""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""next"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""next""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "LexicalDeclaration0Evaluation0" (this, LetOrConst, BindingList) => {
    access __x0__ = (BindingList "Evaluation")
    let next = __x0__
    if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
    next
    app __x1__ = (NormalCompletion CONST_empty)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
