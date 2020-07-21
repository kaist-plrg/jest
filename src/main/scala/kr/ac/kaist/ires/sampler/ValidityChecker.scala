package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.model.Script
import javax.script._

object ValidityChecker {
  def apply(script: String, debug: Boolean = false): Boolean = {
    val manager = new ScriptEngineManager
    val engine = manager.getEngineByName("Graal.js")
    val MESSAGE = "IRES-EXPECTED-EXCEPTION"
    if (engine == null) {
      Console.err.println("[WARNING] ValidityChecker always return true because Graal.js is not yet installed in this environment.")
      true
    } else try {
      val revised = s"'use strict'; throw '$MESSAGE'; $script"
      engine.eval(revised)
      false
    } catch {
      case e: ScriptException =>
        val pass = e.toString.endsWith(MESSAGE)
        if (debug && !pass) println(script)
        pass
    }
  }
}
