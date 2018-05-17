package org.lab.samples.consul.consulsample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DummyMessage {

	private String id;

	private String subject;

	private String body;
}
