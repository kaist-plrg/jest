package kr.ac.kaist.ase.model

import kr.ac.kaist.ase.core.Parser._
import kr.ac.kaist.ase.core._
object ToObject {
  val func: Func = Func("ToObject", List(Id("argument")), None, parseInst(
    s"""{
          let atype = (typeof argument)
          if (= atype "Undefined") {
            return (new Completion ( "Type" -> normal, "Value" -> (new TypeError ()), "Target" -> empty ))
          } else if (= atype "Null") {
            return (new Completion ( "Type" -> normal, "Value" -> (new TypeError ()), "Target" -> empty ))
          } else if (= atype "Boolean") {
            return (new Completion ( "Type" -> normal, "Value" -> (new TypeError ()), "Target" -> empty ))
          } else if (= atype "Number") {
            return (new Completion ( "Type" -> normal, "Value" -> (new TypeError ()), "Target" -> empty ))
          } else if (= atype "String") {
            return (new Completion ( "Type" -> normal, "Value" -> (new TypeError ()), "Target" -> empty ))
          } else if (= atype "Symbol") {
            return (new Completion ( "Type" -> normal, "Value" -> (new TypeError ()), "Target" -> empty ))
          } else if (= atype "Object") {
            return argument
          } else {
            return argumeht
          }
        }"""
  ))
}