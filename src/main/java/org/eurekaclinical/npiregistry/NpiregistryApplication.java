package org.eurekaclinical.npiregistry;

import org.eurekaclinical.npiregistry.dest.NPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class NpiregistryApplication {

	private static final Logger log = LoggerFactory.getLogger(NpiregistryApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(NpiregistryApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			NPI npi_result = restTemplate.getForObject(
					"https://npiregistry.cms.hhs.gov/api/?number=1740519487&version=2.1", NPI.class);
			log.info("Printing NPI data");
			log.info(npi_result.toString());
		};
	}
	
}
