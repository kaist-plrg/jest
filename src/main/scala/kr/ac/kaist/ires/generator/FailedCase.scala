package kr.ac.kaist.ires.generator

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Inst._
import kr.ac.kaist.ires.model.Script
import spray.json._

case class FailedCase(
    script: String,
    algorithm: String,
    cond: String,
    pass: String
)

object FailedCase extends DefaultJsonProtocol {
  implicit val FailedCaseFormat: JsonFormat[FailedCase] = jsonFormat4(FailedCase.apply)
  def apply(script: String, uid: Int, pass: Boolean): FailedCase = {
    val algo = instToAlgo(uid)
    val algoName = algo.name
    val cond = beautify(insts(uid).asInstanceOf[CondInst].cond)
    FailedCase(script, algoName, cond, pass.toString)
  }
}
