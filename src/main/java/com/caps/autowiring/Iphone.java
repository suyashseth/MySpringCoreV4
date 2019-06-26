package com.caps.autowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("iphone")
public class Iphone implements Phone{

	@Override
	public void call() {
		System.out.println("Calling by Iphone");
	}

}
