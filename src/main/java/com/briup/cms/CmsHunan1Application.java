package com.briup.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.briup.cms.mapper")
public class CmsHunan1Application {

	public static void main(String[] args) {
		SpringApplication.run(CmsHunan1Application.class, args);
	}

}
