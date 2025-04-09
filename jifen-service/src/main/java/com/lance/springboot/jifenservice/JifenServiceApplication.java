package com.lance.springboot.jifenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JifenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JifenServiceApplication.class, args);
		System.out.println("积分 启动");
	}

}
