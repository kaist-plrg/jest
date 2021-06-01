package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTreplace extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTreplace"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.replace" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.String.prototype.replace"

    app __x0__ = (GetArgument argumentsList 0i)
    let searchValue = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let replaceValue = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    if (! (|| (= searchValue undefined) (= searchValue null))) {
      app __x3__ = (GetMethod searchValue SYMBOL_replace)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let replacer = __x3__
      if (! (= replacer undefined)) {
        app __x4__ = (Call replacer searchValue (new [O, replaceValue]))
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
    } else {}
    app __x6__ = (ToString O)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let string = __x6__
    app __x7__ = (ToString searchValue)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let searchString = __x7__
    app __x8__ = (IsCallable replaceValue)
    let functionalReplace = __x8__
    if (= functionalReplace false) {
      app __x9__ = (ToString replaceValue)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      replaceValue = __x9__
    } else {}
    !!! "Etc"
    if (= functionalReplace true) {
      app __x10__ = (Call replaceValue undefined (new [matched, pos, string]))
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let replValue = __x10__
      app __x11__ = (ToString replValue)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let replStr = __x11__
    } else {
      let captures = (new [])
      app __x12__ = (GetSubstitution matched string pos captures undefined replaceValue)
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let replStr = __x12__
    }
    let tailPos = (+ pos matched["length"])
    !!! "Etc"
    app __x13__ = (WrapCompletion newString)
    return __x13__
  }"""), this)
}
