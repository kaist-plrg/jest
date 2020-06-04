package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetThisEnvironment extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetThisEnvironment" () => {
    let lex = GLOBAL_context["LexicalEnvironment"]
    while true {
      let envRec = lex["EnvironmentRecord"]
      app __x0__ = (envRec["HasThisBinding"] envRec)
      let exists = __x0__
      if (= exists true) {
        app __x1__ = (WrapCompletion envRec)
        return __x1__
      } else {}
      let outer = lex["Outer"]
      assert (! (= outer null))
      lex = outer
    }
  }"""))
}
