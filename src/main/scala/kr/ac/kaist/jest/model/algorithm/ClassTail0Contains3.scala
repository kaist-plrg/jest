package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ClassTail0Contains3 extends Algorithm {
  val name: String = "ClassTail0Contains3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassTail0Contains3" (this, ClassHeritage, ClassBody, symbol) => {
    if (is-instance-of symbol ClassBody) return true else {}
    if (is-instance-of symbol ClassHeritage) if (! (= ClassHeritage absent)) return true else return false else {}
    if (= ClassHeritage absent) let inHeritage = false
    else {
      access __x0__ = (ClassHeritage "Contains")
      app __x1__ = (__x0__ symbol)
      let inHeritage = __x1__
    }
    if (= inHeritage true) return true else {}
    if (= ClassBody absent) return false
    else {
      access __x2__ = (ClassBody "ComputedPropertyContains")
      app __x3__ = (__x2__ symbol)
      return __x3__
    }
  }"""), this)
}
