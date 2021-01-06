package kr.ac.kaist.jest.ir

trait Tag
case object NormalTag extends Tag
case object TimeoutTag extends Tag
case class IRErrorTag(uid: Int) extends Tag
case class ErrorThrowTag(name: String) extends Tag
case class ValueThrowTag(name: String) extends Tag
