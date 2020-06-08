package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateBuiltinFunction extends Algorithm {
  val name: String = "CreateBuiltinFunction"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateBuiltinFunction" (steps, internalSlotsList, realm, prototype) => {
    if (= realm absent) realm = REALM else {}
    assert (= (typeof realm) "RealmRecord")
    !!! "If id:{prototype} is not present , set id:{prototype} to id:{realm} . [ [ Intrinsics ] ] . [ [ % Function . prototype % ] ] ."
    prototype = INTRINSIC_FunctionPrototype
    let func = (new BuiltinFunctionObject("SubMap" -> (new SubMap())))
    delete func["Construct"]
    func["Code"] = steps["step"]
    if (= steps["name"] "") {} else func["SubMap"]["name"] = (new DataProperty("Value" -> steps["name"], "Writable" -> false, "Enumerable" -> false, "Configurable" -> true))
    func["SubMap"]["length"] = (new DataProperty("Value" -> steps["length"], "Writable" -> false, "Enumerable" -> false, "Configurable" -> true))
    func["Realm"] = realm
    func["Prototype"] = prototype
    func["Extensible"] = true
    func["ScriptOrModule"] = null
    app __x0__ = (WrapCompletion func)
    return __x0__
  }"""), this)
}
