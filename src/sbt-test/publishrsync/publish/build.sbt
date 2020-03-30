publishRsyncArtifacts += ((Compile / doc).value, "rsynced")
publishRsyncHost := s"${baseDirectory.value.toString}/"

enablePlugins(PublishRsyncPlugin)
