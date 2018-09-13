package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.example.demo.controller")
public class DemoApplication {

	@Value("${test}")
	private String value;

	@Value("${data.username}")
	private String userName;

	@Bean
    public String test() {
        System.out.println("获取到的properties中的test值为: " + value);
        return value;
    }

	@Bean
	public String username() {
		System.out.println("获取到的properties中的username值为: " + userName);
		return userName;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
