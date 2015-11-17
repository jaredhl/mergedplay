name := "play17"

version := "1.0"

lazy val `play17` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq( javaJdbc , javaEbean , cache , javaWs )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")