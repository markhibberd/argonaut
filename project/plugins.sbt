scalacOptions += "-deprecation"

addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")

addSbtPlugin("com.github.sbt" % "sbt-release" % "1.0.15")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.8.1")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.5.0")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.0.0")

addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.4.0")

addSbtPlugin("org.ensime" % "sbt-ensime" % "2.6.1")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.5")

addSbtPlugin("ch.epfl.lamp" % "sbt-dotty" % "0.5.3")
