# Releasing

1. Check [closed issues without a milestone](https://github.com/lightbend/sbt-publish-rsync/issues?utf8=%E2%9C%93&q=is%3Aissue%20is%3Aclosed%20no%3Amilestone) and either assign them the upcoming release milestone or 'invalid'
1. Create a [new release](https://github.com/lightbend/sbt-publish-rsync/releases/new) with:
    * the next tag version (e.g. `v0.2`)
    * title and release description including notable changes
1. The GitHub Action [publish](https://github.com/lightbend/sbt-publish-rsync/actions/workflows/publish.yml) workflow will tag and publish artifacts to maven central.
