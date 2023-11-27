package com.projetJava.donjonsETdragons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
//@EnableSwagger2
public class DonjonsETdragonsApplication {

	public static void main(String[] args) {

		SpringApplication.run(DonjonsETdragonsApplication.class, args);
	}

}
