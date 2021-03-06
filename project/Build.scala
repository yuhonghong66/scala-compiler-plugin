import sbt._
import sbt.Keys._

object Build extends Build {

  import Dependencies._

  // Projects
  lazy val divideByZero = Common.createProject("divide-by-zero")
    .settings(libraryDependencies ++=
      compile(compiler) ++
      test(scalatest)
  )

  lazy val strictTypeAlias = Common.createProject("strict-type-alias")
    .settings(libraryDependencies ++=
      compile(compiler) ++
      test(scalatest)
  )
}
