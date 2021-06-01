package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTObjectDOTprototypeDOTtoString extends Algorithm {
  val name: String = "GLOBALDOTObjectDOTprototypeDOTtoString"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Object.prototype.toString" (this, argumentsList, NewTarget) => {
    if (= this undefined) {
      app __x0__ = (WrapCompletion "[object Undefined]")
      return __x0__
    } else {}
    if (= this null) {
      app __x1__ = (WrapCompletion "[object Null]")
      return __x1__
    } else {}
    app __x2__ = (ToObject this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (IsArray O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let isArray = __x3__
    if (= isArray true) let builtinTag = "Array" else if (! (= O["ParameterMap"] absent)) let builtinTag = "Arguments" else if (! (= O["Call"] absent)) let builtinTag = "Function" else if (! (= O["ErrorData"] absent)) let builtinTag = "Error" else if (! (= O["BooleanData"] absent)) let builtinTag = "Boolean" else if (! (= O["NumberData"] absent)) let builtinTag = "Number" else if (! (= O["StringData"] absent)) let builtinTag = "String" else if (! (= O["DateValue"] absent)) let builtinTag = "Date" else if (! (= O["RegExpMatcher"] absent)) let builtinTag = "RegExp" else let builtinTag = "Object"
    app __x4__ = (Get O SYMBOL_toStringTag)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let tag = __x4__
    app __x5__ = (Type tag)
    if (! (= __x5__ String)) tag = builtinTag else {}
    app __x6__ = (WrapCompletion (+ (+ "[object " tag) "]"))
    return __x6__
  }"""), this)
}
