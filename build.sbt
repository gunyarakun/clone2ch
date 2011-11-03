name := "Clone2ch"

version := "0.0.1"

organization := "jp.co.wktk"

scalaVersion := "2.9.1"

resolvers += "twitter.com" at "http://maven.twttr.com"

libraryDependencies ++= Seq(
  "com.mongodb.casbah" % "casbah_2.9.1" % "2.1.5-1",
  "com.twitter" % "finagle-core" % "1.9.3",
  "com.twitter" % "finagle-http" % "1.9.3",
  "org.scalatest" % "scalatest_2.9.1" % "1.6.1"
)
