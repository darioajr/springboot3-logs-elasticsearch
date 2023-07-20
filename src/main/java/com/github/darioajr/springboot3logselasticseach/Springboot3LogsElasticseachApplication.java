package com.github.darioajr.springboot3logselasticseach;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@RestController
public class Springboot3LogsElasticseachApplication {

	public static void main(String[] args) {
		log.info("Application started ");
		SpringApplication.run(Springboot3LogsElasticseachApplication.class, args);
		log.info("Application running...");
	}

	@GetMapping("/info")
	public String getInfo() {
		String message = "Current time from service :"
				+ new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(Calendar.getInstance().getTime());
		log.info(message);
		return message;
	}
}
