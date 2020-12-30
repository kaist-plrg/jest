package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GlobalEnvironmentRecordDOTHasLexicalDeclaration extends Algorithm {
  val name: String = "GlobalEnvironmentRecordDOTHasLexicalDeclaration"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GlobalEnvironmentRecord.HasLexicalDeclaration" (this, N) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
