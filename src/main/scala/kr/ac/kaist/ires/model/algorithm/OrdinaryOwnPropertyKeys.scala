package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryOwnPropertyKeys extends Algorithm {
  val name: String = "OrdinaryOwnPropertyKeys"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryOwnPropertyKeys" (O) => {
    let keys = (new [])

    let i = 0i
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
          append n -> arrayIndexKeys
        } else append P -> stringKeys
      } else append P -> symbolKeys
      i = (+ i 1i)
    }

    i = 0i
    len = arrayIndexKeys.length
    while (< i len) {
      let j = (+ i 1i)
      while (< j len) {
        if (< arrayIndexKeys[j] arrayIndexKeys[i]) {
          let tmp = arrayIndexKeys[i]
          arrayIndexKeys[i] = arrayIndexKeys[j]
          arrayIndexKeys[j] = tmp
        } else {}
        j = (+ j 1i)
      }
      app P = (ToString arrayIndexKeys[i])
      ! P
      append P -> keys
      i = (+ i 1i)
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

    return keys
  }"""), this)
}
