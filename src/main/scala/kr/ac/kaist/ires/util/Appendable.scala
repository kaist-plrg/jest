package kr.ac.kaist.ires.util

trait Appendable {
  val TAB = "  "
  def appendTo(sb: StringBuilder, pre: String = ""): StringBuilder = sb.append(toString)
  def beautify: String = appendTo(new StringBuilder, "").toString
}
