package kr.ac.kaist.ires.localizer

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.generator.Generator
import kr.ac.kaist.ires.ir.beautify
import kr.ac.kaist.ires.ir.Inst._
import kr.ac.kaist.ires.model.{ Algorithm, Script }
import kr.ac.kaist.ires.model.Parser._
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.util.Useful._
import spray.json._
import scala.collection.immutable.ListMap
import scala.math.Ordering.Double.IeeeOrdering

import kr.ac.kaist.ires.mutator._
import kr.ac.kaist.ires.sampler.ValidityChecker
import kr.ac.kaist.ires.injector._
import kr.ac.kaist.ires.checker._

class Localizer(formula: Formula) {
  def getSortedScore[T](m: Map[T, Stat]): ListMap[T, Double] =
    ListMap(m.view.mapValues(_.getScore(formula)).toSeq.sortWith(_._2 > _._2): _*)

  // instruction localizer
  val instCounter: Map[Int, Stat] =
    insts.map(inst => (inst.uid, Stat())).toMap
  lazy val instScores: ListMap[Int, Double] = getSortedScore(instCounter)
  def updateInst(covered: Set[Int], failed: Boolean) =
    instCounter.foreach {
      case (uid, stat) =>
        stat.update(covered contains uid, failed)
    }
  private def dumpInst(filepath: String): Unit = {
    val instContent = instScores.zipWithIndex.map {
      case ((uid, score), rank) => {
        val algoName = instToAlgo(uid).name
        val inst = beautify(insts(uid), detail = false)
        f"$rank%6d $score%6.2f [$uid] $inst @ $algoName"
      }
    }.mkString(LINE_SEP)
    dumpFile(instContent, filepath)
  }

  // algorithm localizer
  val algoCounter: Map[String, Stat] =
    Algorithm.all.map(algo => (algo.name, Stat())).toMap
  lazy val algoScores: ListMap[String, Double] = getSortedScore(algoCounter)
  def updateAlgo(covered: Set[String], failed: Boolean) =
    algoCounter.foreach {
      case (algoName, stat) =>
        stat.update(covered contains algoName, failed)
    }
  private def dumpAlgo(filepath: String): Unit = {
    val algoContent = algoScores.zipWithIndex.map {
      case ((algoName, score), rank) =>
        f"$rank%8d $score%8.4f $algoName"
    }.mkString(LINE_SEP)
    dumpFile(algoContent, filepath)
  }

  // method-level aggregation
  private def dumpAlgoAggregated(filepath: String): Unit = {
    var agAlgoScores: ListMap[String, Double] = ListMap()
    instScores.foreach {
      case (uid, score) => {
        val algoName = instToAlgo(uid).name
        if (!agAlgoScores.keySet.contains(algoName))
          agAlgoScores += algoName -> score
      }
    }

    val agAlgoContent = agAlgoScores.zipWithIndex.map {
      case ((algoName, score), rank) =>
        f"$rank%8d $score%8.4f $algoName"
    }.mkString(LINE_SEP)
    dumpFile(agAlgoContent, filepath)
  }

  // dump stat
  def dumpInstStat(filepath: String): Unit = {
    val content = instCounter.map {
      case (uid, stat) => s"[$uid]: $stat"
    }.mkString(LINE_SEP)
    dumpFile(content, filepath)
  }

  def dumpAlgoStat(filepath: String): Unit = {
    val content = algoCounter.map {
      case (uid, stat) => s"[$uid]: $stat"
    }.mkString(LINE_SEP)
    dumpFile(content, filepath)
  }

  def dump(dir: String) = {
    mkdir(dir)
    dumpInst(s"$dir/inst")
    dumpAlgo(s"$dir/algo")
    dumpAlgoAggregated(s"$dir/algo-aggregated")
    dumpInstStat(s"$dir/inst-stat")
    dumpAlgoStat(s"$dir/algo-stat")
  }
}

