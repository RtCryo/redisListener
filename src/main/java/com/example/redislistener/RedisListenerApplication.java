package com.example.redislistener;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class RedisListenerApplication {

	@SneakyThrows
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(RedisListenerApplication.class, args);

		Thread.sleep(60000);
	}

}
