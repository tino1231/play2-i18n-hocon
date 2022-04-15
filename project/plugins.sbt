logLevel := Level.Warn
resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.0")
addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.2")
