# scala-boot-test

Test project of Spring Boot on Scala with added logging and build using Gradle.

Has the ability to build a container, but that requires a functional Docker environment. Works well with docker-machine.

Documentation can be found from the [blog](http://sirile.github.io/2015/04/08/docker-gradle-scala-boot.html).

## Prerequisites

- VirtualBox
- Docker Machine
- Docker client

## Running locally

```bash
./gradlew run
```

## Building a jar

```bash
./gradlew build
```

## Building a container

```bash
./gradlew container
```

## Running the created container

```bash
docker run --rm -p 80:80 sirile/scala-boot-test
```
