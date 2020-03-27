package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsAbruptCompletion {
  val func: Func = parseFunc(""""IsAbruptCompletion" (x) => {
  return (&& (is-completion x) (! (= x.Type CONST_normal)))
  }""")
}
