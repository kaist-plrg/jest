package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ReturnCaptured extends Algorithm {
  val name: String = "ReturnCaptured"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""ReturnCaptured" (F) => return F.Captured"""), this)
}