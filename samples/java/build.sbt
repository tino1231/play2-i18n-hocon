name := """java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.8"

externalResolvers += "hocon packages" at "https://maven.pkg.github.com/tino1231/play2-hocon-i18n"

libraryDependencies ++= Seq(
  guice,
  "com.github.tino1231" %% "play2-hocon-i18n" % "1.0.0"
)
