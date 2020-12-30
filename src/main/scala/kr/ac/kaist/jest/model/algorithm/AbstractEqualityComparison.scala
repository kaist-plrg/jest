package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.BUG_FIX
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AbstractEqualityComparison extends Algorithm {
  val name: String = "AbstractEqualityComparison"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(if (BUG_FIX) fixed else es11), this)
  private def es11 = """"AbstractEqualityComparison" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (= __x0__ __x1__) {
      app __x2__ = (StrictEqualityComparison x y)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    if (&& (= x null) (= y undefined)) {
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    if (&& (= x undefined) (= y null)) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    app __x6__ = (Type x)
    let __x7__ = (= __x6__ Number)
    if __x7__ {
      app __x8__ = (Type y)
      __x7__ = (= __x8__ String)
    } else {}
    if __x7__ {
      app __x9__ = (ToNumber y)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      app __x10__ = (AbstractEqualityComparison x __x9__)
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (Type x)
    let __x13__ = (= __x12__ String)
    if __x13__ {
      app __x14__ = (Type y)
      __x13__ = (= __x14__ Number)
    } else {}
    if __x13__ {
      app __x15__ = (ToNumber x)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      app __x16__ = (AbstractEqualityComparison __x15__ y)
      app __x17__ = (WrapCompletion __x16__)
      return __x17__
    } else {}
    app __x18__ = (Type x)
    let __x19__ = (= __x18__ BigInt)
    if __x19__ {
      app __x20__ = (Type y)
      __x19__ = (= __x20__ String)
    } else {}
    if __x19__ {
      app __x21__ = (StringToBigInt y)
      if (is-completion __x21__) if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
      let n = __x21__
      if (= n NaN) {
        app __x22__ = (WrapCompletion false)
        return __x22__
      } else {}
      app __x23__ = (AbstractEqualityComparison x n)
      app __x24__ = (WrapCompletion __x23__)
      return __x24__
    } else {}
    app __x25__ = (Type x)
    let __x26__ = (= __x25__ String)
    if __x26__ {
      app __x27__ = (Type y)
      __x26__ = (= __x27__ BigInt)
    } else {}
    if __x26__ {
      app __x28__ = (AbstractEqualityComparison y x)
      app __x29__ = (WrapCompletion __x28__)
      return __x29__
    } else {}
    app xT = (Type x)
    app yT = (Type y)
    if (= xT Boolean) {
      app xN = (ToNumber x)
      ! xN
      app result = (AbstractEqualityComparison xN y)
      return result
    } else {}
    if (= yT Boolean) {
      app yN = (ToNumber y)
      ! yN
      app result = (AbstractEqualityComparison x yN)
      return result
    } else {}
    app __x42__ = (Type x)
    let __x43__ = (|| (|| (|| (= __x42__ String) (= __x42__ Number)) (= __x42__ BigInt)) (= __x42__ Symbol))
    if __x43__ {
      app __x44__ = (Type y)
      __x43__ = (= __x44__ Object)
    } else {}
    if __x43__ {
      app __x45__ = (ToPrimitive y)
      app __x46__ = (AbstractEqualityComparison x __x45__)
      app __x47__ = (WrapCompletion __x46__)
      return __x47__
    } else {}
    app __x48__ = (Type x)
    let __x49__ = (= __x48__ Object)
    if __x49__ {
      app __x50__ = (Type y)
      __x49__ = (|| (|| (|| (= __x50__ String) (= __x50__ Number)) (= __x50__ BigInt)) (= __x50__ Symbol))
    } else {}
    if __x49__ {
      app __x51__ = (ToPrimitive x)
      app __x52__ = (AbstractEqualityComparison __x51__ y)
      app __x53__ = (WrapCompletion __x52__)
      return __x53__
    } else {}
    if (|| (&& (= __x0__ BigInt) (= __x1__ Number)) (&& (= __x0__ Number) (= __x1__ BigInt))) {
      if (= x NaN) return false
      else if (= x +Infinity) return false
      else if (= x -Infinity) return false
      else if (= y NaN) return false
      else if (= y +Infinity) return false
      else if (= y -Infinity) return false
      else if (= x y) return true
      else return false
    } else {}
    app __x61__ = (WrapCompletion false)
    return __x61__
  }"""
  private def fixed = """"AbstractEqualityComparison" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (= __x0__ __x1__) {
      app __x2__ = (StrictEqualityComparison x y)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    if (&& (= x null) (= y undefined)) {
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    if (&& (= x undefined) (= y null)) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    app __x6__ = (Type x)
    let __x7__ = (= __x6__ Number)
    if __x7__ {
      app __x8__ = (Type y)
      __x7__ = (= __x8__ String)
    } else {}
    if __x7__ {
      app __x9__ = (ToNumber y)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      app __x10__ = (AbstractEqualityComparison x __x9__)
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (Type x)
    let __x13__ = (= __x12__ String)
    if __x13__ {
      app __x14__ = (Type y)
      __x13__ = (= __x14__ Number)
    } else {}
    if __x13__ {
      app __x15__ = (ToNumber x)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      app __x16__ = (AbstractEqualityComparison __x15__ y)
      app __x17__ = (WrapCompletion __x16__)
      return __x17__
    } else {}
    app __x18__ = (Type x)
    let __x19__ = (= __x18__ BigInt)
    if __x19__ {
      app __x20__ = (Type y)
      __x19__ = (= __x20__ String)
    } else {}
    if __x19__ {
      app __x21__ = (StringToBigInt y)
      if (is-completion __x21__) if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
      let n = __x21__
      if (= n NaN) {
        app __x22__ = (WrapCompletion false)
        return __x22__
      } else {}
      app __x23__ = (AbstractEqualityComparison x n)
      app __x24__ = (WrapCompletion __x23__)
      return __x24__
    } else {}
    app __x25__ = (Type x)
    let __x26__ = (= __x25__ String)
    if __x26__ {
      app __x27__ = (Type y)
      __x26__ = (= __x27__ BigInt)
    } else {}
    if __x26__ {
      app __x28__ = (AbstractEqualityComparison y x)
      app __x29__ = (WrapCompletion __x28__)
      return __x29__
    } else {}
    app xT = (Type x)
    app yT = (Type y)
    if (= xT Boolean) {
      app xN = (ToNumber x)
      ! xN
      app result = (AbstractEqualityComparison xN y)
      return result
    } else {}
    if (= yT Boolean) {
      app yN = (ToNumber y)
      ! yN
      app result = (AbstractEqualityComparison x yN)
      return result
    } else {}
    app __x42__ = (Type x)
    let __x43__ = (|| (|| (|| (= __x42__ String) (= __x42__ Number)) (= __x42__ BigInt)) (= __x42__ Symbol))
    if __x43__ {
      app __x44__ = (Type y)
      __x43__ = (= __x44__ Object)
    } else {}
    if __x43__ {
      app __x45__ = (ToPrimitive y)
      ? __x45__
      app __x46__ = (AbstractEqualityComparison x __x45__)
      app __x47__ = (WrapCompletion __x46__)
      return __x47__
    } else {}
    app __x48__ = (Type x)
    let __x49__ = (= __x48__ Object)
    if __x49__ {
      app __x50__ = (Type y)
      __x49__ = (|| (|| (|| (= __x50__ String) (= __x50__ Number)) (= __x50__ BigInt)) (= __x50__ Symbol))
    } else {}
    if __x49__ {
      app __x51__ = (ToPrimitive x)
      ? __x51__
      app __x52__ = (AbstractEqualityComparison __x51__ y)
      app __x53__ = (WrapCompletion __x52__)
      return __x53__
    } else {}
    if (|| (&& (= __x0__ BigInt) (= __x1__ Number)) (&& (= __x0__ Number) (= __x1__ BigInt))) {
      if (= x NaN) return false
      else if (= x +Infinity) return false
      else if (= x -Infinity) return false
      else if (= y NaN) return false
      else if (= y +Infinity) return false
      else if (= y -Infinity) return false
      else if (= x y) return true
      else return false
    } else {}
    app __x61__ = (WrapCompletion false)
    return __x61__
  }"""
}
