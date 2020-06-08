package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONlessThan {
  val func: Func = parseFunc(""""BigIntCOLONCOLONlessThan" (x, y) => return (< x y)""")
}
