package kr.ac.kaist.ires.ir

// IR Types
case class Ty(name: String) extends IRNode {
  override def toString: String = s"Ty($TRIPLE$name$TRIPLE)"
}
