package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ScriptBody0IsStrict0 extends Algorithm {
  val name: String = "ScriptBody0IsStrict0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ScriptBody0IsStrict0" (this, StatementList) => if true return true else return false"""), this)
}
