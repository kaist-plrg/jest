package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetSubstitution extends Algorithm {
  val length: Int = 6
  val lang: Boolean = false
  val func: Func = parseFunc(""""GetSubstitution" (matched, str, position, captures, namedCaptures, replacement) => {
    app __x0__ = (Type matched)
    assert (= __x0__ String)
    let matchLength = matched["length"]
    app __x1__ = (Type str)
    assert (= __x1__ String)
    let stringLength = str["length"]
    assert (! (< stringLength position))
    app __x2__ = (Type replacement)
    assert (= __x2__ String)
    let tailPos = (+ position matchLength)
    let m = captures["length"]
    if (! (= namedCaptures undefined)) {
      app __x3__ = (ToObject namedCaptures)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      namedCaptures = __x3__
    } else {}
    !!! "Etc"
    app __x4__ = (WrapCompletion result)
    return __x4__
  }""")
}
