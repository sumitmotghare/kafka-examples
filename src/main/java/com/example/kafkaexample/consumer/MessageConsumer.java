package com.example.kafkaexample.consumer;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "example-topic", groupId = "group_id")
    public void consumeMessage(String message) {
        System.out.println("Consumed message: " + message);
    }
}