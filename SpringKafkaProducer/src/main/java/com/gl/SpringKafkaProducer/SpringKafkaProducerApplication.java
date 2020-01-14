package com.gl.SpringKafkaProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@EnableEurekaClient
public class SpringKafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaProducerApplication.class, args);
	}

}
