package com.caps.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements BeanNameAware, BeanFactoryAware, ApplicationContextAware
,BeanPostProcessor, InitializingBean, DisposableBean
{

	private int id;
	private String name;
	private Job job;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", job=" + job + "]";
	}
	@Override
	public void setBeanName(String arg0) {
		System.out.println("Name of Bean  = "+arg0);
	}
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("Bean Factory = "+arg0);
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("Application Context = "+arg0);
	}
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println(arg1);
		return arg0;
	}
	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println(arg1);
		return arg0;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean Is initialized");
	}
	
	public void myCustomInit()
	{
		System.out.println("This is Custom Init Method");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Beam is going to die");
	}
	
	public void myCustomDestroy()
	{
		System.out.println("This is custom destroy method");
	}
	
	
	
}
