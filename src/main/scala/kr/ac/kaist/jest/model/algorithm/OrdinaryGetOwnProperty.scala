package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OrdinaryGetOwnProperty extends Algorithm {
  val name: String = "OrdinaryGetOwnProperty"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryGetOwnProperty" (O, P) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    if (= O["SubMap"][P] absent) return undefined else {}
    let D = (new PropertyDescriptor("SubMap" -> (new SubMap())))
    let X = O["SubMap"][P]
    app __x1__ = (IsDataDescriptor X)
    if __x1__ {
      D["Value"] = X["Value"]
      D["Writable"] = X["Writable"]
    } else {
      app __x2__ = (IsAccessorDescriptor X)
      assert __x2__
      D["Get"] = X["Get"]
      D["Set"] = X["Set"]
    }
    D["Enumerable"] = X["Enumerable"]
    D["Configurable"] = X["Configurable"]
    return D
  }"""), this)
}
