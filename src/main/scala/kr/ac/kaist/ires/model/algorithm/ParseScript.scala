package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ParseScript {
  val length: Int = 3
  val func: Func = Func("""ParseScript""", List(Id("""sourceText"""), Id("""realm"""), Id("""hostDefined""")), None, ISeq(List(ILet(Id("""body"""), ERef(RefId(Id("""script""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""ScriptRecord"""), List((EStr("""Realm"""), ERef(RefId(Id("""realm""")))), (EStr("""Environment"""), EUndef), (EStr("""ECMAScriptCode"""), ERef(RefId(Id("""body""")))), (EStr("""HostDefined"""), ERef(RefId(Id("""hostDefined""")))))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "ParseScript" (sourceText, realm, hostDefined) => {
    let body = script
    app __x0__ = (WrapCompletion (new ScriptRecord("Realm" -> realm, "Environment" -> undefined, "ECMAScriptCode" -> body, "HostDefined" -> hostDefined)))
    return __x0__
  }
  */
}
