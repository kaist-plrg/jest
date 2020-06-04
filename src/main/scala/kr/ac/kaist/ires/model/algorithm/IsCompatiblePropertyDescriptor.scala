package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsCompatiblePropertyDescriptor extends Algorithm {
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = parseFunc(""""IsCompatiblePropertyDescriptor" (Extensible, Desc, Current) => {
    app __x0__ = (ValidateAndApplyPropertyDescriptor undefined undefined Extensible Desc Current)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
