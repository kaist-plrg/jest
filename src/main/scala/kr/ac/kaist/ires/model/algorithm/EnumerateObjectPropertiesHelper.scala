package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EnumerateObjectPropertiesHelper extends Algorithm {
  val name: String = "EnumerateObjectPropertiesHelper"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""EnumerateObjectPropertiesHelper" ( O , listAll, listEnum ) => {
    app a = (O.OwnPropertyKeys O)
    ? a
    print a
    let __x0__ = 0i
    while (< __x0__ a.length) {
      let P = a[__x0__]
      print O.SubMap
      print P
      if (&& (= (typeof P) "String") (! (contains listAll P))) {
        append P -> listAll
        app desc = (O.GetOwnProperty O P)
        ! desc
        if (= desc.Enumerable true) append P -> listEnum else {}
      } else {}
      __x0__ = (+ __x0__ 1i)
    }
    app proto = (O.GetPrototypeOf O)
    if (= null proto) return listEnum
    else {
      app __x1__ = (EnumerateObjectPropertiesHelper proto listAll listEnum)
      return __x1__
    }
  }"""), this)
}
