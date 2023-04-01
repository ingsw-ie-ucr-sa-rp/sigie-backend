FROM tomcat:9.0-jdk11-openjdk-slim

ARG ARTIFACT_ID=sigie-backend
ENV ARTIFACT_ID=${ARTIFACT_ID}
ARG APP_VERSION=0.0.1-SNAPSHOT
ENV APP_VERSION=${APP_VERSION}

# Set the working directory
WORKDIR /app
COPY . /app

# Install Maven
RUN apt-get update && apt-get install maven -y

# Build application
RUN mvn package -DskipTests
RUN echo $(ls -l target/)
COPY target/${ARTIFACT_ID}-${APP_VERSION}.war /usr/local/tomcat/webapps/ROOT.war

# Expose the port
EXPOSE $PORT

# RUN the application
CMD ["catalina.sh", "run"]
