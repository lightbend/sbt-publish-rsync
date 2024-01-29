/*
 * Copyright 2019 Lightbend Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lightbend.sbt.publishrsync

import sbt._
import sbt.plugins.JvmPlugin

import scala.sys.process._

object PublishRsyncPlugin extends AutoPlugin {
  override def requires = JvmPlugin

  override def trigger = noTrigger

  object autoImport extends PublishRsyncKeys

  import autoImport._

  override def projectSettings = publishRsyncSettings()

  def publishRsyncSettings(): Seq[Setting[_]] =
    Seq(
      publishRsyncArtifacts := Nil,
      publishRsync := {
        publishRsyncArtifacts.value.foreach {
          case (from, to) => rsync(from, publishRsyncHost.value, to)
        }
      }
    )

  @throws[IllegalStateException]
  private def rsync(from: File, toHost: String, toPath: String): Unit =
    Process(
      Seq("rsync", "-azP", s"$from/", s"$toHost:$toPath"),
      None,
      "RSYNC_RSH" -> "ssh -o StrictHostKeyChecking=no"
    ).! match {
      case 0 => () // success
      case error => throw new IllegalStateException(s"rsync command exited with an error code $error")
    }
}
