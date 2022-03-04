package com.dxc.myspproject;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MySpProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpProjectApplication.class, args);
	}
	
	@GetMapping
	public String hello() {
		return "hi I'm Thanh Bui";
	}

}
