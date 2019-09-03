package com.passingvariablesintomethods;

public class ShadowingInstanceVariables {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		System.out.println(obj.myVar);
		ShadowingInstanceVariables s = new ShadowingInstanceVariables();
		s.changeIt(obj);
		System.out.println(obj.myVar);
	}
	
	public void changeIt(MyClass c) {
		c.myVar = 20;
		System.out.println("Value of myVar in changeIt is " + c.myVar);
	}
	
}

class MyClass{
	public int myVar = 10;
}
