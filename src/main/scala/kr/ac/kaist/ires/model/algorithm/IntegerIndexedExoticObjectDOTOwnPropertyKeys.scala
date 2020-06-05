package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedExoticObjectDOTOwnPropertyKeys extends Algorithm {
  val name: String = "IntegerIndexedExoticObjectDOTOwnPropertyKeys"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IntegerIndexedExoticObject.OwnPropertyKeys" (O) => {
    let keys = (new [])
    let len = O["ArrayLength"]
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion keys)
    return __x0__
  }"""), this)
}
