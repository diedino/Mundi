package ru.krasnov.mundi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MundiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MundiApplication.class, args);
		System.out.println("yap!");
	}
}
