package kr.ac.kaist.jest.model

import scala.collection.immutable.{ Set => ScalaSet }

class AlgorithmInfo {
  var name: String = ""
  private var _props: ScalaSet[String] = ScalaSet()
  def props: ScalaSet[String] = _props

  // add property
  def +=(prop: String): Unit = _props += prop
  def ++=(props: ScalaSet[String]): Unit = _props ++= props
}
