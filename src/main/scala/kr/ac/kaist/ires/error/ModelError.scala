package kr.ac.kaist.ires.error

sealed abstract class ModelError(msg: String) extends IRESError(msg)

case object ModelNotYetGenerated extends ModelError({
  s"Models are not yet complete. Please implement models."
})

case class UnexpectedSemantics(name: String) extends ModelError({
  s"unexpected semantics: $name"
})

case class WrongNumberOfParserParams(name: String, list: List[Boolean]) extends ModelError({
  s"wrong number of parameters for $name: $list"
})

case class NotYetModeled(msg: String) extends ModelError({
  s"[NotYetModeled]: $msg"
})

case class NotSupported(msg: String) extends ModelError({
  s"[NotSupported]: $msg"
})
