package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsStringPrefix extends Algorithm {
  val name: String = "IsStringPrefix"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IsStringPrefix" (p, q) => {
    !!! "IsStringPrefix"
    app __x0__ = (Type p)
    assert (= __x0__ String)
    app __x1__ = (Type q)
    assert (= __x1__ String)
    !!! "Etc"
  }"""), this)
}
