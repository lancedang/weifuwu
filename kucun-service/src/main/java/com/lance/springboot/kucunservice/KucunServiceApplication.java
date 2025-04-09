package com.lance.springboot.kucunservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KucunServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KucunServiceApplication.class, args);
		System.out.println("库存 启动");
	}

}
