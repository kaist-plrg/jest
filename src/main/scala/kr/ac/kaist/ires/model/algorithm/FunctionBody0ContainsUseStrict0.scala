package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionBody0ContainsUseStrict0 extends Algorithm {
  val name: String = "FunctionBody0ContainsUseStrict0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionBody0ContainsUseStrict0" (this, FunctionStatementList) => !!! "If the Directive Prologue of this contains a Use Strict Directive , return value:{true} ; otherwise , return value:{false} .""""), this)
}
