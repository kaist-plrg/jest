package kr.ac.kaist.ires.localizer

object Formula {
  val o: Double = 1e-10
  def div(a: Double, b: Double) = a / (b + o)
  def Jaccard(s: Stat): Double = s match {
    case DStat(ep, ef, np, nf) =>
      div(ef, ef + nf + ep)
  }
  def Tarantula(s: Stat): Double = s match {
    case DStat(ep, ef, np, nf) =>
      div(div(ef, ef + nf), div(ef, ef + nf) + div(ep, ep + np))
  }
  def GP13(s: Stat): Double = s match {
    case DStat(ep, ef, np, nf) =>
      ef * (1 + div(1, 2 * ep + ef))
  }
  def Ochiai(s: Stat): Double = s match {
    case DStat(ep, ef, np, nf) =>
      div(ef, (ef + nf) * (ef + ep))
  }
}