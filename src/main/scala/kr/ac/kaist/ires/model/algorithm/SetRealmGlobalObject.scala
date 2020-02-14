package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetRealmGlobalObject {
  val length: Int = 3
  val func: Func = Func("""SetRealmGlobalObject""", List(Id("""realmRec"""), Id("""globalObj"""), Id("""thisValue""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""globalObj"""))), EUndef), ISeq(List(ILet(Id("""intrinsics"""), ERef(RefProp(RefId(Id("""realmRec""")), EStr("""Intrinsics""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefProp(RefId(Id("""intrinsics""")), EStr("""INTRINSIC_ObjectPrototype"""))))), IAssign(RefId(Id("""globalObj""")), ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""thisValue"""))), EUndef), IAssign(RefId(Id("""thisValue""")), ERef(RefId(Id("""globalObj""")))), ISeq(List())), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalObject""")), ERef(RefId(Id("""globalObj""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewGlobalEnvironment"""))), List(ERef(RefId(Id("""globalObj"""))), ERef(RefId(Id("""thisValue"""))))), ILet(Id("""newGlobalEnv"""), ERef(RefId(Id("""__x1__""")))), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalEnv""")), ERef(RefId(Id("""newGlobalEnv""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""realmRec"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "SetRealmGlobalObject" (realmRec, globalObj, thisValue) => {
    if (= globalObj undefined) {
      let intrinsics = realmRec["Intrinsics"]
      app __x0__ = (ObjectCreate intrinsics["INTRINSIC_ObjectPrototype"])
      globalObj = __x0__
    } else {}
    if (= thisValue undefined) thisValue = globalObj else {}
    realmRec["GlobalObject"] = globalObj
    app __x1__ = (NewGlobalEnvironment globalObj thisValue)
    let newGlobalEnv = __x1__
    realmRec["GlobalEnv"] = newGlobalEnv
    app __x2__ = (WrapCompletion realmRec)
    return __x2__
  }
  */
}
