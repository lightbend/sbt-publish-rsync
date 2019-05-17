# sbt-publish-rsync [![bintray-badge][]][bintray] [![travis-badge][]][travis]

[bintray]:               https://bintray.com/sbt/sbt-plugin-releases/sbt-publish-rsync
[bintray-badge]:         https://api.bintray.com/packages/sbt/sbt-plugin-releases/sbt-publish-rsync/images/download.svg
[travis]:                https://travis-ci.com/lightbend/sbt-publish-rsync
[travis-badge]:          https://travis-ci.com/lightbend/sbt-publish-rsync.svg?branch=master

An [sbt](https://www.scala-sbt.org/) plugins that adds rsync capabilities to your projects.

## Usage

```scala
addSbtPlugin("com.lightbend.paradox" % "sbt-publish-rsync" % "<latest>")
```

Enable the plugin in your project `build.sbt` file:

```scala
enablePlugins(PublishRsyncPlugin)
```

Configure the directory to be deployed, directory on the remote server, and remote server address:

```scala
publishRsyncArtifact := ((Compile / doc).value, "relative/to/home/remote/directory")
publishRsyncHost := "doc.server.com"
```

To publish run the `publishRsync` sbt task.

## License

The license is Apache 2.0, see LICENSE.

## Maintenance notes

**This project is NOT supported under the Lightbend subscription.**

The project is maintained mostly by the members of the [@akka-team](https://github.com/orgs/lightbend/teams/akka-team/members).

Feel free to ping above maintainers for code review or discussions. Pull requests are very welcome–thanks in advance!
