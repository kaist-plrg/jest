package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetRealmGlobalObject {
  val length: Int = 3
  val func: Func = Func("""SetRealmGlobalObject""", List(Id("""realmRec"""), Id("""globalObj"""), Id("""thisValue""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""globalObj"""))), EUndef), ISeq(List(ILet(Id("""intrinsics"""), ERef(RefProp(RefId(Id("""realmRec""")), EStr("""Intrinsics""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefProp(RefId(Id("""intrinsics""")), EStr("""INTRINSIC_ObjectPrototype"""))))), IAssign(RefId(Id("""globalObj""")), ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""globalObj"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""thisValue"""))), EUndef), IAssign(RefId(Id("""thisValue""")), ERef(RefId(Id("""globalObj""")))), ISeq(List())), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalObject""")), ERef(RefId(Id("""globalObj""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""NewGlobalEnvironment"""))), List(ERef(RefId(Id("""globalObj"""))), ERef(RefId(Id("""thisValue"""))))), ILet(Id("""newGlobalEnv"""), ERef(RefId(Id("""__x2__""")))), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalEnv""")), ERef(RefId(Id("""newGlobalEnv""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""realmRec"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "SetRealmGlobalObject" (realmRec, globalObj, thisValue) => {
    if (= globalObj undefined) {
      let intrinsics = realmRec["Intrinsics"]
      app __x0__ = (ObjectCreate intrinsics["INTRINSIC_ObjectPrototype"])
      globalObj = __x0__
    } else {}
    app __x1__ = (Type globalObj)
    assert (= __x1__ Object)
    if (= thisValue undefined) thisValue = globalObj else {}
    realmRec["GlobalObject"] = globalObj
    app __x2__ = (NewGlobalEnvironment globalObj thisValue)
    let newGlobalEnv = __x2__
    realmRec["GlobalEnv"] = newGlobalEnv
    app __x3__ = (WrapCompletion realmRec)
    return __x3__
  }
  */
}
