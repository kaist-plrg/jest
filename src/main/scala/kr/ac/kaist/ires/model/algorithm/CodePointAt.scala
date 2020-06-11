package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CodePointAt extends Algorithm {
  val name: String = "CodePointAt"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CodePointAt" (string, position) => ??? "CodePointAt""""), this)
}
