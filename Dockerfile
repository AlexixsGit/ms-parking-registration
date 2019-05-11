from openjdk:8
ADD build/libs/registration-develop.20190505.1.0.0.jar registration-develop.20190505.1.0.0.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "registration-develop.20190505.1.0.0.jar"]