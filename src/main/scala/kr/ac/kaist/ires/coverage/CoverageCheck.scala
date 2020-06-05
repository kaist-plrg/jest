package kr.ac.kaist.ires.coverage

import kr.ac.kaist.ires.BASE_DIR
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.util.Useful._

object CoverageCheck {
  private var _covered: Set[(Int, Boolean)] = Set()
  private var _time: Long = 0

  def updateTime: Unit = {
    val newTime = System.currentTimeMillis
    if (_time + 1000 < newTime) {
      _time = newTime
      showResult()
    }
  }

  def add(condInst: CondInst, value: Value): Unit = value match {
    case Bool(b) => _covered += ((condInst.uid, b))
    case _ =>
  }

  def all: Set[(Int, Boolean)] = Inst.conds.flatMap {
    case uid => Set((uid, true), (uid, false))
  }.toSet

  def covered: Set[(Int, Boolean)] = _covered
  def notCovered: Set[(Int, Boolean)] = all -- covered

  def showResult(detail: Boolean = false): Unit = {
    val total = all.size
    val pass = covered.size
    val ratio = pass.toDouble / total * 100

    if (detail) {
      val nf = getPrintWriter(s"$BASE_DIR/coverage")
      nf.println("- not covered branches:")
      notCovered.toList.sorted.foreach {
        case (uid, b) =>
          val bstr = if (b) "T" else "F"
          val condStr = Inst.insts(uid) match {
            case (c: CondInst) => beautify(c.cond)
            case inst => ""
          }
          val algo = Inst.instToAlgo.applyOrElse(uid, (uid: Int) => {
            throw new Error("")
          })
          val algoName = algo.name
          val langStr = if (algo.lang) "Language" else "Built-in"

          nf.println(s"  [$uid|$bstr] $condStr @ $algoName <$langStr>")
      }
      nf.println("=========================================")
      nf.println(f"Coverage: $pass / $total ($ratio%.2f%%)")
      nf.println("=========================================")
      nf.close()
    } else println(f"Coverage: $pass / $total ($ratio%.2f%%)")
  }
}
