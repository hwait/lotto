import sbt._

object Dependencies {
  object zio {
    private val version = "2.0.22"
    private val org = "dev.zio"

    private val zio = org %% "zio" % version
    private val log = org %% "zio-logging" % "2.2.2"
    val lbs = Seq(zio, log)
  }

  val `nscala-time` = "com.github.nscala-time" %% "nscala-time" % "2.32.0"
  val csv = "com.github.tototoshi" %% "scala-csv" % "1.3.10"

  val tests = "org.scalameta" %% "munit" % "0.7.29" % Test

}
