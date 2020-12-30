package kr.ac.kaist.jest

import kr.ac.kaist.jest.error.IRError

package object ir {
  // throw an error
  def error(msg: => String): Nothing = throw IRError(msg)

  // beautify
  def beautify(
    node: IRNode,
    indent: String = "",
    detail: Boolean = true
  ): String = Beautifier.beautify(node, indent, detail)

  // equality between doubles
  def doubleEquals(left: Double, right: Double): Boolean = {
    if (left.isNaN && right.isNaN) true
    else if (isNegZero(left) && !isNegZero(right)) false
    else if (!isNegZero(left) && isNegZero(right)) false
    else left == right
  }

  // negative zero check
  def isNegZero(double: Double): Boolean = (1 / double).isNegInfinity

  // triple quotations
  val TRIPLE = "\"\"\""
}
