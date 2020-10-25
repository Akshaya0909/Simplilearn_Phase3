FROM java:8-jdk-alpine

COPY ./target/spring_boot_ecommerce_SportyShoes 0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch spring_boot_ecommerce_SportyShoes 0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","spring_boot_ecommerce_SportyShoes 0.0.1-SNAPSHOT.jar"]