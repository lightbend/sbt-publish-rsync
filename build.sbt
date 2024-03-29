scalaVersion := "2.12.18"

crossSbtVersions    := List("1.0.0")
organization        := "com.lightbend.sbt"
name                := "sbt-publish-rsync"
sonatypeProfileName := "com.lightbend"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
homepage := Some(url("https://github.com/lightbend/sbt-publish-rsync"))
scmInfo := Some(
  ScmInfo(url("https://github.com/lightbend/sbt-publish-rsync"), "git@github.com:lightbend/sbt-publish-rsync.git")
)
developers += Developer(
  "contributors",
  "Contributors",
  "https://gitter.im/sbt/sbt",
  url("https://github.com/lightbend/sbt-publish-rsync/graphs/contributors")
)
organizationName := "Lightbend Inc."
startYear        := Some(2019)

scriptedLaunchOpts += ("-Dproject.version=" + version.value)
enablePlugins(SbtPlugin)

enablePlugins(AutomateHeaderPlugin)
scalafmtOnCompile := true
