package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryCallBindThis {
  val length: Int = 3
  val func: Func = Func("""OrdinaryCallBindThis""", List(Id("""F"""), Id("""calleeContext"""), Id("""thisArgument""")), None, ISeq(List(ILet(Id("""thisMode"""), ERef(RefProp(RefId(Id("""F""")), EStr("""ThisMode""")))), IIf(EBOp(OEq, ERef(RefId(Id("""thisMode"""))), ERef(RefId(Id("""CONST_lexical""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), ILet(Id("""calleeRealm"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Realm""")))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""calleeContext"""))), EStr("""LexicalEnvironment""")), ILet(Id("""localEnv"""), ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""thisMode"""))), ERef(RefId(Id("""CONST_strict""")))), ILet(Id("""thisValue"""), ERef(RefId(Id("""thisArgument""")))), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""thisArgument"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""thisArgument"""))), ENull)), ISeq(List(ILet(Id("""globalEnv"""), ERef(RefProp(RefId(Id("""calleeRealm""")), EStr("""GlobalEnv""")))), ILet(Id("""globalEnvRec"""), ERef(RefProp(RefId(Id("""globalEnv""")), EStr("""EnvironmentRecord""")))), IAssert(EBOp(OEq, ETypeOf(ERef(RefId(Id("""globalEnvRec""")))), EStr("""GlobalEnvironmentRecord"""))), ILet(Id("""thisValue"""), ERef(RefProp(RefId(Id("""globalEnvRec""")), EStr("""GlobalThisValue""")))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""thisArgument"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""thisValue"""), ERef(RefId(Id("""__x3__""")))))))), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""localEnv""")), EStr("""EnvironmentRecord""")))), IAssert(EBOp(OEq, ETypeOf(ERef(RefId(Id("""envRec""")))), EStr("""FunctionEnvironmentRecord"""))), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""BindThisValue"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""thisValue"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "OrdinaryCallBindThis" (F, calleeContext, thisArgument) => {
    let thisMode = F["ThisMode"]
    if (= thisMode CONST_lexical) {
      app __x0__ = (NormalCompletion undefined)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    let calleeRealm = F["Realm"]
    access __x2__ = (calleeContext "LexicalEnvironment")
    let localEnv = __x2__
    if (= thisMode CONST_strict) let thisValue = thisArgument else if (|| (= thisArgument undefined) (= thisArgument null)) {
      let globalEnv = calleeRealm["GlobalEnv"]
      let globalEnvRec = globalEnv["EnvironmentRecord"]
      assert (= (typeof globalEnvRec) "GlobalEnvironmentRecord")
      let thisValue = globalEnvRec["GlobalThisValue"]
    } else {
      app __x3__ = (ToObject thisArgument)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let thisValue = __x3__
    }
    let envRec = localEnv["EnvironmentRecord"]
    assert (= (typeof envRec) "FunctionEnvironmentRecord")
    app __x4__ = (envRec["BindThisValue"] envRec thisValue)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
