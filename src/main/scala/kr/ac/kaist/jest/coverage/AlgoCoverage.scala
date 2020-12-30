package kr.ac.kaist.jest.coverage

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Inst._
import kr.ac.kaist.jest.util.Useful._
import kr.ac.kaist.jest.LINE_SEP
import scala.Console.{ RESET, RED, YELLOW, GREEN, CYAN }

case class AlgoCoverage(
    name: String,
    total: List[Inst],
    instCovered: Set[Int],
    condCovered: Set[(Int, Boolean)]
) {
  sealed trait CoverageStatus
  object CoverageStatus {
    def apply[T](passSet: Iterable[T], totalSet: Iterable[T]): CoverageStatus =
      if (totalSet.size == 0) EMPTY
      else if (totalSet.size == passSet.size) FULL
      else if (passSet.size == 0) NONE
      else PARTIAL
  }
  case object FULL extends CoverageStatus
  case object PARTIAL extends CoverageStatus
  case object NONE extends CoverageStatus
  case object EMPTY extends CoverageStatus

  private val totalInsts = total.map(_.uid).toSet
  private val totalConds = total.flatMap(inst => inst match {
    case (condInst: CondInst) => List((condInst.uid, true), (condInst.uid, false))
    case _ => Nil
  }).toSet
  private val instCovStatus = CoverageStatus(instCovered, totalInsts)
  private val condCovStatus = CoverageStatus(condCovered, totalConds)
  private val defaultStatus = instCovStatus

  def decorateSummary(status: CoverageStatus, content: String): String = status match {
    case FULL => decorateGreen(content)
    case PARTIAL => decorateYellow(content)
    case NONE => decorateRed(content)
    case EMPTY => decorateSummary(defaultStatus, content)
  }

  val summary: String = {
    val instContent = decorateSummary(
      instCovStatus,
      s"- Inst: ${getPercent(instCovered, totalInsts)}"
    )
    val condContent = decorateSummary(
      condCovStatus,
      s"- Cond: ${if (totalConds.size == 0) "-" else getPercent(condCovered, totalConds)}"
    )
    s"${decorateSummary(instCovStatus, name)}" + LINE_SEP + instContent + LINE_SEP + condContent
  }

  // val detail: String = total.map(_.toString).mkString("\n")
  def dump(dir: String): Unit = {
    mkdir(dir)

    def bool2str(b: Boolean) = if (b) decorateGreen("T") else decorateRed("F")

    val body = total.sortBy(_.uid).map(inst => {
      val uid = inst.uid
      // set prefix to `+` if instruction covered, otherwise `-`
      val covered = instCovered.contains(uid)
      val prefix = if (covered) "+" else "-"
      val condPrefix = inst match {
        // only add suffix to covered condition instruction
        case (condInst: CondInst) if instCovered.contains(condInst.uid) => {
          val thenCovered = condCovered.contains((condInst.uid, true))
          val elseCovered = condCovered.contains((condInst.uid, false))
          s"[${bool2str(thenCovered)}/${bool2str(elseCovered)}${scala.Console.GREEN}]"
        }
        case _ => "[-]"
      }
      // {+,-} uid [T/T] inst
      val instStr = f"$prefix $uid%-6d$condPrefix%-6s: ${Beautifier.beautify(inst, "", false)}"
      (if (covered) decorateGreen else decorateRed)(instStr)
    }).mkString(LINE_SEP)

    dumpFile(summary + LINE_SEP + body + LINE_SEP, s"$dir/$name")
  }
}
