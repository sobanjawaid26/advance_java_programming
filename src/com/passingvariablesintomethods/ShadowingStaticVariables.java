package com.passingvariablesintomethods;

public class ShadowingStaticVariables {
	static int myVar = 10;
	static void changeIt(int myVar) {
		myVar = 20;
		System.out.println("myVar in changeIt is " + myVar);
	}
	
	public static void main(String[] args) {
		System.out.println(myVar);
		changeIt(myVar);
		System.out.println(myVar);
	}
}
