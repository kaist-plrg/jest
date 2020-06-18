package kr.ac.kaist.ires.coverage

// Case of each instruction
trait Case {
  val algo: String
  val inst: String
  val covered: Boolean
}
case class Base(
    algo: String,
    inst: String,
    covered: Boolean
) extends Case
case class Cond(
    algo: String,
    inst: String,
    covered: Boolean,
    cond: String,
    thenCovered: Boolean,
    elseCovered: Boolean
) extends Case
