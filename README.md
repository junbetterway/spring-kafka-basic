# Java Spring-Kafka

**[Apache Kafka](https://kafka.apache.org/)** is an open-source distributed event streaming platform used by thousands of companies for high-performance data pipelines, streaming analytics, data integration, and mission-critical applications.

In this repository, we will explore Spring support for Kafka and the level of abstractions it provides over native Kafka Java client APIs.

## Run the needed dependencies: Apache Kafka, Zookeeper and (optional) Kafdrop using Docker

*__Note:__ We will be using __[Kafdrop](https://github.com/obsidiandynamics/kafdrop)__ which is a Web UI for viewing Kafka topics and browsing consumer groups. The tool displays information such as brokers, topics, partitions, consumers, and lets you view messages.*

1. Make sure to install **[Docker](https://docs.docker.com/get-docker/)** on your machine
2. Go to the root directory of the project where __docker-compose.yml__ is located.
3. Run the docker compose by

```
docker-compose up
```

*__Note:__ Make sure no errors are present on the logs such connection refused etc. Now go to your browser and access __http://localhost:9000/__ to see an overview of your Kafka cluster, brokers and topics*

## Run the Spring Boot Application Using Spring Tool Suite (STS)
1. Download STS version 3.4.* (or better) from the [Spring website](https://spring.io/tools). STS is a free Eclipse bundle with many features useful for Spring developers.
2. Right-click on the project or the main application class then select "Run As" > "Spring Boot App"

## Powered By
Contact me at [junbetterway](mailto:jkpminon12@yahoo.com)

Happy coding!!!
