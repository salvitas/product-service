* mvn jgitflow:feature-start Starts a feature branch
* mvn jgitflow:feature-finish Finishes a feature branch
* mvn jgitflow:release-start Starts a release
* mvn jgitflow:release-finish Finishes a release
* mvn jgitflow:hotfix-start Starts a hotfix
* mvn jgitflow:hotfix-finish Finishes a hotfix
* mvn jgitflow:build-number Updates the pom versions in the current branch by adding a build number label

docker/build-push-action@v1 -> uses Dockerfile in order to build docker image (explore usage of jib in future)