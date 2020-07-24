package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.model.Script
import kr.ac.kaist.ires.util.Useful._

trait Sampler {
  def getSample: List[Script]
}
