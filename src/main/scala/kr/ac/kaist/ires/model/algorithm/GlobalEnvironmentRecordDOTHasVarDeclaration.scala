package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTHasVarDeclaration {
  val length: Int = 1
  val func: Func = Func("""GlobalEnvironmentRecord.HasVarDeclaration""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))), ILet(Id("""varDeclaredNames"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""VarNames""")))), IIf(EContains(ERef(RefId(Id("""varDeclaredNames"""))), ERef(RefId(Id("""N""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "GlobalEnvironmentRecord.HasVarDeclaration" (this, N) => {
    let envRec = this
    let varDeclaredNames = envRec["VarNames"]
    if (contains varDeclaredNames N) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
