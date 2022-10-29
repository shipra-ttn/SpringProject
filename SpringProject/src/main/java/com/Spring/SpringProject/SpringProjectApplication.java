package com.Spring.SpringProject;

import com.Spring.SpringProject.springexample.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringProjectApplication.class, args);
		BinarySearchImpl binary = applicationContext.getBean(BinarySearchImpl.class);
		int result = binary.binarySearch(new int[]{4, 5, 6, 3, 2, 1}, 5);
		if (result == -1) {
			System.out.println("Value not found");
		} else {
			System.out.println("Value found");
		}
	}
}


