package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateRealm {
  val length: Int = 0
  val func: Func = Func("""CreateRealm""", List(), None, ISeq(List(ILet(Id("""realmRec"""), ERef(RefId(Id("""REALM""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateIntrinsics"""))), List(ERef(RefId(Id("""realmRec"""))))), IExpr(ERef(RefId(Id("""__x0__""")))), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalObject""")), EUndef), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalEnv""")), EUndef), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""TemplateMap""")), EList(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""realmRec"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "CreateRealm" () => {
    let realmRec = REALM
    app __x0__ = (CreateIntrinsics realmRec)
    __x0__
    realmRec["GlobalObject"] = undefined
    realmRec["GlobalEnv"] = undefined
    realmRec["TemplateMap"] = (new [])
    app __x1__ = (WrapCompletion realmRec)
    return __x1__
  }
  */
}
