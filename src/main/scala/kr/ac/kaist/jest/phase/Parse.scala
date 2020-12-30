package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest.{ LINE_SEP, JESTConfig }
import kr.ac.kaist.jest.model._
import kr.ac.kaist.jest.util._
import scala.io.Source
import Useful._

// Parse phase
case object Parse extends PhaseObj[Unit, ParseConfig, Script] {
  val name = "parse"
  val help = "parses AST files."

  def apply(
    unit: Unit,
    jestConfig: JESTConfig,
    config: ParseConfig
  ): Script = {
    val filename = getFirstFilename(jestConfig, "parse")
    val ast = Parser.parse(Parser.Script(Nil), fileReader(filename)).get
    ast
  }

  def defaultConfig: ParseConfig = ParseConfig()
  val options: List[PhaseOption[ParseConfig]] = Nil
}

// Parse phase config
case class ParseConfig() extends Config
