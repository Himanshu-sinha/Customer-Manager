FROM maven:3.8.5-openjdk-17

WORKDIR /customer-manager-app
COPY . .
RUN gradle clean build

CMD mvn spring-boot:run