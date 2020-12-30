package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object HostPrint extends Algorithm {
  val name: String = "HostPrint"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""HostPrint" (this, argumentsList, NewTarget) => {
    app str = (GetArgument argumentsList 0i)
    app str = (ToString str)
    ? str
    print str
    return undefined
  }"""), this)
}
