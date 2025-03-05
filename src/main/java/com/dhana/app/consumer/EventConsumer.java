package com.dhana.app.consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EventConsumer {
    private static final Logger logger = LoggerFactory.getLogger(EventConsumer.class);

    @SqsListener(value = "${amazon.aws.sqs.queue.incoming}")
    public void onMessage(String message, @Headers Map<String, String> headers) throws Exception {
        logger.info("Received Event Data Message {} and headers {}", message, headers);
    }
}
