package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTObjectDOTassign extends Algorithm {
  val name: String = "GLOBALDOTObjectDOTassign"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Object.assign" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let target = __x0__
    app __x1__ = (ToObject target)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let to = __x1__

    let len = argumentsList.length
    if (= len 1i) return to else {}

    let idx = 1i
    while (< idx len) {
      let nextSource = argumentsList[idx]
      app from = (ToObject nextSource)
      ! from
      app keys = (from.OwnPropertyKeys from)
      ? keys
      let j = 0i
      let keysLen = keys.length
      while (< j keysLen) {
        let nextKey = keys[j]
        app desc = (from.GetOwnProperty from nextKey)
        ? desc
        if (&& (! (= desc undefined)) (= desc.Enumerable true)) {
          app propValue = (Get from nextKey)
          ? propValue
          app result = (Set to nextKey propValue true)
          ? result
        } else {}
        j = (+ j 1i)
      }
      idx = (+ idx 1i)
    }
    app __x2__ = (WrapCompletion to)
    return __x2__
  }"""), this)
}
