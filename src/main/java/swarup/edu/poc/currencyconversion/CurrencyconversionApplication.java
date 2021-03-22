package swarup.edu.poc.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CurrencyconversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyconversionApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
//https://tomgregory.com/automating-docker-builds-with-gradle/
}
