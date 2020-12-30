package kr.ac.kaist.jest.util

import kr.ac.kaist.jest.DEBUG_FILTER
import kr.ac.kaist.jest.parser.{ MetaParser, MetaData, Negative }
import spray.json._

case class Test262Config(negative: Option[Negative], includes: List[String], flags: List[String])
case class Test262ConfigSummary(summary: Map[String, Test262Config]) {
  def nameList: List[String] = summary.toList.map { case (name, _) => name }
  def apply(filename: String): Test262Config = summary(filename)
}

object TestConfigJsonProtocol extends DefaultJsonProtocol {
  implicit val negativeFormat = jsonFormat2(Negative)
  implicit val test262ConfigFormat = jsonFormat3(Test262Config)
  implicit val test262ConfigSummaryFormat = jsonFormat1(Test262ConfigSummary)
}

case class TestList(list: List[MetaData]) {
  def length: Int = list.length
  def remove(desc: String, f: MetaData => Boolean): TestList = {
    val (filtered, removed) = list.foldLeft(List[MetaData](), 0) {
      case ((l, count), meta) =>
        if (f(meta)) (l, count + 1)
        else (meta :: l, count)
    }
    if (DEBUG_FILTER) println(f"$desc%-30s: $removed tests are removed")
    TestList(filtered.reverse)
  }
  def getSummary: Test262ConfigSummary = Test262ConfigSummary(list.map {
    case MetaData(name, n, f, i, _, _) => name -> Test262Config(n, i, f)
  }.toMap)
}
