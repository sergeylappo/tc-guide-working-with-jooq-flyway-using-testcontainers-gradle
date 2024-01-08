# Working with jOOQ and Flyway using Testcontainers & Gradle Guide

This is a fork of [an original](https://github.com/testcontainers/tc-guide-working-with-jooq-flyway-using-testcontainers) Flyway guide intended to show how to use Flyway with Gradle. Check out my [blog post](https://sergeylappo.github.io/posts/gradle-jooq-flyway-testcontainers/) to learn more.
The only important changes are replacing the build configuration with Gradle.

## 1. Setup Environment
Make sure you have Java 17+ and a [compatible Docker environment](https://www.testcontainers.org/supported_docker_environment/) installed.

For example:

```shell
$ java -version
openjdk version "17.0.4" 2022-07-19
OpenJDK Runtime Environment Temurin-17.0.4+8 (build 17.0.4+8)
OpenJDK 64-Bit Server VM Temurin-17.0.4+8 (build 17.0.4+8, mixed mode, sharing)
$ docker version
...
Server: Docker Desktop 4.12.0 (85629)
 Engine:
  Version:          20.10.17
  API version:      1.41 (minimum version 1.12)
  Go version:       go1.17.11
...
```

## 2. Setup Project

* Clone the repository

```shell
git clone https://github.com/testcontainers/tc-guide-working-with-jooq-flyway-using-testcontainers.git
cd tc-guide-working-with-jooq-flyway-using-testcontainers
```

* Open the **tc-guide-working-with-jooq-flyway-using-testcontainers** project in your favorite IDE.

## 3. Run Tests

Run the command to run the tests.

```shell
$ ./gradlew build  //for Gradle
```

The tests should pass.
