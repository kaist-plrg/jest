package kr.ac.kaist.jest.coverage

trait Target {
  val uid: Int
  def others: Set[Target] = this match {
    case CondTarget(uid, pass) => Set(CondTarget(uid, !pass))
    case KindTarget(uid, name) => Target.kinds.find(_ contains name) match {
      case Some(set) => (set - name).map(KindTarget(uid, _))
      case None => Set()
    }
    case CompletionTarget(uid, normal) => Set(CompletionTarget(uid, !normal))
    case ReturnValueTarget(uid, normal) => Set(ReturnValueTarget(uid, !normal))
  }
  override def toString: String = this match {
    case CondTarget(uid, pass) => s"""$uid,${if (pass) "#t" else "#f"}"""
    case KindTarget(uid, name) => s"""$uid,$name"""
    case CompletionTarget(uid, normal) => s"""$uid,${if (normal) "NORMAL" else "ABRUPT"}"""
    case ReturnValueTarget(uid, normal) => s"""$uid,${if (normal) "RET_NORMAL" else "RET_ABRUPT"}"""
  }
}
object Target {
  // TODO add objects / environments
  val kinds: List[Set[String]] = List(Set("Number", "BigInt"))
}
case class CondTarget(uid: Int, pass: Boolean) extends Target
case class KindTarget(uid: Int, name: String) extends Target
case class CompletionTarget(uid: Int, normal: Boolean) extends Target
case class ReturnValueTarget(uid: Int, normal: Boolean) extends Target
