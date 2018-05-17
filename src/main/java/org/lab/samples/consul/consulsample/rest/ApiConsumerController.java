package org.lab.samples.consul.consulsample.rest;

import org.lab.samples.consul.consulsample.model.DummyMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiConsumerController {

	@Value("http://${spring.application.name}/api/v1/dummy")
	private String endpoint;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/api/v1/consumer")
	public DummyMessage consume() {
		return restTemplate.getForObject(endpoint, DummyMessage.class);
	}

}
