package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Script0IsStrict1 extends Algorithm {
  val name: String = "Script0IsStrict1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Script0IsStrict1" (this, ScriptBody) => return true"""), this)
}
