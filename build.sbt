name := "mergedplay"

version := "1.0"

lazy val `play17` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq( javaJdbc , javaEbean , cache , javaWs )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

//JavaHome := Some(file("C:\\Program Files\\Java\\jdk1.7.0"))