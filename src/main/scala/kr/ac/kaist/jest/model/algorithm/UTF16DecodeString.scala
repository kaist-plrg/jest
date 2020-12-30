package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object UTF16DecodeString extends Algorithm {
  val name: String = "UTF16DecodeString"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UTF16DecodeString" (string) => {
    let codePoints = (new [])
    let size = string["length"]
    let position = 0i
    while (< position size) {
      app __x0__ = (CodePointAt string position)
      if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let cp = __x0__
      append cp["CodePoint"] -> codePoints
      position = (+ position cp["CodeUnitCount"])
    }
    return codePoints
  }"""), this)
}
