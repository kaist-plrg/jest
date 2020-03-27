package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetTemplateObject {
  val length: Int = 1
  val func: Func = Func("""GetTemplateObject""", List(Id("""templateLiteral""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""templateLiteral"""))), EStr("""TemplateStrings""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EBool(true))), ILet(Id("""rawStrings"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""realm"""), ERef(RefId(Id("""REALM""")))), ILet(Id("""templateRegistry"""), ERef(RefProp(RefId(Id("""realm""")), EStr("""TemplateMap""")))), ILet(Id("""__x2__"""), ERef(RefId(Id("""templateRegistry""")))), ILet(Id("""__x3__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))), IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L)))))), IAccess(Id("""__x4__"""), ERef(RefId(Id("""templateLiteral"""))), EStr("""TemplateStrings""")), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(EBool(false))), ILet(Id("""cookedStrings"""), ERef(RefId(Id("""__x5__""")))), IExpr(ENotSupported("""Etc""")), IAssert(EUOp(ONot, EBOp(OLt, EBOp(OSub, EINum(4294967296L), EINum(1L)), ERef(RefId(Id("""count""")))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""ArrayCreate"""))), List(ERef(RefId(Id("""count"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""template"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""ArrayCreate"""))), List(ERef(RefId(Id("""count"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""rawObj"""), ERef(RefId(Id("""__x7__""")))), ILet(Id("""index"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""count""")))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""index"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), ILet(Id("""prop"""), ERef(RefId(Id("""__x8__""")))), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x9__"""), ERef(RefProp(RefId(Id("""template""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""template"""))), ERef(RefId(Id("""prop"""))), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""cookedValue""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(false)))))), IExpr(ERef(RefId(Id("""__x9__""")))), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x10__"""), ERef(RefProp(RefId(Id("""rawObj""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""rawObj"""))), ERef(RefId(Id("""prop"""))), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""rawValue""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(false)))))), IExpr(ERef(RefId(Id("""__x10__""")))), IAssign(RefId(Id("""index""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L)))))), IApp(Id("""__x11__"""), ERef(RefId(Id("""SetIntegrityLevel"""))), List(ERef(RefId(Id("""rawObj"""))), EStr("""frozen"""))), IExpr(ERef(RefId(Id("""__x11__""")))), IApp(Id("""__x12__"""), ERef(RefProp(RefId(Id("""template""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""template"""))), EStr("""raw"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""rawObj""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))), IExpr(ERef(RefId(Id("""__x12__""")))), IApp(Id("""__x13__"""), ERef(RefId(Id("""SetIntegrityLevel"""))), List(ERef(RefId(Id("""template"""))), EStr("""frozen"""))), IExpr(ERef(RefId(Id("""__x13__""")))), IAppend(EMap(Ty("""Record"""), List((EStr("""Site"""), ERef(RefId(Id("""templateLiteral""")))), (EStr("""Array"""), ERef(RefId(Id("""template""")))))), ERef(RefId(Id("""templateRegistry""")))), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""template"""))))), IReturn(ERef(RefId(Id("""__x14__""")))))))
  /* Beautified form:
  "GetTemplateObject" (templateLiteral) => {
    access __x0__ = (templateLiteral "TemplateStrings")
    app __x1__ = (__x0__ true)
    let rawStrings = __x1__
    let realm = REALM
    let templateRegistry = realm["TemplateMap"]
    let __x2__ = templateRegistry
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let e = __x2__[__x3__]
      !!! "Etc"
      __x3__ = (+ __x3__ 1i)
    }
    access __x4__ = (templateLiteral "TemplateStrings")
    app __x5__ = (__x4__ false)
    let cookedStrings = __x5__
    !!! "Etc"
    assert (! (< (- 4294967296i 1i) count))
    app __x6__ = (ArrayCreate count)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let template = __x6__
    app __x7__ = (ArrayCreate count)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let rawObj = __x7__
    let index = 0i
    while (< index count) {
      app __x8__ = (ToString index)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let prop = __x8__
      !!! "Etc"
      app __x9__ = (template["DefineOwnProperty"] template prop (new PropertyDescriptor("Value" -> cookedValue, "Writable" -> false, "Enumerable" -> true, "Configurable" -> false)))
      __x9__
      !!! "Etc"
      app __x10__ = (rawObj["DefineOwnProperty"] rawObj prop (new PropertyDescriptor("Value" -> rawValue, "Writable" -> false, "Enumerable" -> true, "Configurable" -> false)))
      __x10__
      index = (+ index 1i)
    }
    app __x11__ = (SetIntegrityLevel rawObj "frozen")
    __x11__
    app __x12__ = (template["DefineOwnProperty"] template "raw" (new PropertyDescriptor("Value" -> rawObj, "Writable" -> false, "Enumerable" -> false, "Configurable" -> false)))
    __x12__
    app __x13__ = (SetIntegrityLevel template "frozen")
    __x13__
    append (new Record("Site" -> templateLiteral, "Array" -> template)) -> templateRegistry
    app __x14__ = (WrapCompletion template)
    return __x14__
  }
  */
}
