package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreatePerIterationEnvironment {
  val length: Int = 1
  val func: Func = Func("""CreatePerIterationEnvironment""", List(Id("""perIterationBindings""")), None, ISeq(List(IIf(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""perIterationBindings""")), EStr("""length""")))), ISeq(List(ILet(Id("""lastIterationEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))), ILet(Id("""lastIterationEnvRec"""), ERef(RefProp(RefId(Id("""lastIterationEnv""")), EStr("""EnvironmentRecord""")))), ILet(Id("""outer"""), ERef(RefProp(RefId(Id("""lastIterationEnv""")), EStr("""Outer""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""outer"""))))), ILet(Id("""thisIterationEnv"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""thisIterationEnvRec"""), ERef(RefProp(RefId(Id("""thisIterationEnv""")), EStr("""EnvironmentRecord""")))), ILet(Id("""__x1__"""), ERef(RefId(Id("""perIterationBindings""")))), ILet(Id("""__x2__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""bn"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""thisIterationEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""thisIterationEnvRec"""))), ERef(RefId(Id("""bn"""))), EBool(false))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""lastIterationEnvRec""")), EStr("""GetBindingValue"""))), List(ERef(RefId(Id("""lastIterationEnvRec"""))), ERef(RefId(Id("""bn"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""lastValue"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""thisIterationEnvRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""thisIterationEnvRec"""))), ERef(RefId(Id("""bn"""))), ERef(RefId(Id("""lastValue"""))))), IExpr(ERef(RefId(Id("""__x5__""")))), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L)))))), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""thisIterationEnv""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "CreatePerIterationEnvironment" (perIterationBindings) => {
    if (< 0i perIterationBindings["length"]) {
      let lastIterationEnv = GLOBAL_context["LexicalEnvironment"]
      let lastIterationEnvRec = lastIterationEnv["EnvironmentRecord"]
      let outer = lastIterationEnv["Outer"]
      app __x0__ = (NewDeclarativeEnvironment outer)
      let thisIterationEnv = __x0__
      let thisIterationEnvRec = thisIterationEnv["EnvironmentRecord"]
      let __x1__ = perIterationBindings
      let __x2__ = 0i
      while (< __x2__ __x1__["length"]) {
        let bn = __x1__[__x2__]
        app __x3__ = (thisIterationEnvRec["CreateMutableBinding"] thisIterationEnvRec bn false)
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        __x3__
        app __x4__ = (lastIterationEnvRec["GetBindingValue"] lastIterationEnvRec bn true)
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let lastValue = __x4__
        app __x5__ = (thisIterationEnvRec["InitializeBinding"] thisIterationEnvRec bn lastValue)
        __x5__
        __x2__ = (+ __x2__ 1i)
      }
      GLOBAL_context["LexicalEnvironment"] = thisIterationEnv
    } else {}
    app __x6__ = (WrapCompletion undefined)
    return __x6__
  }
  */
}
