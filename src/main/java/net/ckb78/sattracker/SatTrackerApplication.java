package net.ckb78.sattracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class SatTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SatTrackerApplication.class, args);
	}

}
