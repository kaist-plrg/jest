package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetFunctionName {
  val length: Int = 2
  val func: Func = Func("""SetFunctionName""", List(Id("""F"""), Id("""name"""), Id("""prefix""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""name"""))))), IAssert(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Symbol""")))), EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String""")))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""name"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(ILet(Id("""description"""), ERef(RefProp(RefId(Id("""name""")), EStr("""Description""")))), IIf(EBOp(OEq, ERef(RefId(Id("""description"""))), EUndef), IAssign(RefId(Id("""name""")), EStr("""""")), IAssign(RefId(Id("""name""")), EBOp(OPlus, EBOp(OPlus, EStr("""["""), ERef(RefId(Id("""description""")))), EStr("""]""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""prefix"""))), EAbsent)), IAssign(RefId(Id("""name""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""prefix"""))), EStr(""" """)), ERef(RefId(Id("""name"""))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""name"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""name""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "SetFunctionName" (F, name, prefix) => {
    app __x0__ = (Type name)
    assert (|| (= __x0__ Symbol) (= __x0__ String))
    app __x1__ = (Type name)
    if (= __x1__ Symbol) {
      let description = name["Description"]
      if (= description undefined) name = "" else name = (+ (+ "[" description) "]")
    } else {}
    if (! (= prefix absent)) name = (+ (+ prefix " ") name) else {}
    app __x2__ = (DefinePropertyOrThrow F "name" (new PropertyDescriptor("Value" -> name, "Writable" -> false, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
