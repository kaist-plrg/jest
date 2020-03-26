package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ParenthesizedExpression0NamedEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ParenthesizedExpression0NamedEvaluation0""", List(Id("""this"""), Id("""Expression"""), Id("""name""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Expression"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Expression"""))), EStr("""NamedEvaluation""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""name"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "ParenthesizedExpression0NamedEvaluation0" (this, Expression, name) => {
    app __x0__ = (IsAnonymousFunctionDefinition Expression)
    assert (= __x0__ true)
    access __x1__ = (Expression "NamedEvaluation")
    app __x2__ = (__x1__ name)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
