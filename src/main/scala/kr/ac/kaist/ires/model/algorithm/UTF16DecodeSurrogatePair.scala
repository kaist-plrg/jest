package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UTF16DecodeSurrogatePair {
  val length: Int = 2
  val func: Func = parseFunc(""""UTF16DecodeSurrogatePair" (lead, trail) => {
    let cp = (+ (+ (* (- lead 55296i) 1024i) (- trail 56320i)) 65536i)
    !!! "Etc"
  }""")
}
