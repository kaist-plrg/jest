package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UTF16Encoding {
  val length: Int = 1
  val func: Func = parseFunc(""""UTF16Encoding" (cp) => {
    assert (&& (! (< cp 0i)) (! (< 1114111i cp)))
    if (! (< 65535i cp)) return cp else {}
    app __x0__ = (floor (/ (- cp 65536i) 1024i))
    let cu1 = (+ __x0__ 55296i)
    let cu2 = (+ (%% (- cp 65536i) 1024i) 56320i)
    !!! "Etc"
  }""")
}
