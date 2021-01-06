package kr.ac.kaist.jest.util

import java.io.{ Reader, File, PrintWriter }
import java.nio.file.{ Files, StandardCopyOption }
import kr.ac.kaist.jest.error.NoFileError
import kr.ac.kaist.jest.{ LINE_SEP, JESTConfig }
import scala.Console.{ RESET, RED, YELLOW, GREEN, CYAN }
import scala.collection.mutable
import scala.io.Source
import scala.util.Random
import scala.sys.process._
import spray.json._
import scala.concurrent._
import ExecutionContext.Implicits.global

object Useful {
  // file reader
  def fileReader(filename: String): Reader =
    Source.fromFile(filename, "UTF-8").bufferedReader

  // indentation
  def indentation(s: StringBuilder, str: String, indent: Int): Unit = {
    str.split(LINE_SEP) match {
      case Array(str, rest @ _*) => {
        s.append(str)
        rest.foreach(rStr => {
          s.append(LINE_SEP)
          for (i <- 0 until indent) { s.append(" ") }
          s.append(rStr)
        })
      }
      case _ =>
    }
  }

  // walk directory
  def walkTree(filename: String): Iterable[File] = walkTree(new File(filename))
  def walkTree(file: File): Iterable[File] = {
    val children = new Iterable[File] {
      def iterator: Iterator[File] =
        if (file.isDirectory) file.listFiles.iterator
        else Iterator.empty
    }
    Seq(file) ++ children.flatMap(walkTree(_))
  }

  // extention filter
  def extFilter(ext: String): String => Boolean = _.endsWith(s".$ext")
  lazy val irFilter = extFilter("ir")
  lazy val jsFilter = extFilter("js")
  lazy val jsonFilter = extFilter("json")
  lazy val scalaFilter = extFilter("scala")

  // file writer
  def getPrintWriter(filename: String): PrintWriter =
    new PrintWriter(new File(filename))

  // dump given data to a file
  def dumpFile(data: Any, filename: String): Unit = {
    val nf = getPrintWriter(filename)
    nf.print(data)
    nf.close()
  }

  // dump given data as JSON
  def dumpJson[T](data: T, filename: String)(implicit writer: JsonWriter[T]): Unit =
    dumpFile(data.toJson.prettyPrint, filename)

  // read file
  def readFile(filename: String): String = {
    val src = Source.fromFile(filename, "UTF-8")
    val str = src.mkString
    src.close
    str
  }

  // read JSON
  def readJson[T](filename: String)(implicit reader: JsonReader[T]): T =
    readFile(filename).parseJson.convertTo[T]

  // get first filename
  def getFirstFilename(jestConfig: JESTConfig, job: String): String =
    jestConfig.fileNames.headOption.getOrElse(throw NoFileError(job))

  // get simple file name
  def getSimpleFilename(filename: String): String = new File(filename).getName

  // delete files
  def deleteFile(filename: String): Unit = new File(filename).delete

  // change extension
  def changeExt(from: String, to: String): String => String =
    filename => filename.substring(0, filename.length - from.length) + to

  // get name without extension
  def removedExt(filename: String): String =
    filename.split('.').dropRight(1).mkString(".")

  // get extension
  def getExt(filename: String): String =
    filename.split('.').last

  // renamed filename
  def renameFile(from: String, to: String): Unit =
    new File(from).renameTo(new File(to))

  // copy file
  def copyFile(from: String, to: String): Unit = Files.copy(
    new File(from).toPath,
    new File(to).toPath,
    StandardCopyOption.REPLACE_EXISTING
  )

  // create directories
  def mkdir(name: String): Unit = new File(name).mkdirs

  // colored println
  def decorateColor(color: String): Any => String =
    x => color + x.toString + scala.Console.RESET
  def decorateRed: Any => String = decorateColor(RED)
  def decorateYellow: Any => String = decorateColor(YELLOW)
  def decorateGreen: Any => String = decorateColor(GREEN)
  def decorateCyan: Any => String = decorateColor(CYAN)
  def printColor(color: String): Any => Unit =
    x => print(decorateColor(color)(x))
  def printRed: Any => Unit = printColor(RED)
  def printYellow: Any => Unit = printColor(YELLOW)
  def printGreen: Any => Unit = printColor(GREEN)
  def printCyan: Any => Unit = printColor(CYAN)
  def printlnColor(color: String): Any => Unit =
    x => println(decorateColor(color)(x))
  def printlnRed: Any => Unit = printlnColor(RED)
  def printlnYellow: Any => Unit = printlnColor(YELLOW)
  def printlnGreen: Any => Unit = printlnColor(GREEN)
  def printlnCyan: Any => Unit = printlnColor(CYAN)

