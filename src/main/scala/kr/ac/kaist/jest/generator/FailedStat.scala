package kr.ac.kaist.jest.generator

import kr.ac.kaist.jest.GEN_RES_DIR
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Inst._
import kr.ac.kaist.jest.model.Algorithm
import kr.ac.kaist.jest.util.Useful._

object FailedStat {
  val failedPath = s"$GEN_RES_DIR/failed.json"

  println(failedPath)
  def showMergedResult(filename: String = failedPath): Unit = showResult(merged(filename))

  def check(inst: Inst): Option[String] = inst match {
    case iif @ IIf(EBOp(OEq, ERef(RefProp(RefId(Id(_)), EStr("Type"))), ERef(RefId(Id("CONST_normal")))), _, _) =>
      var uid = iif.uid
      var inst: Inst = iif
      do {
        uid -= 1
        inst = insts(uid)
      } while (inst match {
        case (_: IApp | _: IAccess) => false
        case _ => true
      })
      inst match {
        case IApp(_, ERef(RefId(Id(fname))), _) =>
          Some(fname)
        case IApp(_, ERef(RefProp(RefId(Id(base)), EStr(prop))), _) =>
          Some(s"$base.$prop")
        case IAccess(_, ERef(RefId(Id(base))), EStr(prop)) =>
          Some(s"$base.$prop")
        case inst =>
          println("[Warning] " + instToAlgo(uid).name)
          (uid to iif.uid).foreach(k => println(beautify(insts(k), detail = false)))
          None
      }
    case _ => None
  }

  def showResult(names: Map[String, (Int, Int)]): Unit = {
    val ltotal = names.map { case (k, (l, _)) => l }.reduce(_ + _)
    val rtotal = names.map { case (k, (_, r)) => r }.reduce(_ + _)
    names.toList.sortBy { case (_, v) => v }.map {
      case (name, (l, r)) => println(f"$name%-30s: ${getPercent(l, ltotal)}, ${getPercent(r, rtotal)}")
    }
  }

  def getAbruptCheckInFailed(filename: String): Map[String, Int] = {
    var names: Map[String, Int] = Map()
    def add(name: String): Unit = names += name -> (names.getOrElse(name, 0) + 1)
    for (failed <- readJson[List[FailedCase]](filename)) {
      check(insts(failed.uid)).map(add)
    }
    names
  }

  def getAbruptCheck: Map[String, Int] = {
    var names: Map[String, Int] = Map()
    def add(name: String): Unit = names += name -> (names.getOrElse(name, 0) + 1)
    for (algorithm <- Algorithm.all) {
      object AbruptChecker extends Walker {
        override def walk(inst: Inst): Inst = {
          check(inst).map(add)
          super.walk(inst)
        }
      }
      AbruptChecker.walk(algorithm.func.body)
    }
    names
  }

  def merged(filename: String): Map[String, (Int, Int)] = {
    val failed = getAbruptCheckInFailed(filename)
    val all = getAbruptCheck
    all.keySet.toList.map(key => {
      key -> (failed.getOrElse(key, 0), all(key))
    }).toMap
  }
}
