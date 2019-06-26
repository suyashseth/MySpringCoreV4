package com.caps.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("PersonConfig.xml");
		Person p = ctx.getBean(Person.class);
		p.getJob().doJob();
		System.out.println(p);
		
		
		Developer d =  ctx.getBean(Developer.class);
		System.out.println(d.toString());
		ctx.close();
		
		
		
		
	}
}
