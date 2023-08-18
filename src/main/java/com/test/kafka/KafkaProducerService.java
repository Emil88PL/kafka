package com.test.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topic = "myTopic"; // Replace with your actual topic name

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        for (int i = 0; i < 20; i++) {

            kafkaTemplate.send(topic, message);
            System.out.println("Sent message: " + message +"_"+i);
        }
    }
}
