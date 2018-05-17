package org.lab.samples.consul.consulsample.rest;

import org.lab.samples.consul.consulsample.model.DummyMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/api/v1/consumer")
	public DummyMessage consume() {
		return this.restTemplate.getForObject("http://consul-sample/api/v1/dummy", DummyMessage.class);
	}

}