  // get name that could be used in Scala identifiers
  private val symbolRegex = "@@([^@]+)".r
  private val intrinsicRegex = "%([^%]+)%".r
  def getScalaName(str: String): String =
    str.replaceAll("\\.", "DOT") match {
      case intrinsicRegex(x) => "INTRINSIC_" + x
      case symbolRegex(x) => "SYMBOL_" + x
      case x => x
    }

  // cache for function
  def cached[A, B](f: A => B): A => B = {
    val cache = mutable.Map.empty[A, B]
    arg => cache.getOrElse(arg, {
      val res = f(arg)
      cache.update(arg, res)
      res
    })
  }

  // get percent string
  def getPercent[T](passSet: Iterable[T], totalSet: Iterable[T]): String = {
    val pass = passSet.size
    val total = totalSet.size
    getPercent(pass, total)
  }
  def getPercent(pass: Int, total: Int): String = {
    val ratio = pass.toDouble / total * 100
    f"$pass / $total ($ratio%.2f%%)"
  }

  // existence check for files
  def exists(filename: String): Boolean = new File(filename).exists

  // randomly choose an element in a list
  val rand = new Random
  def choose[T](seq: Seq[T]): T = seq(rand.nextInt(seq.length))
  def randBool: Boolean = rand.nextBoolean
  def weightedChoose[T](seq: Seq[(T, Int)]): T = {
    var vec = Vector[Int]()
    for {
      ((_, weight), idx) <- seq.zipWithIndex
      _ <- (0 until weight)
    } vec :+= idx
    val idx = choose(vec)
    val (res, _) = seq(idx)
    res
  }

  // get hashCode string
  def hashCodeString(any: Any): String = f"0x${any.hashCode}%x"

  // duration time
  def time[T](input: => T): (T, Long) = {
    val startTime = System.currentTimeMillis
    val result = input
    val duration = System.currentTimeMillis - startTime
    (result, duration)
  }

  def executeCmd(cmd: String, timeout: Int = 1): Option[(String, String)] = {
    val stdout = new StringBuilder
    val stderr = new StringBuilder
    def appendln(builder: StringBuilder, str: String) = builder append s"$str$LINE_SEP"

    val proc = cmd.run(ProcessLogger(appendln(stdout, _), appendln(stderr, _))) // start asynchronously
    val future = Future(blocking(proc.exitValue())) // wrap in Future
    try {
      Await.result(future, duration.Duration(timeout, "sec"))
      Some((stdout.toString, stderr.toString))
    } catch {
      case _: TimeoutException =>
        proc.destroy()
        None
    }
  }

  // sort string
  def cmpStr(a: String, b: String): Boolean =
    if (a.length == b.length) a < b else a.length < b.length

  // merge maps
  def merge[K, V](left: Map[K, V], right: Map[K, V], op: (V, V) => V): Map[K, V] = {
    val result = (left.keySet ++ right.keySet).foldLeft(Map[K, V]()) {
      case (map, k) => (left.get(k), right.get(k)) match {
        case (Some(l), Some(r)) => map + (k -> op(l, r))
        case (Some(l), _) => map + (k -> l)
        case (_, Some(r)) => map + (k -> r)
        case _ => map
      }
    }
    result
  }

  // get target names
  def getTargetName(target: String): String = target match {
    case "node" => "V8"
    case "xst" => "ModdableXS"
    case "qjs" => "QuickJS"
    case "gnode" => "GraalJS"
    case "spec" => "ECMAScript"
    case _ => target
  }

  // get engine names
  def getEngineName(name: String): String = name match {
    case "V8" => "node"
    case "ModdableXS" => "xst"
    case "QuickJS" => "qjs"
    case "GraalJS" => "gnode"
    case "ECMAScript" => "spec"
    case _ => name
  }
}
