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

  // get prefix and suffix
  val (prefix, suffix) = targetAstStack match {
    case targetAst :: _ =>
      val scriptString = script.toString()
      logln(s"[NearSyntaxReplacer] From ```$scriptString'''")

      val prefix = scriptString.substring(0, targetAst.start)
      val suffix = scriptString.substring(targetAst.end)
      (prefix, suffix)
    case _ => ("", "")
  }

  def apply(script: Script): Script = {
    targetAstStack match {
      case targetAst :: _ =>
        val scriptString = script.toString()

        var newScriptString = scriptString
        var validity = false
        var parseResult = Parser.parse(Parser.Script(Nil), "")
        do {
          val mutated = SimpleReplacer(targetAst)
          newScriptString = s"$prefix${mutated.toString()}$suffix"
          validity = ValidityChecker(newScriptString)
          if (validity) parseResult = Parser.parse(Parser.Script(Nil), newScriptString)
        } while (!validity || !parseResult.successful)

        logln(s"[NearSyntaxReplacer] From ```$script'''")
        logln(s"[NearSyntaxReplacer] To   ```$newScriptString'''")

        parseResult.get
      case Nil => SimpleReplacer(script)
    }
  }
}
