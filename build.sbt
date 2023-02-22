ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "scala-play"
  )

// available for 2.12, 2.13, 3.2
libraryDependencies += "co.fs2" %% "fs2-core" % "3.6.0"
// optional I/O library
libraryDependencies += "co.fs2" %% "fs2-io" % "3.6.0"
// optional reactive streams interop
libraryDependencies += "co.fs2" %% "fs2-reactive-streams" % "3.6.0"
// optional scodec interop
libraryDependencies += "co.fs2" %% "fs2-scodec" % "3.6.0"

//Tests
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % Test