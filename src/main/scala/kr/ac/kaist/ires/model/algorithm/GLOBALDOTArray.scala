package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArray {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length"""))), EINum(0L)), ISeq(List(ILet(Id("""numberOfArgs"""), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))), IAssert(EBOp(OEq, ERef(RefId(Id("""numberOfArgs"""))), EINum(0L))), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget"""))))), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetPrototypeFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%ArrayPrototype%"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""proto"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L), ERef(RefId(Id("""proto"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length"""))), EINum(1L)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))), ILet(Id("""numberOfArgs"""), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))), IAssert(EBOp(OEq, ERef(RefId(Id("""numberOfArgs"""))), EINum(1L))), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetPrototypeFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%ArrayPrototype%"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""proto"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L), ERef(RefId(Id("""proto"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""array"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""len"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Number"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""array"""))), EStr("""0"""), ERef(RefId(Id("""len"""))))), ILet(Id("""defineStatus"""), ERef(RefId(Id("""__x7__""")))), IAssert(EBOp(OEq, ERef(RefId(Id("""defineStatus"""))), EBool(true))), ILet(Id("""intLen"""), EINum(1L)))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""len"""))))), ILet(Id("""intLen"""), ERef(RefId(Id("""__x8__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""intLen"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List()))))), IApp(Id("""__x10__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""array"""))), EStr("""length"""), ERef(RefId(Id("""intLen"""))), EBool(true))), IIf(EIsCompletion(ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x10__""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""array"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List(ILet(Id("""numberOfArgs"""), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))), IAssert(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""numberOfArgs"""))), EINum(2L)))), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget"""))))), IApp(Id("""__x12__"""), ERef(RefId(Id("""GetPrototypeFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%ArrayPrototype%"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x12__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), ILet(Id("""proto"""), ERef(RefId(Id("""__x12__""")))), IApp(Id("""__x13__"""), ERef(RefId(Id("""ArrayCreate"""))), List(ERef(RefId(Id("""numberOfArgs"""))), ERef(RefId(Id("""proto"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x13__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), ILet(Id("""array"""), ERef(RefId(Id("""__x13__""")))), ILet(Id("""k"""), EINum(0L)), ILet(Id("""items"""), ERef(RefId(Id("""argumentsList""")))), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""numberOfArgs""")))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x14__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), ILet(Id("""Pk"""), ERef(RefId(Id("""__x14__""")))), ILet(Id("""itemK"""), ERef(RefProp(RefId(Id("""items""")), ERef(RefId(Id("""k""")))))), IApp(Id("""__x15__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""array"""))), ERef(RefId(Id("""Pk"""))), ERef(RefId(Id("""itemK"""))))), ILet(Id("""defineStatus"""), ERef(RefId(Id("""__x15__""")))), IAssert(EBOp(OEq, ERef(RefId(Id("""defineStatus"""))), EBool(true))), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L)))))), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""array"""))))), IReturn(ERef(RefId(Id("""__x16__""")))))))))
  /* Beautified form:
  "GLOBAL.Array" (this, argumentsList, NewTarget) => if (= argumentsList["length"] 0i) {
    let numberOfArgs = argumentsList["length"]
    assert (= numberOfArgs 0i)
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x0__ = (GetPrototypeFromConstructor newTarget "%ArrayPrototype%")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let proto = __x0__
    app __x1__ = (ArrayCreate 0i proto)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  } else if (= argumentsList["length"] 1i) {
    app __x3__ = (GetArgument argumentsList 0i)
    let len = __x3__
    let numberOfArgs = argumentsList["length"]
    assert (= numberOfArgs 1i)
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x4__ = (GetPrototypeFromConstructor newTarget "%ArrayPrototype%")
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let proto = __x4__
    app __x5__ = (ArrayCreate 0i proto)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let array = __x5__
    app __x6__ = (Type len)
    if (! (= __x6__ Number)) {
      app __x7__ = (CreateDataProperty array "0" len)
      let defineStatus = __x7__
      assert (= defineStatus true)
      let intLen = 1i
    } else {
      app __x8__ = (ToUint32 len)
      let intLen = __x8__
      if (! (= intLen len)) {
        app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x9__
      } else {}
    }
    app __x10__ = (Set array "length" intLen true)
    if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    __x10__
    app __x11__ = (WrapCompletion array)
    return __x11__
  } else {
    let numberOfArgs = argumentsList["length"]
    assert (! (< numberOfArgs 2i))
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x12__ = (GetPrototypeFromConstructor newTarget "%ArrayPrototype%")
    if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    let proto = __x12__
    app __x13__ = (ArrayCreate numberOfArgs proto)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let array = __x13__
    let k = 0i
    let items = argumentsList
    while (< k numberOfArgs) {
      app __x14__ = (ToString k)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      let Pk = __x14__
      let itemK = items[k]
      app __x15__ = (CreateDataProperty array Pk itemK)
      let defineStatus = __x15__
      assert (= defineStatus true)
      k = (+ k 1i)
    }
    app __x16__ = (WrapCompletion array)
    return __x16__
  }
  */
}
