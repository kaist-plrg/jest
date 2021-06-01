package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IsInTailPosition extends Algorithm {
  val name: String = "IsInTailPosition"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IsInTailPosition" (call) => {
    let __x0__ = true
    let __x1__ = call
    while (&& (= __x0__ true) (! (= __x1__ absent))) {
      if (is-instance-of __x1__ FunctionBody) __x0__ = false else {}
      if (is-instance-of __x1__ ConciseBody) __x0__ = false else {}
      if (is-instance-of __x1__ AsyncConciseBody) __x0__ = false else {}
      access __x1__ = (__x1__ "parent")
    }
    if __x0__ return false else {}
    let __x2__ = true
    let __x3__ = call
    while (&& (= __x2__ true) (! (= __x3__ absent))) {
      if (is-instance-of __x3__ FunctionBody) __x2__ = false else {}
      if (is-instance-of __x3__ ConciseBody) __x2__ = false else {}
      if (is-instance-of __x3__ AsyncConciseBody) __x2__ = false else {}
      if (= __x2__ true) access __x3__ = (__x3__ "parent") else {}
    }
    let body = __x3__
    let __x4__ = false
    if (is-instance-of body FunctionBody) {
      access __x5__ = (body "parent")
      if (&& (! (= __x5__ absent)) (is-instance-of __x5__ GeneratorBody)) __x4__ = true else {}
    } else {}
    if __x4__ return false else {}
    let __x6__ = false
    if (is-instance-of body FunctionBody) {
      access __x7__ = (body "parent")
      if (&& (! (= __x7__ absent)) (is-instance-of __x7__ AsyncFunctionBody)) __x6__ = true else {}
    } else {}
    if __x6__ return false else {}
    let __x8__ = false
    if (is-instance-of body FunctionBody) {
      access __x9__ = (body "parent")
      if (&& (! (= __x9__ absent)) (is-instance-of __x9__ AsyncGeneratorBody)) __x8__ = true else {}
    } else {}
    if __x8__ return false else {}
    if (is-instance-of body AsyncConciseBody) return false else {}
    access __x10__ = (body "HasCallInTailPosition")
    app __x11__ = (__x10__ call)
    return __x11__
  }"""), this)
}
