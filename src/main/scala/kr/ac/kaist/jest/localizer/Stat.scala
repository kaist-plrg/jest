package kr.ac.kaist.jest.localizer

case class Stat(
    ep: Int = 0,
    ef: Int = 0,
    np: Int = 0,
    nf: Int = 0
) {
  def updated(covered: Boolean, pass: Boolean): Stat = (covered, pass) match {
    case (true, true) => Stat(ep + 1, ef, np, nf)
    case (true, false) => Stat(ep, ef + 1, np, nf)
    case (false, true) => Stat(ep, ef, np + 1, nf)
    case (false, false) => Stat(ep, ef, np, nf + 1)
  }

  def getScore(formula: Formula): Double =
    try formula(this) catch { case e: Throwable => 0.0 }

  def +(that: Stat): Stat = Stat(
    this.ep + that.ep,
    this.ef + that.ef,
    this.np + that.np,
    this.nf + that.nf
  )

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
