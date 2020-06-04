package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ValidateAndApplyPropertyDescriptor extends Algorithm {
  val length: Int = 5
  val lang: Boolean = true
  val func: Func = parseFunc(""""ValidateAndApplyPropertyDescriptor" (O, P, extensible, Desc, current) => {
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
      } else {} else if (! (= O undefined)) {
        dp = (new AccessorProperty())
        if (! (= absent Desc["Get"])) dp["Get"] = Desc["Get"] else dp["Get"] = undefined
        if (! (= absent Desc["Set"])) dp["Set"] = Desc["Set"] else dp["Set"] = undefined
        if (! (= absent Desc["Enumerable"])) dp["Enumerable"] = Desc["Enumerable"] else dp["Enumerable"] = false
        if (! (= absent Desc["Configurable"])) dp["Configurable"] = Desc["Configurable"] else dp["Configurable"] = false
        O["SubMap"][P] = dp
      } else {}
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    if (&& (= absent Desc["Value"]) (&& (= absent Desc["Writable"]) (&& (= absent Desc["Get"]) (&& (= absent Desc["Set"]) (&& (= absent Desc["Enumerable"]) (= absent Desc["Configurable"])))))) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    if (= current["Configurable"] false) {
      if (= Desc["Configurable"] true) {
        app __x6__ = (WrapCompletion false)
        return __x6__
      } else {}
      if (&& (! (= absent Desc["Enumerable"])) (|| (&& (= true current["Enumerable"]) (= false Desc["Enumerable"])) (&& (= false current["Enumerable"]) (= true Desc["Enumerable"])))) {
        app __x7__ = (WrapCompletion false)
        return __x7__
      } else {}
    } else {}
    app __x8__ = (IsGenericDescriptor Desc)
    if (= __x8__ true) {} else {
      app __x9__ = (IsDataDescriptor current)
      app __x10__ = (IsDataDescriptor Desc)
      if (! (= __x9__ __x10__)) {
        if (= current["Configurable"] false) {
          app __x11__ = (WrapCompletion false)
          return __x11__
        } else {}
        app __x12__ = (IsDataDescriptor current)
        if (= __x12__ true) if (! (= O undefined)) {
          let __x13__ = O["SubMap"][P]
          O["SubMap"][P] = (new AccessorProperty("Get" -> undefined, "Set" -> undefined, "Enumerable" -> __x13__["Enumerable"], "Configurable" -> __x13__["Configurable"]))
        } else {} else if (! (= O undefined)) {
          let __x14__ = O["SubMap"][P]
          O["SubMap"][P] = (new DataProperty("Value" -> undefined, "Writable" -> false, "Enumerable" -> __x14__["Enumerable"], "Configurable" -> __x14__["Configurable"]))
        } else {}
      } else {
        app __x15__ = (IsDataDescriptor current)
        app __x16__ = (IsDataDescriptor Desc)
        if (&& (= __x15__ true) (= __x16__ true)) if (&& (= current["Configurable"] false) (= current["Writable"] false)) {
          if (&& (! (= Desc["Writable"] absent)) (= Desc["Writable"] true)) {
            app __x17__ = (WrapCompletion false)
            return __x17__
          } else {}
          let __x18__ = (! (= Desc["Value"] absent))
          if __x18__ {
            app __x19__ = (SameValue Desc["Value"] current["Value"])
            __x18__ = (= __x19__ false)
          } else {}
          if __x18__ {
            app __x20__ = (WrapCompletion false)
            return __x20__
          } else {}
          app __x21__ = (WrapCompletion true)
          return __x21__
        } else {} else if (= current["Configurable"] false) {
          let __x22__ = (! (= Desc["Set"] absent))
          if __x22__ {
            app __x23__ = (SameValue Desc["Set"] current["Set"])
            __x22__ = (= __x23__ false)
          } else {}
          if __x22__ {
            app __x24__ = (WrapCompletion false)
            return __x24__
          } else {}
          let __x25__ = (! (= Desc["Get"] absent))
          if __x25__ {
            app __x26__ = (SameValue Desc["Get"] current["Get"])
            __x25__ = (= __x26__ false)
          } else {}
          if __x25__ {
            app __x27__ = (WrapCompletion false)
            return __x27__
          } else {}
          app __x28__ = (WrapCompletion true)
          return __x28__
        } else {}
      }
    }
    if (! (= O undefined)) {
      let __x29__ = (map-keys Desc)
      let __x30__ = 0i
      while (< __x30__ __x29__["length"]) {
        let __x31__ = __x29__[__x30__]
        O["SubMap"][P][__x31__] = Desc[__x31__]
        __x30__ = (+ __x30__ 1i)
      }
    } else {}
    app __x32__ = (WrapCompletion true)
    return __x32__
  }""")
}
