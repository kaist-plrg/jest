package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetArgument extends Algorithm {
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = parseFunc(""""GetArgument" (argumentsList, idx) => {
    let arg = argumentsList[idx]
    if (= arg absent) return undefined
    else return arg
  }""")
}
