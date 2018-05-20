package com.producerClient.Producer.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@RequestMapping("/producer")
	public String greet() {
		return "Produce microservice, got config from config server and registerd to Eureka server";
	}
}
