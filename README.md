# IELTS Portal
For build:

mvn clean package -Pproduction
ssh ekhart86@ip -i privatekey.pem

For run:

nohup java -jar ielts-portal-1.0-SNAPSHOT.jar > /dev/null 2>&1&