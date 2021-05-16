FROM maven:3.6.3-openjdk-11-slim AS build

COPY . /usr/src/app

RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:11.0-jre-slim-buster

LABEL "edu.pingpong.gildedrose"="Kata Gilded Rose" \
        version="1.0" \
        description="Kata Gilded Rose en Java" \
        maintainer="vporlan@cifpfbmoll.es"

WORKDIR $HOME/app

COPY --from=build /usr/src/app/target/*.jar ./gildedrose.jar

ENTRYPOINT ["java", "-jar", "gildedrose.jar"]