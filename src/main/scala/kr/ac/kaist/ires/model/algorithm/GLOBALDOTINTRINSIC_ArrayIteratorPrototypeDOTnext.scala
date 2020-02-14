package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_ArrayIteratorPrototypeDOTnext {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.INTRINSIC_ArrayIteratorPrototype.next""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IIf(EBOp(OOr, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedObject""")))), EBOp(OOr, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayIteratorNextIndex""")))), EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayIterationKind""")))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), ILet(Id("""a"""), ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedObject""")))), IIf(EBOp(OEq, ERef(RefId(Id("""a"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayIteratorNextIndex""")))), ILet(Id("""itemKind"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayIterationKind""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""a""")), EStr("""TypedArrayName"""))), EAbsent)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""IsDetachedBuffer"""))), List(ERef(RefProp(RefId(Id("""a""")), EStr("""ViewedArrayBuffer"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""a""")), EStr("""ArrayLength""")))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""a"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""len"""), ERef(RefId(Id("""__x7__"""))))))), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IAssign(RefProp(RefId(Id("""O""")), EStr("""IteratedObject""")), EUndef), IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IAssign(RefProp(RefId(Id("""O""")), EStr("""ArrayIteratorNextIndex""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))), IIf(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""key""")), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""index"""))), EBool(false))), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""index"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), ILet(Id("""elementKey"""), ERef(RefId(Id("""__x12__""")))), IApp(Id("""__x13__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""a"""))), ERef(RefId(Id("""elementKey"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), ILet(Id("""elementValue"""), ERef(RefId(Id("""__x13__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""value""")), ILet(Id("""result"""), ERef(RefId(Id("""elementValue""")))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(EList(List(ERef(RefId(Id("""index"""))), ERef(RefId(Id("""elementValue"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), ILet(Id("""result"""), ERef(RefId(Id("""__x14__"""))))))), IApp(Id("""__x15__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""result"""))), EBool(false))), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))), IReturn(ERef(RefId(Id("""__x16__""")))))))
  /* Beautified form:
  "GLOBAL.INTRINSIC_ArrayIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (|| (= absent O["IteratedObject"]) (|| (= absent O["ArrayIteratorNextIndex"]) (= absent O["ArrayIterationKind"]))) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let a = O["IteratedObject"]
    if (= a undefined) {
      app __x3__ = (CreateIterResultObject undefined true)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    let index = O["ArrayIteratorNextIndex"]
    let itemKind = O["ArrayIterationKind"]
    if (! (= a["TypedArrayName"] absent)) {
      app __x5__ = (IsDetachedBuffer a["ViewedArrayBuffer"])
      if (= __x5__ true) {
        app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x6__
      } else {}
      let len = a["ArrayLength"]
    } else {
      app __x7__ = (LengthOfArrayLike a)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let len = __x7__
    }
    if (! (< index len)) {
      O["IteratedObject"] = undefined
      app __x8__ = (CreateIterResultObject undefined true)
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    O["ArrayIteratorNextIndex"] = (+ index 1i)
    if (= itemKind "key") {
      app __x10__ = (CreateIterResultObject index false)
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (ToString index)
    if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    let elementKey = __x12__
    app __x13__ = (Get a elementKey)
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let elementValue = __x13__
    if (= itemKind "value") let result = elementValue else {
      app __x14__ = (CreateArrayFromList (new [index, elementValue]))
      if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      let result = __x14__
    }
    app __x15__ = (CreateIterResultObject result false)
    app __x16__ = (WrapCompletion __x15__)
    return __x16__
  }
  */
}
