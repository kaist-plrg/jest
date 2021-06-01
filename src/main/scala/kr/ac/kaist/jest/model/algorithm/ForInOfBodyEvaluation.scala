package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ForInOfBodyEvaluation extends Algorithm {
  val name: String = "ForInOfBodyEvaluation"
  val length: Int = 6
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ForInOfBodyEvaluation" (lhs, stmt, iteratorRecord, iterationKind, lhsKind, labelSet, iteratorKind) => {
    if (= iteratorKind absent) iteratorKind = CONST_sync else {}
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    let V = undefined
    access __x0__ = (lhs "IsDestructuring")
    let destructuring = __x0__
    if (&& (= destructuring true) (= lhsKind CONST_assignment)) {
      assert (is-instance-of lhs LeftHandSideExpression)
      let assignmentPattern = (parse-syntax lhs "AssignmentPattern")
    } else {}
    while true {
      app __x1__ = (Call iteratorRecord["NextMethod"] iteratorRecord["Iterator"])
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let nextResult = __x1__
      if (= iteratorKind CONST_async) {
        app __x2__ = (Await nextResult)
        if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        nextResult = __x2__
      } else {}
      app __x3__ = (Type nextResult)
      if (! (= __x3__ Object)) {
        app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x4__
      } else {}
      app __x5__ = (IteratorComplete nextResult)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let done = __x5__
      if (= done true) {
        app __x6__ = (NormalCompletion V)
        app __x7__ = (WrapCompletion __x6__)
        return __x7__
      } else {}
      app __x8__ = (IteratorValue nextResult)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let nextValue = __x8__
      if (|| (= lhsKind CONST_assignment) (= lhsKind CONST_varBinding)) if (= destructuring false) {
        access __x9__ = (lhs "Evaluation")
        let lhsRef = __x9__
      } else {} else {
        assert (= lhsKind CONST_lexicalBinding)
        assert (is-instance-of lhs ForDeclaration)
        app __x10__ = (NewDeclarativeEnvironment oldEnv)
        let iterationEnv = __x10__
        access __x11__ = (lhs "BindingInstantiation")
        app __x12__ = (__x11__ iterationEnv)
        __x12__
        GLOBAL_context["LexicalEnvironment"] = iterationEnv
        if (= destructuring false) {
          access __x13__ = (lhs "BoundNames")
          let lhsName = __x13__[0i]
          app __x14__ = (ResolveBinding lhsName)
          if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
          let lhsRef = __x14__
        } else {}
      }
      if (= destructuring false) {
        app __x15__ = (IsAbruptCompletion lhsRef)
        if __x15__ let status = lhsRef else if (= lhsKind CONST_lexicalBinding) {
          app __x16__ = (InitializeReferencedBinding lhsRef nextValue)
          let status = __x16__
        } else {
          app __x17__ = (PutValue lhsRef nextValue)
          let status = __x17__
        }
      } else if (= lhsKind CONST_assignment) {
        access __x18__ = (assignmentPattern "DestructuringAssignmentEvaluation")
        app __x19__ = (__x18__ nextValue)
        let status = __x19__
      } else if (= lhsKind CONST_varBinding) {
        assert (is-instance-of lhs ForBinding)
        access __x20__ = (lhs "BindingInitialization")
        app __x21__ = (__x20__ nextValue undefined)
        let status = __x21__
      } else {
        assert (= lhsKind CONST_lexicalBinding)
        assert (is-instance-of lhs ForDeclaration)
        access __x22__ = (lhs "BindingInitialization")
        app __x23__ = (__x22__ nextValue iterationEnv)
        let status = __x23__
      }
      app __x24__ = (IsAbruptCompletion status)
      if __x24__ {
        GLOBAL_context["LexicalEnvironment"] = oldEnv
        if (= iteratorKind CONST_async) {
          app __x25__ = (AsyncIteratorClose iteratorRecord status)
          if (is-completion __x25__) if (= __x25__["Type"] CONST_normal) __x25__ = __x25__["Value"] else return __x25__ else {}
          app __x26__ = (WrapCompletion __x25__)
          return __x26__
        } else {}
        if (= iterationKind CONST_enumerate) {
          app __x27__ = (WrapCompletion status)
          return __x27__
        } else {
          assert (= iterationKind CONST_iterate)
          app __x28__ = (IteratorClose iteratorRecord status)
          if (is-completion __x28__) if (= __x28__["Type"] CONST_normal) __x28__ = __x28__["Value"] else return __x28__ else {}
          app __x29__ = (WrapCompletion __x28__)
          return __x29__
        }
      } else {}
      access __x30__ = (stmt "Evaluation")
      let result = __x30__
      GLOBAL_context["LexicalEnvironment"] = oldEnv
      app __x31__ = (LoopContinues result labelSet)
      if (= __x31__ false) if (= iterationKind CONST_enumerate) {
        app __x32__ = (UpdateEmpty result V)
        app __x33__ = (Completion __x32__)
        app __x34__ = (WrapCompletion __x33__)
        return __x34__
      } else {
        assert (= iterationKind CONST_iterate)
        app __x35__ = (UpdateEmpty result V)
        status = __x35__
        if (= iteratorKind CONST_async) {
          app __x36__ = (AsyncIteratorClose iteratorRecord status)
          if (is-completion __x36__) if (= __x36__["Type"] CONST_normal) __x36__ = __x36__["Value"] else return __x36__ else {}
          app __x37__ = (WrapCompletion __x36__)
          return __x37__
        } else {}
        app __x38__ = (IteratorClose iteratorRecord status)
        if (is-completion __x38__) if (= __x38__["Type"] CONST_normal) __x38__ = __x38__["Value"] else return __x38__ else {}
        app __x39__ = (WrapCompletion __x38__)
        return __x39__
      } else {}
      if (! (= result["Value"] CONST_empty)) V = result["Value"] else {}
    }
  }"""), this)
}
