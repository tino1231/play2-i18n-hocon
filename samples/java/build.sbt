name := """java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  guice,
  "io.github.tino1231" %% "play2-hocon-i18n" % "1.0.0"
)
