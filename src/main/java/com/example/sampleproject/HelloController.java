package com.example.sampleproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Sarthak";
	}

	@GetMapping("/cpu")
	public String cpu() {
		long end = System.nanoTime() + 200_000_000L;
		while (System.nanoTime() < end) {
			Math.sqrt(Math.random());
		}
	return "ok";
}

}
