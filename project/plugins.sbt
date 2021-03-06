// You may use this file to add plugin dependencies for sbt.
resolvers += "Spark Packages repo" at "https://repos.spark-packages.org/"

addSbtPlugin("org.spark-packages" %% "sbt-spark-package" % "0.2.6")

// scalacOptions in (Compile,doc) := Seq("-groups", "-implicits")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")

addSbtPlugin("com.github.sbt" % "sbt-release" % "1.0.15")
