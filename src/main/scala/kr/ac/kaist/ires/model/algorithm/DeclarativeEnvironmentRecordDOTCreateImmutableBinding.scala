package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTCreateImmutableBinding {
  val length: Int = 2
  val func: Func = Func("""DeclarativeEnvironmentRecord.CreateImmutableBinding""", List(Id("""this"""), Id("""N"""), Id("""S""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))), IAssign(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EMap(Ty("""ImmutableBinding"""), List((EStr("""initialized"""), EBool(false)), (EStr("""strict"""), ERef(RefId(Id("""S"""))))))), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.CreateImmutableBinding" (this, N, S) => {
    let envRec = this
    envRec["SubMap"][N] = (new ImmutableBinding("initialized" -> false, "strict" -> S))
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
