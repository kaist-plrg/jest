package kr.ac.kaist.jest.parser

import kr.ac.kaist.jest.RESOURCE_DIR
import kr.ac.kaist.jest.util.Useful._
import scala.util.matching.Regex
import scala.util.parsing.combinator.RegexParsers
import spray.json._

trait UnicodeRegex extends DefaultJsonProtocol { this: RegexParsers =>
  // special characters
  lazy val ZWNJ = "\u200C"
  lazy val ZWJ = "\u200D"
  lazy val ZWNBSP = "\uFEFF"

  lazy val TAB = "\u0009"
  lazy val VT = "\u000B"
  lazy val FF = "\u000C"
  lazy val SP = "\u0020"
  lazy val NBSP = "\u00A0"
  lazy val USP = "[\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]".r

  lazy val LF = "\u000A"
  lazy val CR = "\u000D"
  lazy val LS = "\u2028"
  lazy val PS = "\u2029"

  lazy val lines = "[\u000A\u000D\u2028\u2029]".r

  lazy val Unicode = "(?s).".r

  lazy val Comment = """/\*+[^*]*\*+(?:[^/*][^*]*\*+)*/|//[^\u000A\u000D\u2028\u2029]*""".r

  // require('unicode-13.0.0/Binary_Property/ID_Start/code-points')
  lazy val IDStartSet = readJson[Set[Int]](s"$RESOURCE_DIR/ID_Start.json")
  lazy val IDStart = Unicode.filter(ch => IDStartSet contains ch.codePointAt(0))

  // require('unicode-13.0.0/Binary_Property/ID_Continue/code-points')
  lazy val IDContinueSet = readJson[Set[Int]](s"$RESOURCE_DIR/ID_Continue.json")
  lazy val IDContinue = Unicode.filter(ch => IDContinueSet contains ch.codePointAt(0))
}
object UnicodeRegex {
  val WSLT = "[\uFEFF\u0009\u000B\u000C\u0020\u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\u000A\u000D\u2028\u2029]".r
}
