package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CodePointAt {
  val length: Int = 2
  val func: Func = parseFunc(""""CodePointAt" (string, position) => {
    let size = string["length"]
    assert (&& (! (< position 0i)) (< position size))
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (UTF16DecodeSurrogatePair first second)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    cp = __x0__
    return (new Record("CodePoint" -> cp, "CodeUnitCount" -> 2i, "IsUnpairedSurrogate" -> false))
  }""")
}
