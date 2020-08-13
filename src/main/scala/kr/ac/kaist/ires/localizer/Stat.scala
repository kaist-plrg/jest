package kr.ac.kaist.ires.localizer

case class Stat(var ep: Int, var ef: Int, var np: Int, var nf: Int) {
  def update(covered: Boolean, failed: Boolean): Unit = {
    if (covered) {
      if (failed) ef += 1
      else ep += 1
    } else {
      if (failed) nf += 1
      else np += 1
    }
  }

  def getScore(formula: Stat => Double): Double = {
    var score = 0.toDouble
    try score = formula(this)
    catch { case x: ArithmeticException => }
    score
  }

  override def toString: String = s"Stat: $ep, $ef, $np, $nf"
}
object Stat {
  def apply(): Stat = Stat(0, 0, 0, 0)
}
object DStat {
  def unapply(stat: Stat): Option[(Double, Double, Double, Double)] = {
    val Stat(ep, ef, np, nf) = stat
    Some((ep, ef, np, nf))
  }
}