package com.example.kafkatestspringboot3.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {
    private final String topicName = "test_topic";

    @KafkaListener(topics = topicName)
    public void consume(String message) {
        System.out.println("message consmed : " + message);
    }
}
