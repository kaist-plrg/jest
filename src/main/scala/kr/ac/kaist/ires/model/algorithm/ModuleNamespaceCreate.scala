package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceCreate {
  val length: Int = 2
  val func: Func = Func("""ModuleNamespaceCreate""", List(Id("""module"""), Id("""exports""")), None, ISeq(List(IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""module""")), EStr("""Namespace"""))), EUndef)), IExpr(ENotSupported("""Etc""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))), ISeq(List())), IAssign(RefProp(RefId(Id("""M""")), EStr("""Module""")), ERef(RefId(Id("""module""")))), IExpr(ENotSupported("""Etc""")), IAssign(RefProp(RefId(Id("""M""")), EStr("""Exports""")), ERef(RefId(Id("""sortedExports""")))), IExpr(ENotSupported("""Etc""")), IAssign(RefProp(RefId(Id("""module""")), EStr("""Namespace""")), ERef(RefId(Id("""M""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""M"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "ModuleNamespaceCreate" (module, exports) => {
    assert (= module["Namespace"] undefined)
    !!! "Etc"
    if (= M["HasProperty"] absent) M["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= M["DefineOwnProperty"] absent) M["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= M["Set"] absent) M["Set"] = OrdinaryObjectDOTSet else {}
    if (= M["SetPrototypeOf"] absent) M["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= M["Get"] absent) M["Get"] = OrdinaryObjectDOTGet else {}
    if (= M["PreventExtensions"] absent) M["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= M["Delete"] absent) M["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= M["GetOwnProperty"] absent) M["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= M["OwnPropertyKeys"] absent) M["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= M["GetPrototypeOf"] absent) M["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= M["IsExtensible"] absent) M["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    M["Module"] = module
    !!! "Etc"
    M["Exports"] = sortedExports
    !!! "Etc"
    module["Namespace"] = M
    app __x0__ = (WrapCompletion M)
    return __x0__
  }
  */
}
