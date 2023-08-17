package com.example.kafkatestspringboot3.Service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topicName = "test_topic";
    public MessageProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    @Async
    public void sendMessage (String message) {
        try {
            Thread.sleep(5000);
            kafkaTemplate.send(topicName, message);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("메세지 종료");
    }

}
