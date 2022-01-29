package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.StudentRepo;
import com.example.demo.entity.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {
		// Student student1 = new Student("Akshat","Sinha","akshat@gmail.com");
		// studentRepo.save(student1);

		// Student student2 = new Student("Ramu","Kaka","ramu@gmail.com");
		// studentRepo.save(student2);

		// Student student3 = new Student("Thanos","Srivastava","thanos@gmail.com");
		// studentRepo.save(student3);
	}
}
