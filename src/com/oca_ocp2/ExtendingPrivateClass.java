package com.oca_ocp2;

public class ExtendingPrivateClass extends MyPrivateClass{

	
	public void myMethod() {
		publicMethod();
		System.out.println(name);
	}
	public String privateMethod() {
		return "privte";
	}
	public static void main(String[] args) {
		ExtendingPrivateClass obj = new ExtendingPrivateClass();
		obj.myMethod();
	}
	
}
