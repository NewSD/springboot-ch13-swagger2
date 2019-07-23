package com.niu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCh13Swagger2Application {

	/**
	 * 访问 http://localhost:8080/swagger-ui.html 查看接口文档
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootCh13Swagger2Application.class, args);
	}

}
