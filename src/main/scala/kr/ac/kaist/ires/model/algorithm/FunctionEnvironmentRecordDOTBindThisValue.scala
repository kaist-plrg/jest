package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionEnvironmentRecordDOTBindThisValue {
  val length: Int = 1
  val func: Func = Func("""FunctionEnvironmentRecord.BindThisValue""", List(Id("""this"""), Id("""V""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))), IAssert(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus"""))), EStr("""lexical""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus"""))), EStr("""initialized""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""ThisValue""")), ERef(RefId(Id("""V""")))), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus""")), EStr("""initialized""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""V"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "FunctionEnvironmentRecord.BindThisValue" (this, V) => {
    let envRec = this
    assert (! (= envRec["ThisBindingStatus"] "lexical"))
    if (= envRec["ThisBindingStatus"] "initialized") {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    envRec["ThisValue"] = V
    envRec["ThisBindingStatus"] = "initialized"
    app __x1__ = (WrapCompletion V)
    return __x1__
  }
  */
}
