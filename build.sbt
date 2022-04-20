name := "play2-hocon-i18n"

organization := "io.github.tino1231"
version := "1.0.0"

scalaVersion := "2.13.8"

startYear := Some(2022)

description := "A Play modules that provides I18n using Hocon as the messages file."

scalacOptions := Seq("-feature", "-deprecation")

libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
)

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .disablePlugins(PlayLayoutPlugin)
ThisBuild / organization := "io.github.tino1231"
ThisBuild / organizationName := "tino1231"
ThisBuild / organizationHomepage := Some(url("https://github.com/tino1231"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/tino1231/play2-i18n-hocon"),
    "scm:git@github.tino1231/play2-i18n-hocon.git"
  )
)

ThisBuild / developers := List(
  Developer(
    id    = "tino1231",
    name  = "Takeshi Inoue",
    email = "taketoma818@gmail.com",
    url   = url("https://github.com/tino1231")
  )
)

ThisBuild / description := "A Playframework module to use HOCON for i18n instead of properties"
ThisBuild / licenses := List("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/tino1231/play2-i18n-hocon"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }

ThisBuild / publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true

