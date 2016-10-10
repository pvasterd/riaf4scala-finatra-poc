name := "FinatraPoC"

version := "1.0"

scalaVersion := "2.11.5"


val finatraVersion = "2.3.0"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra-http" % finatraVersion,
  "com.twitter" %% "finatra-http" % finatraVersion % "test" classifier "tests",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  "Twitter Maven" at "https://maven.twttr.com"
)



    