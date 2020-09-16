ThisBuild / organization := "com.manning"
ThisBuild / version := "0.1"

ThisBuild / scalaVersion := "2.13.2"
ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-Xlint",
  "-Ywarn-unused",
  "-Ywarn-dead-code",
  "-feature",
  "-language:_"
)

val akkaVersion = "2.6.9"
lazy val root = (project in file("."))
  .settings(
    name := "chapter-test-driven",
    libraryDependencies ++= Seq(
        "com.typesafe.akka" %% "akka-actor"   % akkaVersion,
        "com.typesafe.akka" %% "akka-slf4j"   % akkaVersion,
        "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
        "org.scalatest"     %% "scalatest"    % "3.2.2"     % "test"
      )
  )

ThisBuild / scalafmtConfig := file(".scalafmt.conf")
