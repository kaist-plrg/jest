package kr.ac.kaist.ires.sampler

import javax.script._

object ValidityChecker {
  val manager = new ScriptEngineManager
  val engine = manager.getEngineByName("Graal.js")
  val MESSAGE = "IRES-EXPECTED-EXCEPTION"

  def apply(script: String): Boolean = {
    if (engine == null) {
      Console.err.println("[WARNING] ValidityChecker always return true because Graal.js is not yet installed in thie environment.")
      return true
    }
    val revised = s"'use strict'; throw '$MESSAGE'; $script"
    try {
      engine.eval(script)
      false
    } catch {
      case e: ScriptException => e.toString.endsWith(MESSAGE)
    }
  }
}
