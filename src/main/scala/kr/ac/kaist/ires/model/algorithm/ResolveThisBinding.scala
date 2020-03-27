package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ResolveThisBinding {
  val length: Int = 0
  val func: Func = Func("""ResolveThisBinding""", List(), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()), ILet(Id("""envRec"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""GetThisBinding"""))), List(ERef(RefId(Id("""envRec"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "ResolveThisBinding" () => {
    app __x0__ = (GetThisEnvironment )
    let envRec = __x0__
    app __x1__ = (envRec["GetThisBinding"] envRec)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
