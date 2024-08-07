package com.project.Student.API;

import com.project.Student.API.Controller.StudentController;
import com.project.Student.API.Repository.StudentRepository;
import com.project.Student.API.Service.Impl.StudentServiceImpl;
import com.project.Student.API.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class StudentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApiApplication.class, args);
	}

}
