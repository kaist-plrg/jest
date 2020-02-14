package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EnumerableOwnPropertyNames {
  val length: Int = 2
  val func: Func = Func("""EnumerableOwnPropertyNames""", List(Id("""O"""), Id("""kind""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""O"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""ownKeys"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""properties"""), EList(List())), ILet(Id("""__x1__"""), ERef(RefId(Id("""ownKeys""")))), ILet(Id("""__x2__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""key"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""key"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""key"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""desc"""), ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef)), EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Enumerable"""))), EBool(true))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""key""")), IAppend(ERef(RefId(Id("""key"""))), ERef(RefId(Id("""properties""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""key"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""value"""), ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""value""")), IAppend(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""properties""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(EList(List(ERef(RefId(Id("""key"""))), ERef(RefId(Id("""value"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""entry"""), ERef(RefId(Id("""__x6__""")))), IAppend(ERef(RefId(Id("""entry"""))), ERef(RefId(Id("""properties""")))))))))), ISeq(List())))), ISeq(List())), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L)))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""properties"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))))
  /* Beautified form:
  "EnumerableOwnPropertyNames" (O, kind) => {
    app __x0__ = (O["OwnPropertyKeys"] O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let ownKeys = __x0__
    let properties = (new [])
    let __x1__ = ownKeys
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let key = __x1__[__x2__]
      app __x3__ = (Type key)
      if (= __x3__ String) {
        app __x4__ = (O["GetOwnProperty"] O key)
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let desc = __x4__
        if (&& (! (= desc undefined)) (= desc["Enumerable"] true)) if (= kind "key") append key -> properties else {
          app __x5__ = (Get O key)
          if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          let value = __x5__
          if (= kind "value") append value -> properties else {
            app __x6__ = (CreateArrayFromList (new [key, value]))
            if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
            let entry = __x6__
            append entry -> properties
          }
        } else {}
      } else {}
      __x2__ = (+ __x2__ 1i)
    }
    app __x7__ = (WrapCompletion properties)
    return __x7__
  }
  */
}
