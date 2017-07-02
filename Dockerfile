FROM java:openjdk-8-jdk
WORKDIR /opt
ENV telegramKey=""
ENV telegramUsername=""
ENV mongoUrl=""
ENV mongoUser=""
ENV mongoPassword=""

ADD https://oss.sonatype.org/service/local/artifact/maven/redirect?r=releases&g=com.marcarndt.morse&a=swarm&v=LATEST&e=jar&c=swarm /opt/morse/morse_swarm.jar

CMD java -Dbot.username=$telegramUsername -Dbot.key=$telegramKey -Dmongo.url=$mongoUrl -Dmongo.database=$mongoDatabase -Dmongo.username=$mongoUsername  -Dmongo.password=$mongoPassword -jar /opt/morse/morse_swarm.jar

EXPOSE 8080

