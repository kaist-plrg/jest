package kr.ac.kaist.ires.mutator

import kr.ac.kaist.ires.model.Script

trait Mutator {
  val name: String
  val script: Script
  val weight: Int
  def mutateOption: Option[Script]

  val IMPORTANT = 5
  val NORMAL = 3
  val MINOR = 1

  val valid: Boolean = weight != 0
  def mutate: Script = mutateOption.get
}
