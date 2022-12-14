package com.idat.kevinramirez.ConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfKevinramirezConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfKevinramirezConfigServerApplication.class, args);
	}

}
