ThisBuild / scalaVersion := "2.12.12"
ThisBuild / organization := "com.example"
val jacksonVersion = "2.11.2"

lazy val hello = (project in file("."))
  .settings(
    name := "reproduce-jackson",
    libraryDependencies ++= Seq(
      "com.fasterxml.jackson.core" % "jackson-annotations" % jacksonVersion,
        "com.fasterxml.jackson.module" %% "jackson-module-scala" % jacksonVersion
    )
  )
