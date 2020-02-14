package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object floor {
  val func: Func = parseFunc(""""floor" (a) => {
    return (- a (% a 1))
  }""")
}
