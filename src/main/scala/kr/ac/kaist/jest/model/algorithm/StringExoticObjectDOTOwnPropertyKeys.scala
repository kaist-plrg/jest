package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object StringExoticObjectDOTOwnPropertyKeys extends Algorithm {
  val name: String = "StringExoticObjectDOTOwnPropertyKeys"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StringExoticObject.OwnPropertyKeys" (O) => {
    let keys = (new [])
    let str = O.StringData
    app __x0__ = (Type str)
    assert (= __x0__ String)
    let len = str.length

    let i = 0i
    while (< i len) {
      app iStr = (ToString i)
      ! iStr
      append iStr -> keys
      i = (+ i 1i)
    }

    i = 0i
    let list = (map-keys O.SubMap)
    let arrayIndexKeys = (new [])
    let stringKeys = (new [])
    let symbolKeys = (new [])
    len = list.length
    while (< i len) {
      let P = list[i]
      app T = (Type P)
      if (= T "String") {
        app isArrayIndex = (IsArrayIndex P)
        if isArrayIndex {
          app n = (ToInteger P)
          ! n
          if (! (< n str.length)) append n -> arrayIndexKeys
          else {}
        } else append P -> stringKeys
      } else append P -> symbolKeys
      i = (+ i 1i)
    }

    len = arrayIndexKeys.length
    while (< 0i len) {
      let min = 0i
      let j = 1i
      while (< j len) {
        if (< arrayIndexKeys[j] arrayIndexKeys[min]) min = j else {}
        j = (+ j 1i)
      }
      app P = (ToString (pop arrayIndexKeys min))
      ! P
      append P -> keys
      len = (- len 1i)
    }

    i = 0i
    len = stringKeys.length
    while (< i len) {
      append stringKeys[i] -> keys
      i = (+ i 1i)
    }

    i = 0i
    len = symbolKeys.length
    while (< i len) {
      append symbolKeys[i] -> keys
      i = (+ i 1i)
    }

    app __x1__ = (WrapCompletion keys)
    return __x1__
  }"""), this)
}
