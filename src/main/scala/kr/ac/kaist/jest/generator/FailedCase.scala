package kr.ac.kaist.jest.generator

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Inst._
import kr.ac.kaist.jest.model.Script
import spray.json._

case class FailedCase(
    script: String,
    algorithm: String,
    uid: Int,
    inst: String
)

object FailedCase extends DefaultJsonProtocol {
  implicit val FailedCaseFormat: JsonFormat[FailedCase] = jsonFormat4(FailedCase.apply)
  def apply(script: String, uid: Int): FailedCase = {
    val algo = instToAlgo(uid)
    val algoName = algo.name
    val inst = beautify(insts(uid), detail = false)
    FailedCase(script, algoName, uid, inst)
  }
}
