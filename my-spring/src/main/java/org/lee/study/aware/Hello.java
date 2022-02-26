package org.lee.study.aware;

import org.springframework.stereotype.Component;

@Component
public class Hello {
	public Hello() {
	}
	public Hello(String name){
		System.out.println("name ："+name);
	}

	public void say(){
		System.out.println("helloxxx");
	}
}
