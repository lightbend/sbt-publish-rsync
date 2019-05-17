publishRsyncArtifact := ((Compile / doc).value, s"${baseDirectory.value}/target/rsynced")
publishRsyncHost := "localhost"

enablePlugins(PublishRsyncPlugin)