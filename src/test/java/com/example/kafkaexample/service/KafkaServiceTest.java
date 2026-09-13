package com.example.kafkaexample.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.kafkaexample.producer.MessageProducer;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class KafkaServiceTest {

    @Mock
    private MessageProducer messageProducer;

    @InjectMocks
    private KafkaService kafkaService;

    @Test
    public void testProduceMessage() {
        String topic = "test-topic";
        String message = "test-message";

        kafkaService.produceMessage(topic, message);

        verify(messageProducer).sendMessage(topic, message);
    }
}