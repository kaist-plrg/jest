package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NormalCompletion extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""NormalCompletion" (argument) => {
    return (new Completion(
      "Type" -> CONST_normal,
      "Value" -> argument,
      "Target" -> CONST_empty
    ))
  }""")
}
