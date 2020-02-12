package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires.IRESConfig
import kr.ac.kaist.ires.util.ArgParser

sealed abstract class PhaseList[Result] {
  def getRunner(
    parser: ArgParser
  ): IRESConfig => Result

  def >>[C <: Config, R](phase: PhaseObj[Result, C, R]): PhaseList[R] = PhaseCons(this, phase)

  val nameList: List[String]
  override def toString: String = nameList.reverse.mkString(" >> ")
}

case object PhaseNil extends PhaseList[Unit] {
  def getRunner(
    parser: ArgParser
  ): IRESConfig => Unit = x => {}

  val nameList: List[String] = Nil
}

case class PhaseCons[P, C <: Config, R](
    prev: PhaseList[P],
    phase: PhaseObj[P, C, R]
) extends PhaseList[R] {
  def getRunner(
    parser: ArgParser
  ): IRESConfig => R = {
    val prevRunner = prev.getRunner(parser)
    val phaseRunner = phase.getRunner(parser)
    iresConfig => phaseRunner(prevRunner(iresConfig), iresConfig)
  }

  val nameList: List[String] = phase.name :: prev.nameList
}

