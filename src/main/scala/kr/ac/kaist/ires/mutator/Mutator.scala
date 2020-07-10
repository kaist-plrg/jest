package kr.ac.kaist.ires.mutator

import kr.ac.kaist.ires.model.Script

trait Mutator {
  def apply(script: Script): Script
}
