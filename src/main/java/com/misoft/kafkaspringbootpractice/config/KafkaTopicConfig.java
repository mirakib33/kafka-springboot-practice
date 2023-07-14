package com.misoft.kafkaspringbootpractice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic misoftTopic() {
        return TopicBuilder.name("misoft")
                .build();
    }

    @Bean
    public NewTopic misoftJsonTopic() {
        return TopicBuilder.name("misoft_json")
                .build();
    }
}
