# Kafka-producer example with spring cloud stream

### Before application run you have to start kafka + zookeeper in docker: docker-compose up -d

### Useful commands:
- docker exec -it kafka sh - get into kafka pod
- cd bin - get into bin package
- kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic new-topic - create new topic
- kafka-topics.sh --list --zookeeper zookeeper:2181 - get list of existed topics
    
### By default if there is no such a topic that you set in application.yml, spring will automatically create this topic