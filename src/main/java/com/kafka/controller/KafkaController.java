package com.kafka.controller;

import com.kafka.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final Source source;

    @GetMapping(value = "/send")
    public void sendMessage() {
        Message message = new Message("Message from Publisher");
        source.output()
                .send(MessageBuilder.withPayload(message)
                        .build());
    }
}
