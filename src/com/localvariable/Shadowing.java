package com.localvariable;

public class Shadowing {
	
	
//	It is possible to declare a local variable with the same name as an instance
//	variable. It's known as shadowing
	
	public int shadowVar;
	
	public void shadowMethod() {
		int shadowVar = 10;
		System.out.println(shadowVar);
	}
	
	public void anotherShadowMethod() {
		System.out.println(shadowVar);
	}
	
	public static void main(String[] args) {
		Shadowing sd = new Shadowing();
		sd.shadowMethod();
		sd.anotherShadowMethod();

	}

}
