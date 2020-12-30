package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ReturnCaptured extends Algorithm {
  val name: String = "ReturnCaptured"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""ReturnCaptured" (F) => return F.Captured"""), this)
}
