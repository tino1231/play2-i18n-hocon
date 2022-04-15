name := "play2-hocon-i18n"

organization := "com.github.tino1231"

scalaVersion := "2.13.8"

crossScalaVersions := Seq("2.12.2", "2.13.8")

startYear := Some(2022)

description := "A Play modules that provides I18n using Hocon as the messages file."

scalacOptions := Seq("-feature", "-deprecation")

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .disablePlugins(PlayLayoutPlugin)