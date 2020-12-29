# template-kotlin-multi-gradle <!-- TODO change title -->

<!-- TODO select and adjust badges -->
[![GitHub CI/CD](https://github.com/nelkinda/template-kotlin-multi-gradle/workflows/CI/CD/badge.svg)](https://github.com/nelkinda/template-kotlin-multi-gradle/actions)
[![Travis CI/Cd](https://travis-ci.org/nelkinda/template-kotlin-multi-gradle.svg)](https://travis-ci.org/nelkinda/template-kotlin-multi-gradle)

<!-- TODO Replace this README -->

Template for multi-module Kotlin projects at Nelkinda.

## Features
- `Makefile` as wrapper to make standard workflows as well as pipeline reproduction easier to access.
- Extensive **static code analysis** to ensure the quality of certain aspects of structure using _Detekt_, _KtLint_, and _SonarLint_.
- Extensive **dynamic code analysis** to ensure the quality of behavior using _JUnit 5_, _Cucumber_, _JaCoCo_, and _Pitest_.
- Tracking of analysis reports using _SonarQube_.
- Preconfigured CI/CD **pipelines** for _Bitbucket_, _GitHub_, _GitLab_, and _Travis_.
- Available on: Bitbucket, GitHub, GitLab.

## How to use

### GitHub Template
- Create a new repository based on this template: https://github.com/nelkinda/template-kotlin-multi-gradle/generate
- Open the repository in your favorite IDE, for example IntelliJ IDEA.
- Look for all the TODO comments and solve them to replace placeholders, including those in this file.

## Reports
The reports are available locally, after running a build using `make`.

### `app-template`
* [SonarLint Report Main](app-template/build/reports/sonarlint/sonarlintMain/report.html)
* [SonarLint Report Test](app-template/build/reports/sonarlint/sonarlintTest/report.html)
* [Test Report](app-template/build/reports/test/test/html/index.html)
* [Jacoco Test Coverage Report](app-template/build/reports/jacoco/test/html/index.html)
* [PiTest Mutation Test Report](app-template/build/reports/pitest/index.html)

### `lib-template`
* [SonarLint Report Main](lib-template/build/reports/sonarlint/sonarlintMain/report.html)
* [SonarLint Report Test](lib-template/build/reports/sonarlint/sonarlintTest/report.html)
* [Test Report](lib-template/build/reports/test/test/html/index.html)
* [Jacoco Test Coverage Report](lib-template/build/reports/jacoco/test/html/index.html)
* [PiTest Mutation Test Report](lib-template/build/reports/pitest/index.html)
