package com.caps.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("PersonConfig.xml");
		Person p = ctx.getBean(Person.class);
		p.getJob().doJob();
		
		
		Developer d =  ctx.getBean(Developer.class);
		System.out.println(d.toString());
		
		
		
		
	}
}
