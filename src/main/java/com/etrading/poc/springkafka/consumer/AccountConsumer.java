package com.etrading.poc.springkafka.consumer;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.etrading.poc.springkafka.dto.AccountDto;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class AccountConsumer {
	
    @KafkaListener(topics = "topic-account", groupId = "group_id")
    public void consume(final AccountDto account) throws IOException {
        log.info("Consuming account: {}", account);
    }
    
}
