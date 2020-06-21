package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {
		System.out.println("Application started...");
		SpringApplication.run(GitDemoApplication.class, args);

		System.out.println("Application started...end");
		System.out.println("Application master branch changes");

		System.out.println("Application started...end-----");
		//this is my test rebase data

		//changes done in myfeature branch

	}

}
