package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTAsyncFunction extends Algorithm {
  val name: String = "GLOBALDOTAsyncFunction"
  val length: Int = 5
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.AsyncFunction" (this, argumentsList, NewTarget) => {
    let C = GLOBAL_context["Function"]
    let args = argumentsList
    app __x0__ = (CreateDynamicFunction C NewTarget CONST_async args)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
