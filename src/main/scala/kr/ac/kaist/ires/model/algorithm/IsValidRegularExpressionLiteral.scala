package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsValidRegularExpressionLiteral extends Algorithm {
  val name: String = "IsValidRegularExpressionLiteral"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IsValidRegularExpressionLiteral" (literal) => ??? "IsValidRegularExpressionLiteral""""), this)
}
