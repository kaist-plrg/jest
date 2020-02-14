package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_IteratorPrototypeDOTSYMBOL_iterator {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.INTRINSIC_IteratorPrototype.SYMBOL_iterator""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""this"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "GLOBAL.INTRINSIC_IteratorPrototype.SYMBOL_iterator" (this, argumentsList, NewTarget) => {
    app __x0__ = (WrapCompletion this)
    return __x0__
  }
  */
}
