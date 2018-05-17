package org.lab.samples.consul.consulsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulSampleApplication.class, args);
	}

}
