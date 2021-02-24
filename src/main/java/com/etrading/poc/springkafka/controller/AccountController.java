package com.etrading.poc.springkafka.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etrading.poc.springkafka.dto.AccountDto;
import com.etrading.poc.springkafka.producer.AccountProducer;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequestMapping("api/account")
@RestController
@Log4j2
@RequiredArgsConstructor
public class AccountController {
	
	private final AccountProducer producer;
	
    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestBody AccountDto account) {
    	log.info("Publishing account: {}", account);
        producer.sendMessage(account);
    }
    
}
