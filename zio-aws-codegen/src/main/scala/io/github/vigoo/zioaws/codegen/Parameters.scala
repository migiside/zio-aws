package io.github.vigoo.zioaws.codegen

import java.io.File
import java.nio.file.Path

import io.github.vigoo.clipp.parsers._
import io.github.vigoo.clipp.syntax._

case class Parameters(targetRoot: Path)

object Parameters {
  val spec = for {
    _ <- metadata("zio-aws-codegen", "Code generator of the zio-aws modules")
    targetRoot <- namedParameter[File]("Target root directory", "DIR", "target-root")
  } yield Parameters(targetRoot.toPath)

}
