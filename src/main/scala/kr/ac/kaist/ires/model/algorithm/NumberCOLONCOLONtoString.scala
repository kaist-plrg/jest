package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberCOLONCOLONtoString extends Algorithm {
  val name: String = "NumberCOLONCOLONtoString"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::toString" (x) => {
    !!! "If id:{x} is value:{NaN} , return the String value:{\"NaN\"} ."
    !!! "If id:{x} is value:{+0} or value:{-0} , return the String value:{\"0\"} ."
    !!! "If id:{x} is less than zero , return the string - concatenation of value:{\"-\"} and ! Number : : toString ( - id:{x} ) ."
    !!! "If id:{x} is value:{+∞} , return the String value:{\"Infinity\"} ."
    !!! "Otherwise , let id:{n} , id:{k} , and id:{s} be integers such that id:{k} ≥ 1 , 10 sup:{id:{k} - 1 } ≤ id:{s} < 10 sup:{id:{k} } , the Number value for ℝ ( id:{s} ) × 10 ℝ sup:{ℝ ( id:{n} ) - ℝ ( id:{k} ) } is id:{x} , and id:{k} is as small as possible . Note that id:{k} is the number of digits in the decimal representation of id:{s} , that id:{s} is not divisible by 10 ℝ , and that the least significant digit of id:{s} is not necessarily uniquely determined by these criteria ."
  }"""), this)
}
