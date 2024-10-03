package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.service.ServiceOP;

@SpringBootApplication
public class Jpa5MappingRelationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Jpa5MappingRelationApplication.class, args);
		  ServiceOP op =  context.getBean(ServiceOP.class);
		//  op.addNewEmployee();
		 //op.deleteOneQuery();
		//op.getEmpId();
		  op.addStudent();
	}
	

}
