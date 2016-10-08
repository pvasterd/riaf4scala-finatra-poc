name := "FinatraPoC"

version := "1.0"

scalaVersion := "2.11.5"


val finatraVersion = "2.4.0"

libraryDependencies += "com.twitter" %% "finatra-http" % finatraVersion
libraryDependencies += "com.twitter" %% "finatra-http" % finatraVersion % "test" classifier "tests"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  "Twitter Maven" at "https://maven.twttr.com"
)



    