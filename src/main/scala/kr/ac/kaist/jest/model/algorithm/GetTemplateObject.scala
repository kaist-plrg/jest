package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetTemplateObject extends Algorithm {
  val name: String = "GetTemplateObject"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetTemplateObject" (templateLiteral) => {
    access __x0__ = (templateLiteral "TemplateStrings")
    app __x1__ = (__x0__ true)
    let rawStrings = __x1__
    let realm = REALM
    let templateRegistry = realm["TemplateMap"]
    let __x2__ = templateRegistry
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let e = __x2__[__x3__]
      if (= e.Site templateLiteral) return e.Array else {}
      __x3__ = (+ __x3__ 1i)
    }
    access __x4__ = (templateLiteral "TemplateStrings")
    app __x5__ = (__x4__ false)
    let cookedStrings = __x5__
    let count = cookedStrings.length
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
      let cookedValue = cookedStrings[index]
      app __x9__ = (template["DefineOwnProperty"] template prop (new PropertyDescriptor("Value" -> cookedValue, "Writable" -> false, "Enumerable" -> true, "Configurable" -> false)))
      __x9__
      let rawValue = rawStrings[index]
      app __x10__ = (rawObj["DefineOwnProperty"] rawObj prop (new PropertyDescriptor("Value" -> rawValue, "Writable" -> false, "Enumerable" -> true, "Configurable" -> false)))
      __x10__
      index = (+ index 1i)
    }
    app __x11__ = (SetIntegrityLevel rawObj CONST_frozen)
    __x11__
    app __x12__ = (template["DefineOwnProperty"] template "raw" (new PropertyDescriptor("Value" -> rawObj, "Writable" -> false, "Enumerable" -> false, "Configurable" -> false)))
    __x12__
    app __x13__ = (SetIntegrityLevel template CONST_frozen)
    __x13__
    append (new Record("Site" -> templateLiteral, "Array" -> template)) -> templateRegistry
    app __x14__ = (WrapCompletion template)
    return __x14__
  }"""), this)
}
