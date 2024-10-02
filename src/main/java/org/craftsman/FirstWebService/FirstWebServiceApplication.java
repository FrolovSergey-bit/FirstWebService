package org.craftsman.FirstWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class FirstWebServiceApplication {
	public static void main(String[] args) {
		// если нужно передать какие-то аргументы в контекст приложения, а потом достать
//		System.setProperty("jdbc_url", args[0]);
//		System.getProperty("jdbc_url");

		SpringApplication.run(FirstWebServiceApplication.class, args);
	}
}
