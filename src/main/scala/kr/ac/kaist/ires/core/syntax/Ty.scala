package kr.ac.kaist.ires.core

// IR Types
case class Ty(name: String) extends CoreNode {
  override def toString: String = s"Ty($TRIPLE$name$TRIPLE)"
}
