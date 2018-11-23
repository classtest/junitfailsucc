# Pull base image
From tomcat:8-jre8

# Maintainer
MAINTAINER "kranthi <kranthi.2000r@gmail.com">

# Copy to images tomcat path
ADD sparkjava-hello-world-1.0.war /usr/local/tomcat/webapps/
