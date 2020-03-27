package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LexicalBinding0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""LexicalBinding0Evaluation1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")), ILet(Id("""bindingId"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""bindingId"""))))), ILet(Id("""lhs"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Initializer"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""Initializer"""))), EStr("""NamedEvaluation""")), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""bindingId"""))))), ILet(Id("""value"""), ERef(RefId(Id("""__x4__""")))))), ISeq(List(IAccess(Id("""__x5__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")), ILet(Id("""rhs"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rhs"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""value"""), ERef(RefId(Id("""__x6__"""))))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""InitializeReferencedBinding"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""value"""))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "LexicalBinding0Evaluation1" (this, BindingIdentifier, Initializer) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let bindingId = __x0__
    app __x1__ = (ResolveBinding bindingId)
    let lhs = __x1__
    app __x2__ = (IsAnonymousFunctionDefinition Initializer)
    if (= __x2__ true) {
      access __x3__ = (Initializer "NamedEvaluation")
      app __x4__ = (__x3__ bindingId)
      let value = __x4__
    } else {
      access __x5__ = (Initializer "Evaluation")
      let rhs = __x5__
      app __x6__ = (GetValue rhs)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let value = __x6__
    }
    app __x7__ = (InitializeReferencedBinding lhs value)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
