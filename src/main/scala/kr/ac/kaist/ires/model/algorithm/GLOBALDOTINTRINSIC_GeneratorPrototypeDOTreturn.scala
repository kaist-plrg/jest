package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_GeneratorPrototypeDOTreturn {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.INTRINSIC_GeneratorPrototype.return""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""g"""), ERef(RefId(Id("""this""")))), ILet(Id("""C"""), EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefId(Id("""value""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty"""))))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GeneratorResumeAbrupt"""))), List(ERef(RefId(Id("""g"""))), ERef(RefId(Id("""C"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "GLOBAL.INTRINSIC_GeneratorPrototype.return" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let g = this
    let C = (new Completion("Type" -> CONST_return, "Value" -> value, "Target" -> CONST_empty))
    app __x1__ = (GeneratorResumeAbrupt g C)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
