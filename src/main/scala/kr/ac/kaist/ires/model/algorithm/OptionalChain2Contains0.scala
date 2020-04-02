package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OptionalChain2Contains0 {
  val length: Int = 0
  val func: Func = parseFunc(""""OptionalChain2Contains0" (this, IdentifierName, symbol) => {
    if (is-instance-of symbol ReservedWord) return false else {}
    if (&& (is-instance-of symbol Identifier) (= (get-syntax symbol) (get-syntax IdentifierName))) return true else {}
    return false
  }""")
}
