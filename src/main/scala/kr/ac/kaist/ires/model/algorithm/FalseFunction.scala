package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FalseFunction {
  val func: Func = parseFunc(""""FalseFunction" () => return false""")
}
