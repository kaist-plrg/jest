package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IntegerIndexedExoticObjectDOTOwnPropertyKeys extends Algorithm {
  val name: String = "IntegerIndexedExoticObjectDOTOwnPropertyKeys"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IntegerIndexedExoticObject.OwnPropertyKeys" (O) => {
    !!! "IntegerIndexedExoticObject"
    let keys = (new [])
    let len = O["ArrayLength"]
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion keys)
    return __x0__
  }"""), this)
}
