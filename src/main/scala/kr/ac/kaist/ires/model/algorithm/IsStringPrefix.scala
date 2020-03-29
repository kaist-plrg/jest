package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsStringPrefix {
  val length: Int = 2
  val func: Func = parseFunc(""""IsStringPrefix" (p, q) => {
    app __x0__ = (Type p)
    assert (= __x0__ String)
    app __x1__ = (Type q)
    assert (= __x1__ String)
    !!! "Etc"
  }""")
}
