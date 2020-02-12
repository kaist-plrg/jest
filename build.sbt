lazy val dummyModel = taskKey[Unit]("Generates a dummy model.")
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
    dummyModel in Compile := {
      val srcDir = baseDirectory.value + "/src/main"
      val modelPath = s"$srcDir/scala/kr/ac/kaist/ires/model"
      val modelDir = file(modelPath)
      if (!modelDir.exists) {
        IO.createDirectory(modelDir)
        List("ast", "algorithm", "type").foreach(dirname => {
          IO.createDirectory(file(s"$modelPath/$dirname"))
        })
        List("package").foreach(filename => {
          val outFile = file(s"$modelPath/$filename.scala")
          IO.copyFile(
            file(s"$srcDir/resources/dummy/$filename.scala"),
            file(s"$modelPath/$filename.scala")
          )
        })
      }
    },
    testOptions in Test += Tests.Argument("-fDG", baseDirectory.value + "/tests/detail"),
    compile <<= (compile in Compile) dependsOn (dummyModel in Compile),
    test <<= (testOnly in Test).toTask(List(
      "kr.ac.kaist.ires.IRTest",
      "kr.ac.kaist.ires.JSTest"
    ).mkString(" ", " ", "")) dependsOn compile,
    irTest <<= (testOnly in Test).toTask(" kr.ac.kaist.ires.IRTest") dependsOn compile,
    jsTest <<= (testOnly in Test).toTask(" kr.ac.kaist.ires.JSTest") dependsOn compile,
    test262Test <<= (testOnly in Test).toTask(" kr.ac.kaist.ires.Test262Test") dependsOn compile,
    test262PropTest <<= (testOnly in Test).toTask(" kr.ac.kaist.ires.Test262PropTest") dependsOn compile,
    test262ParseTest <<= (testOnly in Test).toTask(" kr.ac.kaist.ires.Test262ParseTest") dependsOn compile,
    test262AllParseTest <<= (testOnly in Test).toTask(" kr.ac.kaist.ires.Test262AllParseTest") dependsOn compile
  )

cleanFiles ++= Seq(
  file("src/main/scala/kr/ac/kaist/ires/model"),
  file("src/main/scala/kr/ac/kaist/ires/algorithm/rule")
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
