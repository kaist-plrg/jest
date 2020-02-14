package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Completion {
  val func: Func = parseFunc(""""Completion" (argument) => {
    return argument
  }""")
}
