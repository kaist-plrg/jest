package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetDefaultGlobalBindings {
  val length: Int = 1
  val func: Func = Func("""SetDefaultGlobalBindings""", List(Id("""realmRec""")), None, ISeq(List(ILet(Id("""global"""), ERef(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalObject""")))), ILet(Id("""__x0__"""), EKeys(ERef(RefId(Id("""GLOBAL"""))))), ILet(Id("""__x1__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x1__"""))), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x0__""")), ERef(RefId(Id("""__x1__""")))))), ILet(Id("""desc"""), ERef(RefProp(RefId(Id("""GLOBAL""")), ERef(RefId(Id("""name""")))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""global"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""desc"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IAssign(RefId(Id("""__x1__""")), EBOp(OPlus, ERef(RefId(Id("""__x1__"""))), EINum(1L)))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""global"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "SetDefaultGlobalBindings" (realmRec) => {
    let global = realmRec["GlobalObject"]
    let __x0__ = (map-keys GLOBAL)
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let name = __x0__[__x1__]
      let desc = GLOBAL[name]
      app __x2__ = (DefinePropertyOrThrow global name desc)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x1__ = (+ __x1__ 1i)
    }
    app __x3__ = (WrapCompletion global)
    return __x3__
  }
  */
}
