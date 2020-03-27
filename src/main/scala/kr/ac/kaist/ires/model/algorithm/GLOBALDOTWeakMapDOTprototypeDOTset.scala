package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTWeakMapDOTprototypeDOTset {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.WeakMap.prototype.set""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""M"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""WeakMapData"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x2__""")))), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""WeakMapData""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""key"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), ILet(Id("""__x5__"""), ERef(RefId(Id("""entries""")))), ILet(Id("""__x6__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x6__"""))), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x5__""")), ERef(RefId(Id("""__x6__""")))))), ILet(Id("""__x7__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty""")))))), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""key"""))))), IAssign(RefId(Id("""__x7__""")), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true))))), ISeq(List())), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""p""")), EStr("""Value""")), ERef(RefId(Id("""value""")))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""M"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IAssign(RefId(Id("""__x6__""")), EBOp(OPlus, ERef(RefId(Id("""__x6__"""))), EINum(1L)))))), ILet(Id("""p"""), EMap(Ty("""Record"""), List((EStr("""Key"""), ERef(RefId(Id("""key""")))), (EStr("""Value"""), ERef(RefId(Id("""value"""))))))), IAppend(ERef(RefId(Id("""p"""))), ERef(RefId(Id("""entries""")))), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""M"""))))), IReturn(ERef(RefId(Id("""__x10__""")))))))
  /* Beautified form:
  "GLOBAL.WeakMap.prototype.set" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    let M = this
    app __x2__ = (RequireInternalSlot M "WeakMapData")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    let entries = M["WeakMapData"]
    app __x3__ = (Type key)
    if (! (= __x3__ Object)) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    let __x5__ = entries
    let __x6__ = 0i
    while (< __x6__ __x5__["length"]) {
      let p = __x5__[__x6__]
      let __x7__ = (! (= p["Key"] CONST_empty))
      if __x7__ {
        app __x8__ = (SameValue p["Key"] key)
        __x7__ = (= __x8__ true)
      } else {}
      if __x7__ {
        p["Value"] = value
        app __x9__ = (WrapCompletion M)
        return __x9__
      } else {}
      __x6__ = (+ __x6__ 1i)
    }
    let p = (new Record("Key" -> key, "Value" -> value))
    append p -> entries
    app __x10__ = (WrapCompletion M)
    return __x10__
  }
  */
}
