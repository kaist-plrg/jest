package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsValidRegularExpressionLiteral {
  val length: Int = 1
  val func: Func = parseFunc(""""IsValidRegularExpressionLiteral" (literal) => {
    assert (is-instance-of literal RegularExpressionLiteral)
    !!! "If FlagText of id:{literal} contains any code points other than code:{g} , code:{i} , code:{m} , code:{s} , code:{u} , or code:{y} , or if it contains the same code point more than once , return value:{false} ."
    access __x0__ = (literal "BodyText")
    let P = __x0__
    access __x1__ = (literal "FlagText")
    if (contains __x1__ !!! "u") !!! "Parse id:{P} using the grammars in 21 . 2 . 1 . The goal symbol for the parse is nt:{Pattern} . If id:{P} did not conform to the grammar , if any elements of id:{P} were not matched by the parse , or if any Early Error conditions exist , return value:{false} . Otherwise , return value:{true} ." else {}
    !!! "Parse id:{P} using the grammars in 21 . 2 . 1 . The goal symbol for the parse is nt:{Pattern} . If the result of parsing contains a nt:{GroupName} , reparse with the goal symbol nt:{Pattern} . If id:{P} did not conform to the grammar , if any elements of id:{P} were not matched by the parse , or if any Early Error conditions exist , return value:{false} . Otherwise , return value:{true} ."
  }""")
}
