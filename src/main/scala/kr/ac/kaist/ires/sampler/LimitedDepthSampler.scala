package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.model.{ Parser, Script, Sampler }

object LimitedDepthSampler extends Sampler {
  val MAX_DEPTH: Int = 5
  val SIZE: Int = 1000
  val scripts: List[String] = {
    var set = Set[String]()
    while (set.size < SIZE) {
      val stmt = Sampler.Statement(MAX_DEPTH, false, false, false).toString
      if (!set.contains(stmt) && ValidityChecker(stmt)) {
        println(stmt)
        set += stmt
      }
    }
    set.toList
  }
  def getSample: List[Script] = scripts.map(str => {
    Parser.parse(Parser.Script(Nil), str).get
  })
}
