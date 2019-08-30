package com.lena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CrawlerJdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrawlerJdDemoApplication.class, args);
	}

}
