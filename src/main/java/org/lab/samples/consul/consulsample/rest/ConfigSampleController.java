package org.lab.samples.consul.consulsample.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigSampleController {

	@Autowired
	private Environment env;

	@GetMapping("/api/v1/config/{key}")
	public ResponseEntity<String> get(@PathVariable("key") String key) {
		if (env.containsProperty(key)) {
			return ResponseEntity.ok(env.getProperty(key));
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
