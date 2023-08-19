package com.test.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "myTopic", groupId = "gropupID")
    void listerner(String data) {
        System.out.println("Listener recived: " + data);
    } 
    
     @KafkaListener(topics = "myTopic", groupId = "groID")
    void listerner2(String data) {
        System.out.println("Listener2 recived: " + data);
    } 
}
