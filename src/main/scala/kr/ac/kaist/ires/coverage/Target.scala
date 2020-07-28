package kr.ac.kaist.ires.coverage

trait Target {
  val uid: Int
  def others: Set[Target] = this match {
    case CondTarget(uid, pass) => Set(CondTarget(uid, !pass))
    case KindTarget(uid, name) => Target.kinds.find(_ contains name) match {
      case Some(set) => (set - name).map(KindTarget(uid, _))
      case None => Set()
    }
  }
}
object Target {
  // TODO add objects / environments
  val kinds: List[Set[String]] = List(Set("Number", "BigInt"))
}
case class CondTarget(uid: Int, pass: Boolean) extends Target
case class KindTarget(uid: Int, name: String) extends Target
