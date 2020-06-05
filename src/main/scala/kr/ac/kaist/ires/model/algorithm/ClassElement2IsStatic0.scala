package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElement2IsStatic0 extends Algorithm {
  val name: String = "ClassElement2IsStatic0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassElement2IsStatic0" (this) => return false"""), this)
}
