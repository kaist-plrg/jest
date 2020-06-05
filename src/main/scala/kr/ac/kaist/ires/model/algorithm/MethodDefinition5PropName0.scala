package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition5PropName0 extends Algorithm {
  val name: String = "MethodDefinition5PropName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MethodDefinition5PropName0" (this, PropertyName, PropertySetParameterList, FunctionBody) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }"""), this)
}
