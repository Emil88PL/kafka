package com.test.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "myTopic", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Received message: " + message);
        writeToFile(message);
    }

    private void writeToFile(String message) {
        try (FileWriter writer = new FileWriter("messages-log.txt", true)) {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