object Localizer {
  val MAX_FAILED_CNT = 100
  val MAX_TRIAL = 10000

  def apply(
    scriptDir: String,
    errorsDir: String,
    engine: String,
    failedDesc: String,
    failedScriptNames: Set[String],
    formula: Formula,
    mutate: Boolean
  ): Localizer = {
    val localizer = new Localizer(formula)
    val toJsonExt = changeExt("js", "json")
    var generatedSet: Set[String] = Set()
    var failedSet: Set[String] = Set()

    // update total structural element from scriptDir, failed
    for {
      file <- (walkTree(scriptDir) ++ walkTree(errorsDir))
      name = file.getName
      if jsFilter(name)
      filename = file.toString
      rawScript = readFile(filename)
      parseResult = parse(Script(Nil), rawScript) if parseResult.successful
      script = parseResult.get
      failed = failedScriptNames contains name
    } {
      // check if touched exist
      val touchedInstCache = s"$TOUCHED_DIR/inst/${toJsonExt(name)}"
      val touchedAlgoCache = s"$TOUCHED_DIR/algo/${toJsonExt(name)}"
      val cached = exists(touchedInstCache) && exists(touchedAlgoCache)

      var instCovered = Set[Int]()
      var algoCovered = Set[String]()

      if (cached) {
        // read from cache
        instCovered = readJson[Set[Int]](touchedInstCache)
        algoCovered = readJson[Set[String]](touchedAlgoCache)
      } else {
        val visited = Generator.getVisited(script) match {
          case Left(visited) => visited
          // TODO : handle exception?
          case _ => Generator.recentInterp.get.visited
        }
        instCovered = visited.instCovered
        algoCovered = visited.touchedAlgos
        // dump
        dumpJson(visited.instCovered, touchedInstCache)
        dumpJson(visited.touchedAlgos, touchedAlgoCache)
      }

      localizer.updateInst(instCovered, failed)
      localizer.updateAlgo(algoCovered, failed)

      // add to generatedSet, failedSet
      generatedSet += rawScript
      if (failed) failedSet += rawScript
    }

    // calibrate localize result
    if (mutate) {
      var trial = 0
      while (failedSet.size < MAX_FAILED_CNT && trial < MAX_TRIAL) {
        // sample one script from failed
        val target = choose(failedSet.toList)
        val script = parse(Script(Nil), target).get

        try {
          // mutate
          val mutator = choose(List[Mutator](
            StatementAppender(script),
            SimpleReplacer(script),
          ))
          var mutated = mutator.script
          do mutated = mutator.mutate while (!ValidityChecker(mutated.toString))
          val mutatedStr = mutated.toString

          if (!generatedSet.contains(mutatedStr)) {
            // inject
            val injector = Injector(mutated, timeout = Some(1))
            val injected = injector.result
            val visited = injector.visited

            // check
            // TODO : refactoring
            val tempPath = "__temp__.js"
            val comment = injected.split("\n").head
            dumpFile(Checker.helper + injected, tempPath)
            val checker = Checker(tempPath, comment, false)
            deleteFile(tempPath)

            // check mutated script has same fault
            val fails: Map[String, Set[CheckResult]] = checker.result
            val failed = fails.get(engine) match {
              case Some(rs) => rs.map(_.toString).contains(failedDesc)
              case _ => false
            }

            // update localizer stat
            localizer.updateInst(visited.instCovered, failed)
            localizer.updateAlgo(visited.touchedAlgos, failed)

            // add mutatedStr to generatedSet
            generatedSet += mutatedStr
            if (failed) failedSet += mutatedStr
          }
        } catch {
          // TODO : handle error?
          case e: Throwable => println(e)
        }

        trial += 1
        println(s"$trial, ${failedSet.size}")
      }

      // TODO : print stat?
      println(s"[LOCALIZER] trial: $trial, failed: ${failedSet.size}")
    }

    localizer
  }
}
