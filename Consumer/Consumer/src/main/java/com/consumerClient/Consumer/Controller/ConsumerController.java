package com.consumerClient.Consumer.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@RequestMapping("/consumer")
	public String greet() {
		return "I am consumer, got config from the config server and registerd to eureka";
	}
}
