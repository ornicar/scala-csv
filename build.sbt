name := "scala-csv"

version := "0.3"

scalaVersion := "2.9.1"

organization := "com.github.tototoshi"

libraryDependencies ++= Seq(
  "net.sf.opencsv" % "opencsv" % "2.3",
  "org.scalatest" %% "scalatest" % "1.7.1" % "test"
)

publishTo := Some(Resolver.sftp(
  "iliaz",
  "scala.iliaz.com"
) as ("scala_iliaz_com", Path.userHome / ".ssh" / "id_rsa"))
