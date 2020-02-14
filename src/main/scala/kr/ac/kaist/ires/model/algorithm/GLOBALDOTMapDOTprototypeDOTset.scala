package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTMapDOTprototypeDOTset {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Map.prototype.set""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""M"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""MapData"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x2__""")))), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""MapData""")))), ILet(Id("""__x3__"""), ERef(RefId(Id("""entries""")))), ILet(Id("""__x4__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x4__""")))))), ILet(Id("""__x5__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty""")))))), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""SameValueZero"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""key"""))))), IAssign(RefId(Id("""__x5__""")), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true))))), ISeq(List())), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""p""")), EStr("""Value""")), ERef(RefId(Id("""value""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""M"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IAssign(RefId(Id("""__x4__""")), EBOp(OPlus, ERef(RefId(Id("""__x4__"""))), EINum(1L)))))), IIf(EBOp(OEq, ERef(RefId(Id("""key"""))), ENum(-0.0)), IAssign(RefId(Id("""key""")), EINum(0L)), ISeq(List())), ILet(Id("""p"""), EMap(Ty("""Record"""), List((EStr("""Key"""), ERef(RefId(Id("""key""")))), (EStr("""Value"""), ERef(RefId(Id("""value"""))))))), IAppend(ERef(RefId(Id("""p"""))), ERef(RefId(Id("""entries""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""M"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "GLOBAL.Map.prototype.set" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    let M = this
    app __x2__ = (RequireInternalSlot M "MapData")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    let entries = M["MapData"]
    let __x3__ = entries
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let p = __x3__[__x4__]
      let __x5__ = (! (= p["Key"] CONST_empty))
      if __x5__ {
        app __x6__ = (SameValueZero p["Key"] key)
        __x5__ = (= __x6__ true)
      } else {}
      if __x5__ {
        p["Value"] = value
        app __x7__ = (WrapCompletion M)
        return __x7__
      } else {}
      __x4__ = (+ __x4__ 1i)
    }
    if (= key -0.0) key = 0i else {}
    let p = (new Record("Key" -> key, "Value" -> value))
    append p -> entries
    app __x8__ = (WrapCompletion M)
    return __x8__
  }
  */
}
