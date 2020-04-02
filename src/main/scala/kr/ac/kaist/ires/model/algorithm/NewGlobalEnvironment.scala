package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewGlobalEnvironment {
  val length: Int = 2
  val func: Func = parseFunc(""""NewGlobalEnvironment" (G, thisValue) => {
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
  }""")
}