import Dependencies._

ThisBuild / scalaVersion := "3.3.3"
ThisBuild / version := "0.0.1"
ThisBuild / organization := "lotto"
ThisBuild / organizationName := "lotto"

lazy val root = (project in file("."))
  .settings(
    name := "lotto",
    libraryDependencies ++= Seq(
      `nscala-time`,
      csv,
      tests
    ) ++ zio.lbs
  )
  .settings(
    Compile / run / mainClass := Option("lotto.Main")
  )
