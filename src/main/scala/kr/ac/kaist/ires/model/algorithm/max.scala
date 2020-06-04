package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object max extends Algorithm {
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = parseFunc(""""max" (...args) => {
    let x = 1i
    let len = args.length
    let res = args[0i]
    while (< x len) {
      let v = args[x]
      if (< res v) res = v
      else {}
      x = (+ x 1i)
    }
    return res
  }""")
}
