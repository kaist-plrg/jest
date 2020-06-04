package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Decode extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""Decode" (string, reservedSet) => {
    let strLen = string["length"]
    let R = ""
    let k = 0i
    while true {
      if (= k strLen) {
        app __x0__ = (WrapCompletion R)
        return __x0__
      } else {}
      !!! "Etc"
      if (! (= C "%")) let S = !!! "StringOp" else {
        let start = k
        !!! "Etc"
        !!! "Etc"
        !!! "Etc"
        k = (+ k 2i)
        if !!! "NumberOp" {
          !!! "Etc"
          if (! (contains reservedSet C)) let S = !!! "StringOp" else !!! "Etc"
        } else {
          !!! "Etc"
          if (|| (= n 1i) (< 4i n)) {
            app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_URIErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x1__
          } else {}
          !!! "Etc"
          Octets[0i] = B
          !!! "Etc"
          let j = 1i
          while (< j n) {
            k = (+ k 1i)
            !!! "Etc"
            !!! "Etc"
            !!! "Etc"
            !!! "Etc"
            k = (+ k 2i)
            Octets[j] = B
            j = (+ j 1i)
          }
          !!! "Etc"
          !!! "Etc"
          let S = !!! "StringOp"
        }
      }
      R = (+ R S)
      k = (+ k 1i)
    }
  }""")
}
