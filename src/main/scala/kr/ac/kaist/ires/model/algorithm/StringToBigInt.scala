package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StringToBigInt {
  val func: Func =
    parseFunc(""""StringToBigInt" (argument) => return (convert argument str2bigint)""")
}
