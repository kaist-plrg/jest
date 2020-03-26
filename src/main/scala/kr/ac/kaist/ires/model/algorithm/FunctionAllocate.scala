package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionAllocate {
  val length: Int = 2
  val func: Func = Func("""FunctionAllocate""", List(Id("""functionPrototype"""), Id("""functionKind""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""functionPrototype"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), IAssert(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""functionKind"""))), EStr("""normal""")), EBOp(OEq, ERef(RefId(Id("""functionKind"""))), EStr("""non-constructor"""))), EBOp(OEq, ERef(RefId(Id("""functionKind"""))), EStr("""generator"""))), EBOp(OEq, ERef(RefId(Id("""functionKind"""))), EStr("""async"""))), EBOp(OEq, ERef(RefId(Id("""functionKind"""))), EStr("""async generator""")))), IIf(EBOp(OEq, ERef(RefId(Id("""functionKind"""))), EStr("""normal""")), ILet(Id("""needsConstruct"""), EBool(true)), ILet(Id("""needsConstruct"""), EBool(false))), IIf(EBOp(OEq, ERef(RefId(Id("""functionKind"""))), EStr("""non-constructor""")), IAssign(RefId(Id("""functionKind""")), EStr("""normal""")), ISeq(List())), ILet(Id("""F"""), EMap(Ty("""ECMAScriptFunctionObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IDelete(RefProp(RefId(Id("""F""")), EStr("""Call"""))), IDelete(RefProp(RefId(Id("""F""")), EStr("""Construct"""))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))), ISeq(List())), IAssign(RefProp(RefId(Id("""F""")), EStr("""Call""")), ERef(RefId(Id("""ECMAScriptFunctionObjectDOTCall""")))), IIf(EBOp(OEq, ERef(RefId(Id("""needsConstruct"""))), EBool(true)), ISeq(List(IAssign(RefProp(RefId(Id("""F""")), EStr("""Construct""")), ERef(RefId(Id("""ECMAScriptFunctionObjectDOTConstruct""")))), IAssign(RefProp(RefId(Id("""F""")), EStr("""ConstructorKind""")), EStr("""base""")))), ISeq(List())), IAssign(RefProp(RefId(Id("""F""")), EStr("""FunctionKind""")), ERef(RefId(Id("""functionKind""")))), IAssign(RefProp(RefId(Id("""F""")), EStr("""Prototype""")), ERef(RefId(Id("""functionPrototype""")))), IAssign(RefProp(RefId(Id("""F""")), EStr("""Extensible""")), EBool(true)), IAssign(RefProp(RefId(Id("""F""")), EStr("""Realm""")), ERef(RefId(Id("""REALM""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "FunctionAllocate" (functionPrototype, functionKind) => {
    app __x0__ = (Type functionPrototype)
    assert (= __x0__ Object)
    assert (|| (|| (|| (|| (= functionKind "normal") (= functionKind "non-constructor")) (= functionKind "generator")) (= functionKind "async")) (= functionKind "async generator"))
    if (= functionKind "normal") let needsConstruct = true else let needsConstruct = false
    if (= functionKind "non-constructor") functionKind = "normal" else {}
    let F = (new ECMAScriptFunctionObject("SubMap" -> (new SubMap())))
    delete F["Call"]
    delete F["Construct"]
    if (= F["HasProperty"] absent) F["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= F["DefineOwnProperty"] absent) F["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= F["Set"] absent) F["Set"] = OrdinaryObjectDOTSet else {}
    if (= F["SetPrototypeOf"] absent) F["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= F["Get"] absent) F["Get"] = OrdinaryObjectDOTGet else {}
    if (= F["PreventExtensions"] absent) F["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= F["Delete"] absent) F["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= F["GetOwnProperty"] absent) F["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= F["OwnPropertyKeys"] absent) F["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= F["GetPrototypeOf"] absent) F["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= F["IsExtensible"] absent) F["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    F["Call"] = ECMAScriptFunctionObjectDOTCall
    if (= needsConstruct true) {
      F["Construct"] = ECMAScriptFunctionObjectDOTConstruct
      F["ConstructorKind"] = "base"
    } else {}
    F["FunctionKind"] = functionKind
    F["Prototype"] = functionPrototype
    F["Extensible"] = true
    F["Realm"] = REALM
    app __x1__ = (WrapCompletion F)
    return __x1__
  }
  */
}
