package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrowFunction0HasName0 extends Algorithm {
  val name: String = "ArrowFunction0HasName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrowFunction0HasName0" (this, ArrowParameters, ConciseBody) => return false"""), this)
}
