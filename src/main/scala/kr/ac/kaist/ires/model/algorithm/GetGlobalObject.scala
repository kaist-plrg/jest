package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetGlobalObject {
  val length: Int = 0
  val func: Func = Func("""GetGlobalObject""", List(), None, ISeq(List(ILet(Id("""ctx"""), ERef(RefId(Id("""GLOBAL_context""")))), ILet(Id("""currentRealm"""), ERef(RefProp(RefId(Id("""ctx""")), EStr("""Realm""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""currentRealm""")), EStr("""GlobalObject"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "GetGlobalObject" () => {
    let ctx = GLOBAL_context
    let currentRealm = ctx["Realm"]
    app __x0__ = (WrapCompletion currentRealm["GlobalObject"])
    return __x0__
  }
  */
}
