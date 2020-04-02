package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Script0IsStrict1 {
  val length: Int = 0
  val func: Func = parseFunc(""""Script0IsStrict1" (this, ScriptBody) => !!! "If nt:{ScriptBody} is present and the Directive Prologue of nt:{ScriptBody} contains a Use Strict Directive , return value:{true} ; otherwise , return value:{false} ."""")
}
