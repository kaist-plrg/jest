package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewObjectEnvironment extends Algorithm {
  val name: String = "NewObjectEnvironment"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""NewObjectEnvironment" (O, E) => {
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    let envRec = (new ObjectEnvironmentRecord("SubMap" -> (new SubMap()), "BindingObject" -> O))
    env["EnvironmentRecord"] = envRec
    env["Outer"] = E
    app __x0__ = (WrapCompletion env)
    return __x0__
  }"""), this)
}
