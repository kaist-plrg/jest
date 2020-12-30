package kr.ac.kaist.jest.sampler

import java.io.OutputStream
import javax.script._
import kr.ac.kaist.jest.LINE_SEP
import kr.ac.kaist.jest.generator.Generator
import kr.ac.kaist.jest.model.Script
import kr.ac.kaist.jest.util.Useful._
import sys.process._
import java.util.concurrent.LinkedBlockingQueue
import io.Source
import com.eclipsesource.v8._
import com.eclipsesource.v8.utils.MemoryManager

object ValidityChecker {
  val MESSAGE = "JEST-EXPECTED-EXCEPTION"
  var v8runtime: Option[V8] = None
  val checker = try {
    v8runtime = Some(V8.createV8Runtime)
    useNativeV8(_, _)
  } catch {
    case e: java.lang.IllegalStateException =>
      Console.err.println("[WARNING] Cannot find j2v8 external native library. Instead, ValiditiChecker uses GraalJS")
      useGraalJs(_, _)
  }

  def apply(script: String, debug: Boolean = false): Boolean =
    checker(script, debug)

  def useGraalJs(script: String, debug: Boolean = false): Boolean = {
    val manager = new ScriptEngineManager
    val engine = manager.getEngineByName("Graal.js")
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

  def useNodeJs(script: String, debug: Boolean = false): Boolean = {
    var pass = false
    val logger = ProcessLogger(_ => {}, str => if (str == MESSAGE) pass = true)
    val status = s"""node --trace-uncaught -e "'use strict'; throw '$MESSAGE'; $script"""" ! logger
    pass
  }

  def useNativeV8(script: String, debug: Boolean = false): Boolean = {
    var pass = false

    try {
      val revised = s"'use strict'; throw '$MESSAGE'; $script"
      v8runtime.get.executeScript(revised)
    } catch {
      case e: V8ScriptCompilationException =>
        pass = false
        if (debug && !pass) println(script)
      case e: V8ScriptExecutionException =>
        pass = e.toString.split(LINE_SEP)(0).endsWith(MESSAGE)
        if (debug && !pass) println(script)
    }
    v8runtime.get.resetContext
    pass
  }

  def test: Unit = {
    println(s"Loading samples...")
    val samples = Generator.getSample().map(_.toString)
    println(s"Finished loading.")
    val (gres, graaljs) = time(samples.map(s => (s, useGraalJs(s))))
    println(s"GraalJs took $graaljs ms.")
    val (nres, nodejs) = time(samples.map(s => (s, useNodeJs(s))))
    println(s"Node.js took $nodejs ms.")
    val (vres, nativeV8) = time(samples.map(s => (s, useNativeV8(s))))
    println(s"Native V8 took $nativeV8 ms.")

    ((gres zip nres) zip samples).foreach {
      case ((g, n), s) => if (g != n) println(s)
    }

    println("----------------")

    ((nres zip vres) zip samples).foreach {
      case ((g, n), s) => if (g != n) println(s)
    }
  }
}
