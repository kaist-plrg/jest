package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewGlobalEnvironment {
  val length: Int = 2
  val func: Func = Func("""NewGlobalEnvironment""", List(Id("""G"""), Id("""thisValue""")), None, ISeq(List(ILet(Id("""env"""), EMap(Ty("""LexicalEnvironment"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), ILet(Id("""objRec"""), EMap(Ty("""ObjectEnvironmentRecord"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())), (EStr("""BindingObject"""), ERef(RefId(Id("""G"""))))))), ILet(Id("""dclRec"""), EMap(Ty("""DeclarativeEnvironmentRecord"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), ILet(Id("""globalRec"""), EMap(Ty("""GlobalEnvironmentRecord"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IAssign(RefProp(RefId(Id("""globalRec""")), EStr("""ObjectRecord""")), ERef(RefId(Id("""objRec""")))), IAssign(RefProp(RefId(Id("""globalRec""")), EStr("""GlobalThisValue""")), ERef(RefId(Id("""thisValue""")))), IAssign(RefProp(RefId(Id("""globalRec""")), EStr("""DeclarativeRecord""")), ERef(RefId(Id("""dclRec""")))), IAssign(RefProp(RefId(Id("""globalRec""")), EStr("""VarNames""")), EList(List())), IAssign(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")), ERef(RefId(Id("""globalRec""")))), IAssign(RefProp(RefId(Id("""env""")), EStr("""Outer""")), ENull), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""env"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "NewGlobalEnvironment" (G, thisValue) => {
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    let objRec = (new ObjectEnvironmentRecord("SubMap" -> (new SubMap()), "BindingObject" -> G))
    let dclRec = (new DeclarativeEnvironmentRecord("SubMap" -> (new SubMap())))
    let globalRec = (new GlobalEnvironmentRecord("SubMap" -> (new SubMap())))
    globalRec["ObjectRecord"] = objRec
    globalRec["GlobalThisValue"] = thisValue
    globalRec["DeclarativeRecord"] = dclRec
    globalRec["VarNames"] = (new [])
    env["EnvironmentRecord"] = globalRec
    env["Outer"] = null
    app __x0__ = (WrapCompletion env)
    return __x0__
  }
  */
}
