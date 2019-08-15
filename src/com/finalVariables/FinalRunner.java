package com.finalVariables;

public class FinalRunner {
	
	public static void main(String[] args) {
		
//		A reference variable marked
//		final can't ever be reassigned to refer to a different object. The data within the
//		object can be modified, but the reference variable cannot be changed. In other
//		words, a final reference still allows you to modify the state of the object it refers to,
//		but you can't modify the reference variable to make it refer to a different object.
		
		
//		Burn this in: there are no final objects, only final references. 
		
		
		final MyObject obj1 = new MyObject();
		
		System.out.println("Fields before");
		System.out.println(obj1.name);
		System.out.println(obj1.size);
		
		obj1.name = "mobile";
		obj1.size = 2;
		
		System.out.println();
		System.out.println("Fields after");
		System.out.println(obj1.name);
		System.out.println(obj1.size);
		
	}

}
