package com.example.kafkaexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.kafkaexample.producer.MessageProducer;

@Service
public class KafkaService {

    private final MessageProducer messageProducer;

    @Autowired
    public KafkaService(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void produceMessage(String topic, String message) {
        messageProducer.sendMessage(topic, message);
    }
}