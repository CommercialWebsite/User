package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
@EnableAutoConfiguration
public class UserApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World! User";
    }

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
		// Test
	}

}
