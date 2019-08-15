package com.casting;

public class Parent {
	
	public void firstParentMethod() {
		System.out.println("inside first parent method");
	}
	
	// OverLoaded
		public void firstParentMethod(String s) {
			System.out.println("Inside first parent overloaded method " + s );
		}
	
	public void secondParentMethod() {
		System.out.println("Inside Second parent method");
	}
	
}
