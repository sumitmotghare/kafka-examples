package com.example.kafkaexample.consumer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
public class MessageConsumerTest {

    @InjectMocks
    private MessageConsumer messageConsumer;

    @Test
    public void testConsumeMessage() {
        String message = "test-message";

        assertDoesNotThrow(() -> messageConsumer.consumeMessage(message));
    }
}