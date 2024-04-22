package lotto

import zio.*
import zio.logging.consoleLogger

object Main extends ZIOAppDefault {

  def program = for {
    _ <- ZIO.logError("Start")
    _ <- ZIO.fail("FAILURE")
    _ <- ZIO.logInfo("Done")
  } yield ExitCode.success
  def run = program
}
