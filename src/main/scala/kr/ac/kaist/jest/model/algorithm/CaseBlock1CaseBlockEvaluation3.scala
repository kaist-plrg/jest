package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CaseBlock1CaseBlockEvaluation3 extends Algorithm {
  val name: String = "CaseBlock1CaseBlockEvaluation3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CaseBlock1CaseBlockEvaluation3" (this, CaseClauses0, DefaultClause, CaseClauses1, input) => {
    let V = undefined
    if (! (= CaseClauses0 absent)) let A = (get-elems CaseClauses0 CaseClause) else let A = (new [])
    let found = false
    let __x0__ = A
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let C = __x0__[__x1__]
      if (= found false) {
        app __x2__ = (CaseClauseIsSelected C input)
        if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        found = __x2__
      } else {}
      if (= found true) {
        access __x3__ = (C "Evaluation")
        let R = __x3__
        if (! (= R["Value"] CONST_empty)) V = R["Value"] else {}
        app __x4__ = (IsAbruptCompletion R)
        if __x4__ {
          app __x5__ = (UpdateEmpty R V)
          app __x6__ = (Completion __x5__)
          app __x7__ = (WrapCompletion __x6__)
          return __x7__
        } else {}
      } else {}
      __x1__ = (+ __x1__ 1i)
    }
    let foundInB = false
    if (! (= CaseClauses1 absent)) let B = (get-elems CaseClauses1 CaseClause) else let B = (new [])
    if (= found false) {
      let __x8__ = B
      let __x9__ = 0i
      while (< __x9__ __x8__["length"]) {
        let C = __x8__[__x9__]
        if (= foundInB false) {
          app __x10__ = (CaseClauseIsSelected C input)
          if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          foundInB = __x10__
        } else {}
        if (= foundInB true) {
          access __x11__ = (C "Evaluation")
          let R = __x11__
          if (! (= R["Value"] CONST_empty)) V = R["Value"] else {}
          app __x12__ = (IsAbruptCompletion R)
          if __x12__ {
            app __x13__ = (UpdateEmpty R V)
            app __x14__ = (Completion __x13__)
            app __x15__ = (WrapCompletion __x14__)
            return __x15__
          } else {}
        } else {}
        __x9__ = (+ __x9__ 1i)
      }
    } else {}
    if (= foundInB true) {
      app __x16__ = (NormalCompletion V)
      app __x17__ = (WrapCompletion __x16__)
      return __x17__
    } else {}
    access __x18__ = (DefaultClause "Evaluation")
    let R = __x18__
    if (! (= R["Value"] CONST_empty)) V = R["Value"] else {}
    app __x19__ = (IsAbruptCompletion R)
    if __x19__ {
      app __x20__ = (UpdateEmpty R V)
      app __x21__ = (Completion __x20__)
      app __x22__ = (WrapCompletion __x21__)
      return __x22__
    } else {}
    let __x23__ = B
    let __x24__ = 0i
    while (< __x24__ __x23__["length"]) {
      let C = __x23__[__x24__]
      access __x25__ = (C "Evaluation")
      let R = __x25__
      if (! (= R["Value"] CONST_empty)) V = R["Value"] else {}
      app __x26__ = (IsAbruptCompletion R)
      if __x26__ {
        app __x27__ = (UpdateEmpty R V)
        app __x28__ = (Completion __x27__)
        app __x29__ = (WrapCompletion __x28__)
        return __x29__
      } else {}
      __x24__ = (+ __x24__ 1i)
    }
    app __x30__ = (NormalCompletion V)
    app __x31__ = (WrapCompletion __x30__)
    return __x31__
  }"""), this)
}
