package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Type extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""Type" (argument) => {
    val t = (typeof argument)
    if (|| (= t "ArgumentsExoticObject")
      (|| (= t "ArrayExoticObject")
      (|| (= t "BoundFunctionExoticObject")
      (|| (= t "BuiltinFunctionObject")
      (|| (= t "ECMAScriptFunctionObject")
      (|| (= t "ImmutablePrototypeExoticObject")
      (|| (= t "IntegerIndexedExoticObject")
      (|| (= t "ModuleNamespaceExoticObject")
      (|| (= t "OrdinaryObject")
      (|| (= t "ProxyExoticObject")
      (= t "StringExoticObject"))))))))))) return "Object"
    else return t
  }""")
}
