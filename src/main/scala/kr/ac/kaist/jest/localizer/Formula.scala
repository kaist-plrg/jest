package kr.ac.kaist.jest.localizer

import scala.math._

sealed abstract class Formula(val name: String) {
  def div(a: Double, b: Double) = if (a == 0) 0 else a / b
  def apply(stat: Stat): Double = {
    val DStat(ep, ef, np, nf) = stat
    val F: Double = ef + nf
    val P: Double = ep + np
    this match {
      case ER1a => if (nf > 0) -1 else np
      case ER5a => ef - div(ef, ep + np + 1)
      case ER5c => if (ef < F) 0 else 1
      case Ochiai => div(ef, (ef + nf) * (ef + ep))
      case Ochiai2 => div(ef * np, sqrt((ef + ep) * (nf + np) * (ef + np) * (ep + nf)))
      case Jaccard => div(ef, ef + nf + ep)
      case AMPLE => abs(div(ef, F) - div(ep, P))
      case Hamann => div(ef + np - ep - nf, P + F)
      case Dice => div(2 * ef, ef + ep + nf)
      case M1 => div(ef + np, nf + ep)
      case M2 => div(ef, ef + np + 2 * nf + 2 * ep)
      case Hamming => ef + np
      case Goodman => div(2 * ef - nf - ep, 2 * ef + nf + ep)
      case Euclid => sqrt(ef + np)
      case Wong1 => ef
      case Wong2 => ef - ep
      case Wong3 => ef - (if (ep <= 2) ep else if (ep <= 10) 2 + 0.1 * (ep - 2) else 2.8 + 0.01 * (ep - 10))
      case ER1b => ef - div(ep, ep + np + 1)
      case ER5b => div(ef, ef + nf + ep + np)
      case GP2 => 2 * (ef + sqrt(ep + np)) + sqrt(ep)
      case GP3 => sqrt(abs(ef * ef - sqrt(ep)))
      case GP13 => ef * (1 + div(1, 2 * ep + ef))
      case GP19 => ef * sqrt(abs(ep - ef + F - P))
      case Tarantula => div(div(ef, ef + nf), div(ef, ef + nf) + div(ep, ep + np))
      case RusselRao => div(ef, ep + ef + np + nf)
      case SorensenDice => div(2 * ef, 2 * ef + ep + nf)
      case Kulczynski1 => div(ef, nf + ep)
      case Kulczynski2 => 0.5 * (div(ef, ef + nf) + div(ef, ef + ep))
      case SimpleMatching => div(ef + np, ep + ef + np + nf)
      case RogersTanimoto => div(ef + np, ef + np + 2 * nf + 2 * ep)
      case Sokal => div(2 * ef + 2 * np, 2 * ef + 2 * np + nf + ep)
      case Anderberg => div(ef, ef + 2 * ep + 2 * nf)
      case Zoltar => div(ef, ef + ep + nf + div(10000 * nf * ep, ef))
    }
  }

  override def toString: String = name
}
object Formula {
  val all: List[Formula] = List(
    ER1a,
    ER5a,
    ER5c,
    Ochiai,
    Ochiai2,
    Jaccard,
    AMPLE,
    Hamann,
    Dice,
    M1,
    M2,
    Hamming,
    Goodman,
    Euclid,
    Wong1,
    Wong2,
    Wong3,
    ER1b,
    ER5b,
    GP2,
    GP3,
    GP13,
    GP19,
    Tarantula,
    RusselRao,
    SorensenDice,
    Kulczynski1,
    Kulczynski2,
    SimpleMatching,
    RogersTanimoto,
    Sokal,
    Anderberg,
    Zoltar
  )
  val nameMap: Map[String, Formula] = all.map(f => f.name -> f).toMap
}
case object ER1a extends Formula("ER1a")
case object ER5a extends Formula("ER5a")
case object ER5c extends Formula("ER5c")
case object Ochiai extends Formula("Ochiai")
case object Ochiai2 extends Formula("Ochiai2")
case object Jaccard extends Formula("Jaccard")
case object AMPLE extends Formula("AMPLE")
case object Hamann extends Formula("Hamann")
case object Dice extends Formula("Dice")
case object M1 extends Formula("M1")
case object M2 extends Formula("M2")
case object Hamming extends Formula("Hamming")
case object Goodman extends Formula("Goodman")
case object Euclid extends Formula("Euclid")
case object Wong1 extends Formula("Wong1")
case object Wong2 extends Formula("Wong2")
case object Wong3 extends Formula("Wong3")
case object ER1b extends Formula("ER1b")
case object ER5b extends Formula("ER5b")
case object GP2 extends Formula("GP2")
case object GP3 extends Formula("GP3")
case object GP13 extends Formula("GP13")
case object GP19 extends Formula("GP19")
case object Tarantula extends Formula("Tarantula")
case object RusselRao extends Formula("RusselRao")
case object SorensenDice extends Formula("SorensenDice")
case object Kulczynski1 extends Formula("Kulczynski1")
case object Kulczynski2 extends Formula("Kulczynski2")
case object SimpleMatching extends Formula("SimpleMatching")
case object RogersTanimoto extends Formula("RogersTanimoto")
case object Sokal extends Formula("Sokal")
case object Anderberg extends Formula("Anderberg")
case object Zoltar extends Formula("Zoltar")
