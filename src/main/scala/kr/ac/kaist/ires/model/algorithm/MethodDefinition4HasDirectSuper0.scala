package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition4HasDirectSuper0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition4HasDirectSuper0""", List(Id("""this"""), Id("""PropertyName"""), Id("""FunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FunctionBody"""))), EStr("""Contains""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EStr("""SuperCall"""))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "MethodDefinition4HasDirectSuper0" (this, PropertyName, FunctionBody) => {
    access __x0__ = (FunctionBody "Contains")
    app __x1__ = (__x0__ "SuperCall")
    return __x1__
  }
  */
}
