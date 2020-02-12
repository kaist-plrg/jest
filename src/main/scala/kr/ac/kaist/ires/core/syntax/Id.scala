package kr.ac.kaist.ires.core

// CORE Identifiers
case class Id(name: String) extends CoreNode {
  override def toString = s"Id($TRIPLE$name$TRIPLE)"
}
