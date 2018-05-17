package org.lab.samples.consul.consulsample.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsulSampleConfig {

	@LoadBalanced
	@Bean
	public RestTemplate loadbalancedRestTemplate() {
		return new RestTemplate();
	}

}
