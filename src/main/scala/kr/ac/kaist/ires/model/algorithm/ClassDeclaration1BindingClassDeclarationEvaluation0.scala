package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassDeclaration1BindingClassDeclarationEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ClassDeclaration1BindingClassDeclarationEvaluation0""", List(Id("""this"""), Id("""ClassTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassTail"""))), EStr("""ClassDefinitionEvaluation""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EUndef, EStr("""default"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))), IAssign(RefProp(RefId(Id("""value""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "ClassDeclaration1BindingClassDeclarationEvaluation0" (this, ClassTail) => {
    access __x0__ = (ClassTail "ClassDefinitionEvaluation")
    app __x1__ = (__x0__ undefined "default")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let value = __x1__
    value["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion value)
    return __x2__
  }
  */
}
