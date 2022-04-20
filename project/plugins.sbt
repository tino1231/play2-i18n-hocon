logLevel := Level.Warn
resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.0")

// Release plugins
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")
//addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.11")
//addSbtPlugin("com.github.sbt" % "sbt-release" % "1.1.0")