package com.example.RabbitMQ.springcloudproducercustom;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MyCustomSource {

        @Output("default-channel")
        public MessageChannel sendMessageDefaultChannel();

        @Output("custom-channel")
        public MessageChannel sendMessageCustomChannel();
}
