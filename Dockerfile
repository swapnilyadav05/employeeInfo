FROM tomcat:7-jre7
MAINTAINER swapnil.yadav@synerzip.com
COPY /target/emp-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/employee.war
EXPOSE 8080
CMD ["catalina.sh", "run"]



