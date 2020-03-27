package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_MapIteratorPrototypeDOTnext {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.INTRINSIC_MapIteratorPrototype.next""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), ILet(Id("""m"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Map""")))), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""O""")), EStr("""MapNextIndex""")))), ILet(Id("""itemKind"""), ERef(RefProp(RefId(Id("""O""")), EStr("""MapIterationKind""")))), IIf(EBOp(OEq, ERef(RefId(Id("""m"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IAssert(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""m""")), EStr("""MapData"""))), EAbsent))), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""m""")), EStr("""MapData""")))), ILet(Id("""numEntries"""), ERef(RefProp(RefId(Id("""entries""")), EStr("""length""")))), IWhile(EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""numEntries""")))), ISeq(List(IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""index""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))), IAssign(RefProp(RefId(Id("""O""")), EStr("""MapNextIndex""")), ERef(RefId(Id("""index""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""e""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty"""))))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""key""")), ILet(Id("""result"""), ERef(RefProp(RefId(Id("""e""")), EStr("""Key""")))), IIf(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""value""")), ILet(Id("""result"""), ERef(RefProp(RefId(Id("""e""")), EStr("""Value""")))), ISeq(List(IAssert(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""key+value"""))), IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(EList(List(ERef(RefProp(RefId(Id("""e""")), EStr("""Key"""))), ERef(RefProp(RefId(Id("""e""")), EStr("""Value"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""result"""), ERef(RefId(Id("""__x4__""")))))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""result"""))), EBool(false))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List()))))), IAssign(RefProp(RefId(Id("""O""")), EStr("""Map""")), EUndef), IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "GLOBAL.INTRINSIC_MapIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    !!! "Etc"
    let m = O["Map"]
    let index = O["MapNextIndex"]
    let itemKind = O["MapIterationKind"]
    if (= m undefined) {
      app __x2__ = (CreateIterResultObject undefined true)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    assert (! (= m["MapData"] absent))
    let entries = m["MapData"]
    let numEntries = entries["length"]
    while (< index numEntries) {
      !!! "Etc"
      index = (+ index 1i)
      O["MapNextIndex"] = index
      if (! (= e["Key"] CONST_empty)) {
        if (= itemKind "key") let result = e["Key"] else if (= itemKind "value") let result = e["Value"] else {
          assert (= itemKind "key+value")
          app __x4__ = (CreateArrayFromList (new [e["Key"], e["Value"]]))
          if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
          let result = __x4__
        }
        app __x5__ = (CreateIterResultObject result false)
        app __x6__ = (WrapCompletion __x5__)
        return __x6__
      } else {}
    }
    O["Map"] = undefined
    app __x7__ = (CreateIterResultObject undefined true)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
