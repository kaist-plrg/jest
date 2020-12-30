package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetPrototypeFromConstructor extends Algorithm {
  val name: String = "GetPrototypeFromConstructor"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetPrototypeFromConstructor" (constructor, intrinsicDefaultProto) => {
    app __x0__ = (IsCallable constructor)
    assert (= __x0__ true)
    app __x1__ = (Get constructor "prototype")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let proto = __x1__
    app __x2__ = (Type proto)
    if (! (= __x2__ Object)) {
      app __x3__ = (GetFunctionRealm constructor)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let realm = __x3__
      if (= intrinsicDefaultProto "%String.prototype%") proto = INTRINSIC_StringPrototype
      else if (= intrinsicDefaultProto "%Array.prototype%") proto = INTRINSIC_ArrayPrototype
      else if (= intrinsicDefaultProto "%Object.prototype%") proto = INTRINSIC_ObjectPrototype
      else if (= intrinsicDefaultProto "%Boolean.prototype%") proto = INTRINSIC_BooleanPrototype
      else if (= intrinsicDefaultProto "%Number.prototype%") proto = INTRINSIC_NumberPrototype
      else if (= intrinsicDefaultProto "%Map.prototype%") proto = INTRINSIC_MapPrototype
      else if (= intrinsicDefaultProto "%Set.prototype%") proto = INTRINSIC_SetPrototype
      else if (= intrinsicDefaultProto "%WeakMap.prototype%") proto = INTRINSIC_WeakMapPrototype
      else if (= intrinsicDefaultProto "%WeakSet.prototype%") proto = INTRINSIC_WeakSetPrototype
      else if (= intrinsicDefaultProto "%Error.prototype%") proto = INTRINSIC_ErrorPrototype
      else if (= intrinsicDefaultProto "%EvalError.prototype%") proto = INTRINSIC_EvalErrorPrototype
      else if (= intrinsicDefaultProto "%ReferenceError.prototype%") proto = INTRINSIC_ReferenceErrorPrototype
      else if (= intrinsicDefaultProto "%SyntaxError.prototype%") proto = INTRINSIC_SyntaxErrorPrototype
      else if (= intrinsicDefaultProto "%TypeError.prototype%") proto = INTRINSIC_TypeErrorPrototype
      else if (= intrinsicDefaultProto "%URIError.prototype%") proto = INTRINSIC_URIErrorPrototype
      else if (= intrinsicDefaultProto "%Generator.prototype%") proto = INTRINSIC_GeneratorPrototype
      else if (= intrinsicDefaultProto "%AsyncGenerator.prototype%") proto = INTRINSIC_AsyncGeneratorPrototype
      else if (= intrinsicDefaultProto "%Promise.prototype%") proto = INTRINSIC_PromisePrototype
      else assert false
    } else {}
    app __x4__ = (WrapCompletion proto)
    return __x4__
  }"""), this)
}
