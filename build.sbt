import scalariform.formatter.preferences._

ThisBuild / version       := "1.0"
ThisBuild / scalaVersion  := "2.13.1"
ThisBuild / organization  := "kr.ac.kaist.ires"
ThisBuild / scalacOptions := Seq(
  "-deprecation", "-feature", "-language:postfixOps",
  "-language:implicitConversions"
)
ThisBuild / javacOptions ++= Seq(
  "-encoding", "UTF-8"
)

lazy val irTest = taskKey[Unit]("Launch IRES language interpreter tests")
lazy val jsTest = taskKey[Unit]("Launch JavaScript language interpreter tests")
lazy val test262Test = taskKey[Unit]("Launch test262 tests")
lazy val test262PropTest = taskKey[Unit]("Launch test262 tests")
lazy val test262ParseTest = taskKey[Unit]("Launch test262 parsing tests")
lazy val test262AllParseTest = taskKey[Unit]("Launch test262 parsing tests")

lazy val ires = (project in file("."))
  .settings(
    name := "IRES",
    libraryDependencies ++= Seq(
      "io.spray" %% "spray-json" % "1.3.5",
      "org.scala-lang" % "scala-reflect" % scalaVersion.value,
      "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
      "org.scalatest" %% "scalatest" % "3.0.8" % "test",
      "org.jline" % "jline" % "3.13.3"
    ),
    retrieveManaged := true,
    scalariformPreferences := scalariformPreferences.value
      .setPreference(DanglingCloseParenthesis, Force)
      .setPreference(DoubleIndentConstructorArguments, true),
    test in assembly := {},
    testOptions in Test += Tests.Argument("-fDG", baseDirectory.value + "/tests/detail"),
    parallelExecution in Test := true,
    test := (testOnly in Test).toTask(List(
      "kr.ac.kaist.ires.BasicIRTest",
      "kr.ac.kaist.ires.JSTest"
    ).mkString(" ", " ", "")).value,
    irTest := (testOnly in Test).toTask(" kr.ac.kaist.ires.BasicIRTest").value,
    jsTest := (testOnly in Test).toTask(" kr.ac.kaist.ires.JSTest").value,
    test262Test := (testOnly in Test).toTask(" kr.ac.kaist.ires.Test262Test").value,
    test262PropTest := (testOnly in Test).toTask(" kr.ac.kaist.ires.Test262PropTest").value,
    test262ParseTest := (testOnly in Test).toTask(" kr.ac.kaist.ires.Test262ParseTest").value,
    test262AllParseTest := (testOnly in Test).toTask(" kr.ac.kaist.ires.Test262AllParseTest").value
  )
