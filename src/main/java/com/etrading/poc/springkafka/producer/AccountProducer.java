package com.etrading.poc.springkafka.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.etrading.poc.springkafka.dto.AccountDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class AccountProducer {
	
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(final AccountDto account) {
        log.info("Producing account: {}", account);
        kafkaTemplate.send("topic-account", account);
    }
    
}
