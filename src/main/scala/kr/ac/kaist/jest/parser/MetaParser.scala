package kr.ac.kaist.jest.parser
import scala.io.Source

object MetaParser {
  def apply(filename: String, dirname: String) = {
    val relName = (filename split dirname).last.drop(1)
    val source = scala.io.Source.fromFile(filename, "UTF-8")
    val lines = try source.getLines.toList finally source.close()
    val metadata = lines.dropWhile((x) => !(x contains "/*---")) match {
      case Nil => Nil
      case _ :: rest => rest.takeWhile((x) => !(x contains "---*/"))
    }
    val (phase, ty, flags, includes, locales, features, _) = metadata.foldLeft[(String, String, List[String], List[String], List[String], List[String], Boolean)](("", "", List(), List(), List(), List(), false)) {
      case ((phase, ty, flags, includes, locales, features, isInclude), line) => {
        val phasen = if (line contains "phase:") line.split(' ').last else phase
        val tyn = if (line contains "type:") line.split(' ').last else ty
        val flagsn = if (line contains "flags:") line.dropWhile(_ != '[').tail.takeWhile(_ != ']').split(", ").toList else flags
        val (includesn, isIncluden) = if (line contains "includes:") line.dropWhile(_ != '[') match {
          case "" => (List(), true)
          case s => (s.tail.takeWhile(_ != ']').split(", ").toList, isInclude)
        }
        else (includes, isInclude)
        val includesn2 = if (isInclude && (line contains ".js")) includesn :+ (line.split(' ').last) else includesn
        val localesn = if (line contains "locale:") line.dropWhile(_ != '[').tail.takeWhile(_ != ']').split(", ").toList else locales
        val featuresn = if (line contains "features:") line.dropWhile(_ != '[') match {
          case "" => List()
          case s => s.tail.takeWhile(_ != ']').split(", ").toList
        }
        else features
        (phasen, tyn, flagsn, includesn2, localesn, featuresn, isIncluden)
      }
    }
    val negative = if (phase != "" || ty != "") Some(Negative(phase, ty)) else None
    val newIncludes = if (flags contains "async") includes :+ "doneprintHandle.js" else includes
    MetaData(relName, negative, flags, newIncludes, locales, features)
  }
}

case class MetaData(name: String, negative: Option[Negative], flags: List[String], includes: List[String], locales: List[String], features: List[String])

case class Negative(phase: String, ty: String)
