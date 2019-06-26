package com.caps.javaconfig;

import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class StudentConfig {

	@Bean("student")
	public Student getStudent(@Qualifier("ec")Branch b)
	{
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Shweta");
		s1.setBranch(b);
		return s1;
	}
	
	
	@Primary
	@Bean("ec")
	public ElectronicsAndCommunication getEC()
	{
		ElectronicsAndCommunication ec = new ElectronicsAndCommunication();
		return ec;
	}
	
	
	@Primary
	@Bean("cs")
	public ComputerScience getCS()
	{
		ComputerScience cs = new ComputerScience();
		return cs;
	}
	
	@Primary
	@Bean("me")
	public Mechanical getME()
	{
		Mechanical me = new Mechanical();
		return me;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
