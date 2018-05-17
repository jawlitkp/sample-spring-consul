package org.lab.samples.consul.consulsample.rest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.lab.samples.consul.consulsample.model.DummyMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

	@GetMapping("api/v1/dummy")
	public DummyMessage get() {
		String body = "Generated at " + LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
		return DummyMessage.builder().id(UUID.randomUUID().toString()).subject("Hello").body(body).build();
	}

	@PostMapping("api/v1/dummy")
	public ResponseEntity<DummyMessage> post(@RequestBody DummyMessage message) {
		String body = "Processed at " + LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
		message.setBody(body);
		return ResponseEntity.ok(message);
	}

}
