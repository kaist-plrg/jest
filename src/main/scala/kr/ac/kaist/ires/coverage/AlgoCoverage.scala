package kr.ac.kaist.ires.coverage

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Inst._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.LINE_SEP

case class AlgoCoverage(
    name: String,
    total: List[Inst],
    instCovered: Set[Int],
    condCovered: Set[(Int, Boolean)]
) {
  private val totalInsts = total.map(_.uid).toSet
  private val totalConds = total.flatMap(inst => inst match {
    case (condInst: CondInst) => List((condInst.uid, true), (condInst.uid, false))
    case _ => Nil
  }).toSet
  val summary: String = {
    s"$name" + LINE_SEP +
      s"- Inst: ${getPercent(instCovered, totalInsts)}" + LINE_SEP +
      s"- Cond: ${if (totalConds.size == 0) "-" else getPercent(condCovered, totalConds)}"
  }
  // val detail: String = total.map(_.toString).mkString("\n")
  def dump(dir: String): Unit = {
    mkdir(dir)

    val body = total.sortBy(_.uid).map(inst => {
      val uid = inst.uid
      // set prefix to `+` if instruction covered, otherwise `-`
      val prefix = if (instCovered.contains(uid)) "+" else "-"
      val suffix = inst match {
        // only add suffix to covered condition instruction
        case (condInst: CondInst) if instCovered.contains(condInst.uid) => {
          val thenCovered = condCovered.contains((condInst.uid, true))
          val elseCovered = condCovered.contains((condInst.uid, false))
          s"=> ${thenCovered}, ${elseCovered}"
        }
        case _ => ""
      }
      // {+,-}uid inst => true, false
      f"$prefix $uid%-6d: ${Beautifier.beautify(inst, "", false)}$suffix"
    }).mkString(LINE_SEP)

    val content = summary + LINE_SEP + body

    dumpFile(content, s"$dir/$name")
  }
}