package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassTail0Contains3 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ClassTail0Contains3" (this, ClassHeritage, ClassBody, symbol) => {
    if (is-instance-of symbol ClassBody) return true else {}
    if (is-instance-of symbol ClassHeritage) if (! (= ClassHeritage absent)) return true else return false else {}
    access __x0__ = (ClassHeritage "Contains")
    app __x1__ = (__x0__ symbol)
    let inHeritage = __x1__
    if (= inHeritage true) return true else {}
    access __x2__ = (ClassBody "ComputedPropertyContains")
    app __x3__ = (__x2__ symbol)
    return __x3__
  }""")
}
