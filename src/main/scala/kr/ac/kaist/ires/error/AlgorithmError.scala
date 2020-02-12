package kr.ac.kaist.ires.error

import kr.ac.kaist.ires.algorithm._

sealed abstract class AlgorithmError(msg: String) extends IRESError(msg)

case object AlgorithmNotYetGenerated extends AlgorithmError({
  s"Algorithms are not yet generated. Please generate algorithm parsers using 'sbt generateModel'."
})

case class UnexpectedToken(token: Token) extends AlgorithmError({
  s"Unexpected: $token"
})

case class UnexpectedShift(k: Int) extends AlgorithmError({
  s"Not satisfied: 0 <= $k <= 62"
})
