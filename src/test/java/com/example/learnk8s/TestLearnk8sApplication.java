package com.example.learnk8s;

import org.springframework.boot.SpringApplication;

public class TestLearnk8sApplication {

	public static void main(String[] args) {
		SpringApplication.from(Learnk8sApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
