package com.example.kafkatestspringboot3.Controller;

import com.example.kafkatestspringboot3.Service.MessageProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private final MessageProducer producer;

    public KafkaController(MessageProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/send")
    public String sendMessage(String message) {
        producer.sendMessage(message);
        return "OK";
    }
}
