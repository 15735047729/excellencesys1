package com.example.excellencesys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.bdqn.excellencesys.dao")
public class ExcellencesysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcellencesysApplication.class, args);
	}

}
