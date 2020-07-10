package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.model.Script

trait Sampler {
  def getSample: List[Script]
}
