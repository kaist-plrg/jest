package kr.ac.kaist.ires.generator

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.spec._

object GrammarGenerator {
  def apply(packageName: String, modelDir: String, grammar: Grammar): Unit = {
    ASTGenerator(packageName, modelDir, grammar)
    ParserGenerator(packageName, modelDir, grammar)
  }
}
