package com.jujulioed.simpleschedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SimplescheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplescheduleApplication.class, args);
	}

}
