package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IsDuplicate extends Algorithm {
  val name: String = "IsDuplicate"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""IsDuplicate" (list) => {
    let i = 0i
    let len = list.length
    while (< i len) {
      let j = (+ i 1i)
      while (< j len) {
        if (= list[i] list[j]) return true
        else {}
        j = (+ j 1i)
      }
      i = (+ i 1i)
    }
    return false
  }"""), this)
}
