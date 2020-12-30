package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ParseScript extends Algorithm {
  val name: String = "ParseScript"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ParseScript" (sourceText, realm, hostDefined) => {
    let body = script
    app __x0__ = (WrapCompletion (new ScriptRecord("Realm" -> realm, "Environment" -> undefined, "ECMAScriptCode" -> body, "HostDefined" -> hostDefined)))
    return __x0__
  }"""), this)
}
