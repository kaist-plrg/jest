lazy val irTest = taskKey[Unit]("Launch IRES language interpreter tests")
lazy val jsTest = taskKey[Unit]("Launch JavaScript language interpreter tests")
lazy val test262Test = taskKey[Unit]("Launch test262 tests")
lazy val test262PropTest = taskKey[Unit]("Launch test262 tests")
lazy val test262ParseTest = taskKey[Unit]("Launch test262 parsing tests")
lazy val test262AllParseTest = taskKey[Unit]("Launch test262 parsing tests")

lazy val root = (project in file(".")).
  settings(
    name := "IRES",
    version := "1.0",
    organization := "kr.ac.kaist.ires",
    scalaVersion := "2.13.1",
    testOptions in Test += Tests.Argument("-fDG", baseDirectory.value + "/tests/detail"),
    compile <<= (compile in Compile),
    testOnly <<= (testOnly in Test),
    test <<= testOnly.toTask(List(
      "kr.ac.kaist.ires.BasicIRTest",
      "kr.ac.kaist.ires.JSTest"
    ).mkString(" ", " ", "")) dependsOn compile,
    irTest <<= testOnly.toTask(" kr.ac.kaist.ires.BasicIRTest") dependsOn compile,
    jsTest <<= testOnly.toTask(" kr.ac.kaist.ires.JSTest") dependsOn compile,
    test262Test <<= testOnly.toTask(" kr.ac.kaist.ires.Test262Test") dependsOn compile,
    test262PropTest <<= testOnly.toTask(" kr.ac.kaist.ires.Test262PropTest") dependsOn compile,
    test262ParseTest <<= testOnly.toTask(" kr.ac.kaist.ires.Test262ParseTest") dependsOn compile,
    test262AllParseTest <<= testOnly.toTask(" kr.ac.kaist.ires.Test262AllParseTest") dependsOn compile
  )

libraryDependencies ++= Seq(
  "io.spray" %% "spray-json" % "1.3.5",
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "org.jline" % "jline" % "3.13.1"
)

scalacOptions in ThisBuild ++= Seq("-deprecation", "-feature",
                                   "-language:postfixOps",
                                   "-language:implicitConversions")

javacOptions ++= Seq("-encoding", "UTF-8")

retrieveManaged := true
