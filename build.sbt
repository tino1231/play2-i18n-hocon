name := "play2-hocon-i18n"

organization := "com.github.tino1231"
version := "1.0.0"

scalaVersion := "2.13.8"

startYear := Some(2022)

description := "A Play modules that provides I18n using Hocon as the messages file."
githubOwner := "tino1231"
githubRepository :="play2-i18n-hocon"
githubTokenSource := TokenSource.GitConfig("github.token") || TokenSource.Environment("GITHUB_TOKEN")

scalacOptions := Seq("-feature", "-deprecation")

libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
)

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .disablePlugins(PlayLayoutPlugin)

