package kr.ac.kaist.ires.core

// IR Properties
sealed trait RefValue extends CoreNode
case class RefValueId(id: Id) extends RefValue
case class RefValueProp(addr: Addr, value: Value) extends RefValue
case class RefValueString(str: String, name: Value) extends RefValue
