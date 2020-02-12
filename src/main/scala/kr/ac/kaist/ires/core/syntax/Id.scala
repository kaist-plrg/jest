package kr.ac.kaist.ires.core

// IR Identifiers
case class Id(name: String) extends CoreNode {
  override def toString = s"Id($TRIPLE$name$TRIPLE)"
}
