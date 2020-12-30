package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CodePointAt extends Algorithm {
  val name: String = "CodePointAt"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CodePointAt" (string, position) => ??? "CodePointAt""""), this)
}
