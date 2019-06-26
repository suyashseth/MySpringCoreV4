package com.caps.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(UserConfig.class);
		User u = ctx.getBean(User.class);
		u.getPhone().call();



	} 

}
