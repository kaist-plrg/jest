package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassTail0Contains3 {
  val length: Int = 0
  val func: Func = Func("""ClassTail0Contains3""", List(Id("""this"""), Id("""ClassHeritage"""), Id("""ClassBody"""), Id("""symbol""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """ClassBody"""), IReturn(EBool(true)), ISeq(List())), IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """ClassHeritage"""), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""ClassHeritage"""))), EAbsent)), IReturn(EBool(true)), IReturn(EBool(false))), ISeq(List())), IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassHeritage"""))), EStr("""Contains""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))), ILet(Id("""inHeritage"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""inHeritage"""))), EBool(true)), IReturn(EBool(true)), ISeq(List())), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassBody"""))), EStr("""ComputedPropertyContains""")), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""symbol"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "ClassTail0Contains3" (this, ClassHeritage, ClassBody, symbol) => {
    if (is-instance-of symbol ClassBody) return true else {}
    if (is-instance-of symbol ClassHeritage) if (! (= ClassHeritage absent)) return true else return false else {}
    access __x0__ = (ClassHeritage "Contains")
    app __x1__ = (__x0__ symbol)
    let inHeritage = __x1__
    if (= inHeritage true) return true else {}
    access __x2__ = (ClassBody "ComputedPropertyContains")
    app __x3__ = (__x2__ symbol)
    return __x3__
  }
  */
}
