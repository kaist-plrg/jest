package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsInTailPosition {
  val length: Int = 1
  val func: Func = parseFunc(""""IsInTailPosition" (call) => {
    if true return false else {}
    !!! "Etc"
    let body = !!! "ParentNode"
    if (= body !!! "ParentNode") return false else {}
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    access __x0__ = (body "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    return __x1__
  }""")
}
