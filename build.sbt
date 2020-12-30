import scalariform.formatter.preferences._
import sbtassembly.AssemblyPlugin.defaultUniversalScript

ThisBuild / version       := "1.0"
ThisBuild / scalaVersion  := "2.13.1"
ThisBuild / organization  := "kr.ac.kaist.jest"
ThisBuild / scalacOptions := Seq(
  "-deprecation", "-feature", "-language:postfixOps",
  "-language:implicitConversions"
)
ThisBuild / javacOptions ++= Seq(
  "-encoding", "UTF-8"
)

lazy val jest = (project in file("."))
  .settings(
    name := "JEST",
    libraryDependencies ++= {
      System.setProperty("java.library.path", s"${baseDirectory.value}/lib:${System.getProperty("java.library.path")}")
      Seq(
        "com.eclipsesource.j2v8" % "j2v8_linux_x86_64" % "6.2.0" from s"file://${baseDirectory.value}/lib/j2v8-6.2.0.jar",
        "io.spray" %% "spray-json" % "1.3.5",
        "org.scala-lang" % "scala-reflect" % scalaVersion.value,
        "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
        "org.jline" % "jline" % "3.13.3"
      )
    },
    retrieveManaged := true,
    scalariformPreferences := scalariformPreferences.value
      .setPreference(DanglingCloseParenthesis, Force)
      .setPreference(DoubleIndentConstructorArguments, true),
    assemblyOutputPath in assembly := file("bin/jest"),
    assemblyOption in assembly := (assemblyOption in assembly).value
      .copy(prependShellScript = Some(defaultUniversalScript(shebang = false)))
  )
