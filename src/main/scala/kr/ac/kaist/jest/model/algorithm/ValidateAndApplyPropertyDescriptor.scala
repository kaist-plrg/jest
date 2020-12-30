package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ValidateAndApplyPropertyDescriptor extends Algorithm {
  val name: String = "ValidateAndApplyPropertyDescriptor"
  val length: Int = 5
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ValidateAndApplyPropertyDescriptor" (O, P, extensible, Desc, current) => {
    if (= current undefined) {
      if (= extensible false) {
        app __x0__ = (WrapCompletion false)
        return __x0__
      } else {}
      assert (= extensible true)
      app __x1__ = (IsGenericDescriptor Desc)
      let __x2__ = (= __x1__ true)
      if __x2__ {} else {
        app __x3__ = (IsDataDescriptor Desc)
        __x2__ = (= __x3__ true)
      }
      if __x2__ if (! (= O undefined)) {
        dp = (new DataProperty())
        if (! (= absent Desc["Value"])) dp["Value"] = Desc["Value"] else dp["Value"] = undefined
        if (! (= absent Desc["Writable"])) dp["Writable"] = Desc["Writable"] else dp["Writable"] = false
        if (! (= absent Desc["Enumerable"])) dp["Enumerable"] = Desc["Enumerable"] else dp["Enumerable"] = false
        if (! (= absent Desc["Configurable"])) dp["Configurable"] = Desc["Configurable"] else dp["Configurable"] = false
        O["SubMap"][P] = dp
      } else {} else {
        app __x4__ = (IsAccessorDescriptor Desc)
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        assert (= __x4__ true)
        if (! (= O undefined)) {
          dp = (new AccessorProperty())
          if (! (= absent Desc["Get"])) dp["Get"] = Desc["Get"] else dp["Get"] = undefined
          if (! (= absent Desc["Set"])) dp["Set"] = Desc["Set"] else dp["Set"] = undefined
          if (! (= absent Desc["Enumerable"])) dp["Enumerable"] = Desc["Enumerable"] else dp["Enumerable"] = false
          if (! (= absent Desc["Configurable"])) dp["Configurable"] = Desc["Configurable"] else dp["Configurable"] = false
          O["SubMap"][P] = dp
        } else {}
      }
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    if (&& (= absent Desc["Value"]) (&& (= absent Desc["Writable"]) (&& (= absent Desc["Get"]) (&& (= absent Desc["Set"]) (&& (= absent Desc["Enumerable"]) (= absent Desc["Configurable"])))))) {
      app __x6__ = (WrapCompletion true)
      return __x6__
    } else {}
    if (= current["Configurable"] false) {
      if (= Desc["Configurable"] true) {
        app __x7__ = (WrapCompletion false)
        return __x7__
      } else {}
      let __x8__ = (! (= Desc["Enumerable"] absent))
      if __x8__ {
        app __x9__ = (SameValue Desc["Enumerable"] current["Enumerable"])
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        __x8__ = (= __x9__ false)
      } else {}
      if __x8__ {
        app __x10__ = (WrapCompletion false)
        return __x10__
      } else {}
    } else {}
    app __x11__ = (IsGenericDescriptor Desc)
    if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    if (= __x11__ true) {} else {
      app __x12__ = (IsDataDescriptor current)
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      app __x13__ = (IsDataDescriptor Desc)
      if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      app __x14__ = (SameValue __x12__ __x13__)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      if (= __x14__ false) {
        if (= current["Configurable"] false) {
          app __x15__ = (WrapCompletion false)
          return __x15__
        } else {}
        app __x16__ = (IsDataDescriptor current)
        if (= __x16__ true) if (! (= O undefined)) {
          let __x17__ = O["SubMap"][P]
          O["SubMap"][P] = (new AccessorProperty("Get" -> undefined, "Set" -> undefined, "Enumerable" -> __x17__["Enumerable"], "Configurable" -> __x17__["Configurable"]))
        } else {} else if (! (= O undefined)) {
          let __x18__ = O["SubMap"][P]
          O["SubMap"][P] = (new DataProperty("Value" -> undefined, "Writable" -> false, "Enumerable" -> __x18__["Enumerable"], "Configurable" -> __x18__["Configurable"]))
        } else {}
      } else {
        app __x19__ = (IsDataDescriptor current)
        app __x20__ = (IsDataDescriptor Desc)
        if (&& (= __x19__ true) (= __x20__ true)) if (&& (= current["Configurable"] false) (= current["Writable"] false)) {
          if (&& (! (= Desc["Writable"] absent)) (= Desc["Writable"] true)) {
            app __x21__ = (WrapCompletion false)
            return __x21__
          } else {}
          let __x22__ = (! (= Desc["Value"] absent))
          if __x22__ {
            app __x23__ = (SameValue Desc["Value"] current["Value"])
            __x22__ = (= __x23__ false)
          } else {}
          if __x22__ {
            app __x24__ = (WrapCompletion false)
            return __x24__
          } else {}
          app __x25__ = (WrapCompletion true)
          return __x25__
        } else {} else {
          app __x26__ = (IsAccessorDescriptor current)
          if (is-completion __x26__) if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
          app __x27__ = (IsAccessorDescriptor Desc)
          if (is-completion __x27__) if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
          assert (&& (= __x26__ true) (= __x27__ true))
          if (= current["Configurable"] false) {
            let __x28__ = (! (= Desc["Set"] absent))
            if __x28__ {
              app __x29__ = (SameValue Desc["Set"] current["Set"])
              __x28__ = (= __x29__ false)
            } else {}
            if __x28__ {
              app __x30__ = (WrapCompletion false)
              return __x30__
            } else {}
            let __x31__ = (! (= Desc["Get"] absent))
            if __x31__ {
              app __x32__ = (SameValue Desc["Get"] current["Get"])
              __x31__ = (= __x32__ false)
            } else {}
            if __x31__ {
              app __x33__ = (WrapCompletion false)
              return __x33__
            } else {}
            app __x34__ = (WrapCompletion true)
            return __x34__
          } else {}
        }
      }
    }
    if (! (= O undefined)) {
      let __x35__ = (map-keys Desc)
      let __x36__ = 0i
      while (< __x36__ __x35__["length"]) {
        let __x37__ = __x35__[__x36__]
        O["SubMap"][P][__x37__] = Desc[__x37__]
        __x36__ = (+ __x36__ 1i)
      }
    } else {}
    app __x38__ = (WrapCompletion true)
    return __x38__
  }"""), this)
}
