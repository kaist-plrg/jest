package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetSubstitution extends Algorithm {
  val name: String = "GetSubstitution"
  val length: Int = 6
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GetSubstitution" (matched, str, position, captures, namedCaptures, replacement) => {
    !!! "GetSubstitution"
    app __x0__ = (Type matched)
    assert (= __x0__ String)
    let matchLength = matched["length"]
    app __x1__ = (Type str)
    assert (= __x1__ String)
    let stringLength = str["length"]
    app __x2__ = (IsNonNegativeInteger position)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    assert (= __x2__ true)
    assert (! (< stringLength position))
    app __x3__ = (Type replacement)
    assert (= __x3__ String)
    let tailPos = (+ position matchLength)
    let m = captures["length"]
    !!! "Let id:{result} be the String value derived from id:{replacement} by copying code unit elements from id:{replacement} to id:{result} while performing replacements as specified in Table 52 . These code:{$} replacements are done left - to - right , and , once such a replacement is performed , the new replacement text is not subject to further replacements ."
    app __x4__ = (WrapCompletion result)
    return __x4__
  }"""), this)
}
