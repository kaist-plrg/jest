package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncArrowFunction0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowFunction0Evaluation0""", List(Id("""this"""), Id("""AsyncArrowBindingIdentifier"""), Id("""AsyncConciseBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")), ILet(Id("""scope"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""parameters"""), ERef(RefId(Id("""AsyncArrowBindingIdentifier""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Arrow"""))), ERef(RefId(Id("""parameters"""))), ERef(RefId(Id("""AsyncConciseBody"""))), ERef(RefId(Id("""scope"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""closure"""), ERef(RefId(Id("""__x1__""")))), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "AsyncArrowFunction0Evaluation0" (this, AsyncArrowBindingIdentifier, AsyncConciseBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    let parameters = AsyncArrowBindingIdentifier
    app __x1__ = (AsyncFunctionCreate CONST_Arrow parameters AsyncConciseBody scope)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let closure = __x1__
    closure["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }
  */
}
