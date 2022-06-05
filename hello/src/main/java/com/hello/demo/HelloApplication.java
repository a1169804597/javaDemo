package com.hello.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
public class HelloApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
//		启动器，在app启动之后执行
		System.out.println("app running ....");
	}
}
