package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectLiteral0Evaluation0 extends Algorithm {
  val name: String = "ObjectLiteral0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectLiteral0Evaluation0" (this) => {
    app obj = (OrdinaryObjectCreate INTRINSIC_ObjectPrototype)
    app wrapped = (WrapCompletion obj)
    return wrapped
  }"""), this)
}
