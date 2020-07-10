package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.model._

object ManualSampler extends Sampler {
  val scripts: List[String] = List(
    "var x = 42;",
    "let x = 42; let y = x + x;"
  )
  def getSample: List[Script] = scripts.map(str => {
    Parser.parse(Parser.Script(Nil), str).get
  })
}
