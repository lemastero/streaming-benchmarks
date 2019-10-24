name := "streaming-benchmarks"

organization := "io.monix"
scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "io.monix"             %% "monix"       % "3.0.0",
  "com.typesafe.akka"    %% "akka-stream" % "2.5.26",
  "co.fs2"               %% "fs2-core"    % "2.0.1",
  "org.typelevel"        %% "cats-effect" % "2.0.0",
  "io.reactivex.rxjava2" %  "rxjava"      % "2.2.13",
  "dev.zio"              %% "zio"         % "1.0.0-RC15",
  "dev.zio"              %% "zio-streams" % "1.0.0-RC15"
)

enablePlugins(JmhPlugin)
