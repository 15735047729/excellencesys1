package com.example.excellencesys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan("cn.bdqn.excellencesys.dao")
public class ExcellencesysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcellencesysApplication.class, args);
	}

}
