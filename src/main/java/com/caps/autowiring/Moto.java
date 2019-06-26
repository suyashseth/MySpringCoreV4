package com.caps.autowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("moto")
@Primary
public class Moto implements Phone{

	@Override
	public void call() {
		System.out.println("Calling by Moto");
	}

}
