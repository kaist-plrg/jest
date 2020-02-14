package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MulOperation {
  val func: Func = Func("MulOperation", List(Id("op"), Id("lnum"), Id("rnum")), None, parseInst(
    s"""if (= op "*") {
          return ( * lnum rnum )
        } else if (= op "/") {
          return ( / lnum rnum )
        } else if (= op "%") {
          return ( % lnum rnum )
        } else {
          return undefined
        }"""
  ))
}
