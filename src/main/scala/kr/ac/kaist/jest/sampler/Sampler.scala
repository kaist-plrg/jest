package kr.ac.kaist.jest.sampler

import kr.ac.kaist.jest._
import kr.ac.kaist.jest.model.Script
import kr.ac.kaist.jest.util.Useful._

trait Sampler {
  def getSample: List[Script]
}
