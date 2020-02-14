package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ScriptBody0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""ScriptBody0LexicallyDeclaredNames0""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelLexicallyDeclaredNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "ScriptBody0LexicallyDeclaredNames0" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelLexicallyDeclaredNames")
    return __x0__
  }
  */
}
