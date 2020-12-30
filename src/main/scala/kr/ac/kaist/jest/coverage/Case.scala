package kr.ac.kaist.jest.coverage

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
    thenCovered: Option[String],
    elseCovered: Option[String]
) extends Case
