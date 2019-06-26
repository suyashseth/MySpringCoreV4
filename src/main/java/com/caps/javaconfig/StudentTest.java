package com.caps.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(StudentConfig.class);
		Student s = ctx.getBean(Student.class);
		s.getBranch().getBranch();
		
		
		
		
		
	}
}
