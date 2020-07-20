package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.model.Script
import javax.script._

object ValidityChecker {
  val manager = new ScriptEngineManager
  val engine = manager.getEngineByName("Graal.js")
  val MESSAGE = "IRES-EXPECTED-EXCEPTION"

  def apply(script: String): Boolean = if (engine == null) {
    Console.err.println("[WARNING] ValidityChecker always return true because Graal.js is not yet installed in this environment.")
    true
  } else try {
    val revised = s"'use strict'; throw '$MESSAGE'; $script"
    engine.eval(revised)
    false
  } catch {
    case e: ScriptException => e.toString.endsWith(MESSAGE)
  }
}
