package com.test.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(KafkaApplication.class, args);




        KafkaProducerService producerService = context.getBean(KafkaProducerService.class);
        producerService.sendMessage("say Hi!");
        producerService.sendMessage("other message with time?!");

    }
}