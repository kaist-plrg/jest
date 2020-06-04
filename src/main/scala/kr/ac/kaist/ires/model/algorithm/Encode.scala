package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Encode extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""Encode" (string, unescapedSet) => {
    let strLen = string["length"]
    let R = ""
    let k = 0i
    while true {
      if (= k strLen) {
        app __x0__ = (WrapCompletion R)
        return __x0__
      } else {}
      !!! "Etc"
      if (contains unescapedSet C) {
        let S = !!! "StringOp"
        R = (+ R S)
      } else {
        !!! "Etc"
        if !!! "StringOp" !!! "Etc" else {
          k = (+ k 1i)
          if (= k strLen) {
            app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_URIErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x1__
          } else {}
          !!! "Etc"
          !!! "Etc"
          app __x2__ = (UTF16Decode C kChar)
          let V = __x2__
        }
        !!! "Etc"
        let __x3__ = Octets
        let __x4__ = 0i
        while (< __x4__ __x3__["length"]) {
          let octet = __x3__[__x4__]
          !!! "Etc"
          R = (+ R S)
          __x4__ = (+ __x4__ 1i)
        }
      }
      k = (+ k 1i)
    }
  }""")
}
