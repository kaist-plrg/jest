package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StringExoticObjectDOTOwnPropertyKeys extends Algorithm {
  val name: String = "StringExoticObjectDOTOwnPropertyKeys"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StringExoticObject.OwnPropertyKeys" (O) => {
    let keys = (new [])
    let str = O["StringData"]
    app __x0__ = (Type str)
    assert (= __x0__ String)
    let len = str["length"]
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x1__ = (WrapCompletion keys)
    return __x1__
  }"""), this)
}
