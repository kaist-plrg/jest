package kr.ac.kaist.ires.mutator

import kr.ac.kaist.ires.AST
import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.ir.Interp
import kr.ac.kaist.ires.sampler.ValidityChecker
import java.io.PrintWriter

object BranchExprReplacer extends Mutator with Walker {
  def logln(any: Any, stdout: Boolean = true): Unit = {
    nf match {
      case Some(nf) =>
        nf.println(any)
      case None => ()
    }
    if (debug && stdout) println(any)
  }

  var debug = false
  var nf: Option[PrintWriter] = None

  var prefix = ""
  var suffix = ""
  var targetAstStack: List[AST] = List()

  def setTarget(uid: Int, script: Script): Unit = {
    script.updateSpan(0)
    val interp = new Interp(targetInst = Some(uid))
    val initSt = ModelHelper.initState(script)
    interp(initSt)
    targetAstStack = interp.targetAstStack.get
    targetAstStack match {
      case targetAst :: _ =>
        val scriptString = script.toString()
        logln(s"[BranchExprReplacer] From ```$scriptString'''")

        prefix = scriptString.substring(0, targetAst.start)
        suffix = scriptString.substring(targetAst.end)
      case _ => ()
    }
  }

  def apply(script: Script): Script = {
    targetAstStack match {
      case targetAst :: _ =>
        val scriptString = script.toString()

        var newScriptString = scriptString
        var validity = false
        var parseResult = Parser.parse(Parser.Script(Nil), "")
        do {
          val mutated = SimpleExprReplacer(targetAst)
          newScriptString = s"$prefix${mutated.toString()}$suffix"
          validity = ValidityChecker(newScriptString)
          if (validity) parseResult = Parser.parse(Parser.Script(Nil), newScriptString)
        } while (!validity || !parseResult.successful)

        //logln(s"[BranchExprReplacer] From ```$script'''")
        //logln(s"[BranchExprReplacer] To   ```$newScriptString'''")

        parseResult.get
      case Nil => SimpleExprReplacer(script)
    }
  }
}
