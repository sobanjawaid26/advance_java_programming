package com.scope;

public class PrimitiveInstanceVariableScope {
	
	int year = 8;

	public static void main(String[] args) {
		PrimitiveInstanceVariableScope obj = new PrimitiveInstanceVariableScope();
		obj.showYear();
	}
	
	public void showYear(){
		System.out.println("The Year is " + year);
	}
}
