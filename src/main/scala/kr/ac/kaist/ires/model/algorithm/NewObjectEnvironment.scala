package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewObjectEnvironment {
  val length: Int = 2
  val func: Func = Func("""NewObjectEnvironment""", List(Id("""O"""), Id("""E""")), None, ISeq(List(ILet(Id("""env"""), EMap(Ty("""LexicalEnvironment"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), ILet(Id("""envRec"""), EMap(Ty("""ObjectEnvironmentRecord"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())), (EStr("""BindingObject"""), ERef(RefId(Id("""O"""))))))), IAssign(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")), ERef(RefId(Id("""envRec""")))), IAssign(RefProp(RefId(Id("""env""")), EStr("""Outer""")), ERef(RefId(Id("""E""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""env"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "NewObjectEnvironment" (O, E) => {
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    let envRec = (new ObjectEnvironmentRecord("SubMap" -> (new SubMap()), "BindingObject" -> O))
    env["EnvironmentRecord"] = envRec
    env["Outer"] = E
    app __x0__ = (WrapCompletion env)
    return __x0__
  }
  */
}
