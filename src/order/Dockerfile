FROM gradle:4.10.2-jdk8-alpine as builder
WORKDIR /app
COPY --chown=gradle:gradle . /app
RUN gradle build

FROM openjdk:8-jdk-alpine
COPY --from=builder /app/order-api/build/libs/order-api-*.jar .
CMD java -jar order-api-*.jar
