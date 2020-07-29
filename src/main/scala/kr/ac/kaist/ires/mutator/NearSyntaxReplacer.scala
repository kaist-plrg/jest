package kr.ac.kaist.ires.mutator

import kr.ac.kaist.ires.AST
import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.ir.Interp
import kr.ac.kaist.ires.sampler.ValidityChecker
import kr.ac.kaist.ires.util.Useful._
import java.io.PrintWriter

case class NearSyntaxReplacer(
    uid: Int,
    script: Script,
    filename: Option[String] = None,
    debug: Boolean = false
) extends Mutator with Walker {
  // script string
  val scriptString = script.toString

  // logging
  val nf = filename.map(getPrintWriter(_))
  def logln(any: Any, stdout: Boolean = true): Unit = {
    nf.map(_.println(any))
    if (debug && stdout) println(any)
  }

  // update span
  script.updateSpan(0)

  // set targets
  val interp = new Interp(targetInst = Some(uid))
  val initSt = ModelHelper.initState(script)
  interp(initSt)
  val targetAstStack: List[AST] = interp.targetAstStack.get

  // weight of random choice
  val weight = if (targetAstStack.length > 0) IMPORTANT else 0

  // get prefix and suffix
  val posOpt = targetAstStack match {
    case targetAst :: _ if targetAst.start != -1 =>
      val scriptString = script.toString()
      logln(s"[NearSyntaxReplacer] From ```$scriptString'''")
      val prefix = scriptString.substring(0, targetAst.start)
      val suffix = scriptString.substring(targetAst.end)
      Some((prefix, suffix))
    case _ => None
  }

  // optional mutation
  val dummyResult = Parser.parse(Parser.Script(Nil), "")
  def mutateOption: Option[Script] = (targetAstStack, posOpt) match {
    case (targetAst :: _, Some((prefix, suffix))) =>
      var newScriptString = scriptString
      var validity = false
      var parseResult = dummyResult

      do {
        val mutated = SimpleReplacer(targetAst)
        newScriptString = s"$prefix${mutated.toString()}$suffix"
        validity = ValidityChecker(newScriptString)
        if (validity) parseResult = Parser.parse(Parser.Script(Nil), newScriptString)
      } while (!validity || !parseResult.successful)

      logln(s"[NearSyntaxReplacer] To   ```$newScriptString'''")

      Some(parseResult.get)
    case _ => None
  }
}
