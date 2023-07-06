package com.example.redislistener.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RedisMessageListener implements MessageListener {

	@Override
	public void onMessage(final Message message, final byte[] pattern) {
		log.info("Received <" + new String(message.getBody()) + ">" + " " + new String(message.getChannel()));
	}
}
