# sbt-publish-rsync

An [sbt](https://www.scala-sbt.org/) plugin that adds rsync capabilities to your project.

## Usage

```scala
addSbtPlugin("com.lightbend.sbt" % "sbt-publish-rsync" % "<latest>")
```

Enable the plugin in your project `build.sbt` file:

```scala
enablePlugins(PublishRsyncPlugin)
```

Configure the directory to be deployed, directory on the remote server, and remote server address:

```scala
publishRsyncArtifacts += ((Compile / doc).value, "relative/to/home/remote/directory")
publishRsyncHost := "doc.server.com"
```

To publish run the `publishRsync` sbt task.

## License

The license is Apache 2.0, see LICENSE.

## Maintenance notes

**This project is NOT supported under the Lightbend subscription.**

The project is maintained mostly by the members of the [@akka-team](https://github.com/orgs/lightbend/teams/akka-team/members).

Feel free to ping above maintainers for code review or discussions. Pull requests are very welcome–thanks in advance!
