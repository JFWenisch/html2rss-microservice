FROM openjdk:17-jdk-slim


ENV DEBIAN_FRONTEND noninteractive

RUN useradd --create-home -s /bin/bash user && \
    adduser user sudo && \
    echo '%sudo ALL=(ALL) NOPASSWD:ALL' >> /etc/sudoers 

COPY --chown=user:user target/*.jar /html2rss.jar
ENTRYPOINT ["java","-jar","/html2rss.jar"]
