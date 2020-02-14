package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateBuiltinFunction {
  val length: Int = 2
  val func: Func = Func("""CreateBuiltinFunction""", List(Id("""steps"""), Id("""internalSlotsList"""), Id("""realm"""), Id("""prototype""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""realm"""))), EAbsent), IAssign(RefId(Id("""realm""")), ERef(RefId(Id("""REALM""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""prototype"""))), EAbsent), IAssign(RefId(Id("""prototype""")), ERef(RefProp(RefProp(RefId(Id("""realm""")), EStr("""Intrinsics""")), EStr("""INTRINSIC_FunctionPrototype""")))), ISeq(List())), IAssign(RefId(Id("""prototype""")), ERef(RefId(Id("""INTRINSIC_FunctionPrototype""")))), ILet(Id("""func"""), EMap(Ty("""BuiltinFunctionObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IDelete(RefProp(RefId(Id("""func""")), EStr("""Construct"""))), IAssign(RefProp(RefId(Id("""func""")), EStr("""Code""")), ERef(RefProp(RefId(Id("""steps""")), EStr("""step""")))), IAssign(RefProp(RefProp(RefId(Id("""func""")), EStr("""SubMap""")), EStr("""name""")), EMap(Ty("""DataProperty"""), List((EStr("""Value"""), ERef(RefProp(RefId(Id("""steps""")), EStr("""name""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true))))), IAssign(RefProp(RefProp(RefId(Id("""func""")), EStr("""SubMap""")), EStr("""length""")), EMap(Ty("""DataProperty"""), List((EStr("""Value"""), ERef(RefProp(RefId(Id("""steps""")), EStr("""length""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true))))), IAssign(RefProp(RefId(Id("""func""")), EStr("""Realm""")), ERef(RefId(Id("""realm""")))), IAssign(RefProp(RefId(Id("""func""")), EStr("""Prototype""")), ERef(RefId(Id("""prototype""")))), IAssign(RefProp(RefId(Id("""func""")), EStr("""Extensible""")), EBool(true)), IAssign(RefProp(RefId(Id("""func""")), EStr("""ScriptOrModule""")), ENull), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""func"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "CreateBuiltinFunction" (steps, internalSlotsList, realm, prototype) => {
    if (= realm absent) realm = REALM else {}
    if (= prototype absent) prototype = realm["Intrinsics"]["INTRINSIC_FunctionPrototype"] else {}
    prototype = INTRINSIC_FunctionPrototype
    let func = (new BuiltinFunctionObject("SubMap" -> (new SubMap())))
    delete func["Construct"]
    func["Code"] = steps["step"]
    func["SubMap"]["name"] = (new DataProperty("Value" -> steps["name"], "Writable" -> false, "Enumerable" -> false, "Configurable" -> true))
    func["SubMap"]["length"] = (new DataProperty("Value" -> steps["length"], "Writable" -> false, "Enumerable" -> false, "Configurable" -> true))
    func["Realm"] = realm
    func["Prototype"] = prototype
    func["Extensible"] = true
    func["ScriptOrModule"] = null
    app __x0__ = (WrapCompletion func)
    return __x0__
  }
  */
}
