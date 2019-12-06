package com.sunny.ifms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.sunny.ifms.dao")
public class IfmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IfmsApplication.class, args);
	}

}
