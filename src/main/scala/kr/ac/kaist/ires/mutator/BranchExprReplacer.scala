package kr.ac.kaist.ires.mutator

import kr.ac.kaist.ires.AST
import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.ir.{ Interp, Inst }
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.sampler.{ NRSampler, ValueSampler }
import kr.ac.kaist.ires.sampler.ValidityChecker

object BranchExprReplacer extends Mutator with Walker {
  var target: Option[Int] = None

  def apply(script: Script): Script = {
    target match {
      case Some(_) =>
        script.updateSpan(0)
        val interp = new Interp(targetInst = target)
        val initSt = ModelHelper.initState(script)
        interp(initSt)

        interp.targetAstStack.get match {
          case targetAst :: _ =>
            val scriptString = script.toString()

            val prefix = scriptString.substring(0, targetAst.start)
            val suffix = scriptString.substring(targetAst.end)

            val algo = Inst.instToAlgo(target.get)
            val inst = Inst.insts(target.get)

            var newScriptString = scriptString
            do {
              val mutated = SimpleExprReplacer(targetAst)
              newScriptString = s"$prefix${mutated.toString()}$suffix"
            } while (!ValidityChecker(newScriptString))

            Parser.parse(Parser.Script(Nil), newScriptString).get
          case Nil => (script)
        }
      case None => (script)
    }
  }
}