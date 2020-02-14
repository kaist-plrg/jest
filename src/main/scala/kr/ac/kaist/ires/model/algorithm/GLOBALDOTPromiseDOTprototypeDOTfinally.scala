package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseDOTprototypeDOTfinally {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Promise.prototype.finally""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""onFinally"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""promise"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""promise"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""SpeciesConstructor"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""INTRINSIC_Promise"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""C"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""onFinally"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(ILet(Id("""thenFinally"""), ERef(RefId(Id("""onFinally""")))), ILet(Id("""catchFinally"""), ERef(RefId(Id("""onFinally""")))))), ISeq(List(ILet(Id("""stepsThenFinally"""), ENotSupported("""Algorithms""")), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsThenFinally"""))), EList(List(EStr("""Constructor"""), EStr("""OnFinally"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""thenFinally"""), ERef(RefId(Id("""__x5__""")))), IAssign(RefProp(RefId(Id("""thenFinally""")), EStr("""Constructor""")), ERef(RefId(Id("""C""")))), IAssign(RefProp(RefId(Id("""thenFinally""")), EStr("""OnFinally""")), ERef(RefId(Id("""onFinally""")))), ILet(Id("""stepsCatchFinally"""), ENotSupported("""Algorithms""")), IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsCatchFinally"""))), EList(List(EStr("""Constructor"""), EStr("""OnFinally"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""catchFinally"""), ERef(RefId(Id("""__x6__""")))), IAssign(RefProp(RefId(Id("""catchFinally""")), EStr("""Constructor""")), ERef(RefId(Id("""C""")))), IAssign(RefProp(RefId(Id("""catchFinally""")), EStr("""OnFinally""")), ERef(RefId(Id("""onFinally"""))))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""promise"""))), EStr("""then"""), EList(List(ERef(RefId(Id("""thenFinally"""))), ERef(RefId(Id("""catchFinally"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "GLOBAL.Promise.prototype.finally" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let onFinally = __x0__
    let promise = this
    app __x1__ = (Type promise)
    if (! (= __x1__ Object)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (SpeciesConstructor promise INTRINSIC_Promise)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let C = __x3__
    app __x4__ = (IsCallable onFinally)
    if (= __x4__ false) {
      let thenFinally = onFinally
      let catchFinally = onFinally
    } else {
      let stepsThenFinally = !!! "Algorithms"
      app __x5__ = (CreateBuiltinFunction stepsThenFinally (new ["Constructor", "OnFinally"]))
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let thenFinally = __x5__
      thenFinally["Constructor"] = C
      thenFinally["OnFinally"] = onFinally
      let stepsCatchFinally = !!! "Algorithms"
      app __x6__ = (CreateBuiltinFunction stepsCatchFinally (new ["Constructor", "OnFinally"]))
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let catchFinally = __x6__
      catchFinally["Constructor"] = C
      catchFinally["OnFinally"] = onFinally
    }
    app __x7__ = (Invoke promise "then" (new [thenFinally, catchFinally]))
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
