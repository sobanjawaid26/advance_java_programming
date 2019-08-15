package com.oca_ocp;

public abstract class MyAbstractClass {
	
	String colour;
	
	
//	Notice that the methods marked abstract end in a semicolon rather than
//	curly braces
//	Look for questions with a method declaration that ends with a semicolon, rather
//	than curly braces. If the method is in a class—as opposed to an interface—then both
//	the method and the class must be marked abstract.
//	always
//	remember that if even a single method is abstract, the whole class must be
//	declared abstract. 
//	 You can,however, put nonabstract methods in an abstract class. For example, you might
//	 have methods with implementations that shouldn't change from Car type to Car
//	 type, such as getColor() or setPrice().
	
//	You can't mark a class as both abstract and final. They have nearly opposite
//	meanings. An abstract class must be subclassed, whereas a final class must not be
//	subclassed.
	
	// Abstract color
	public abstract void doSomethingAbstract();
	
	// Concrete method
	public void getColour() {
		System.out.println("No color found");
	}
	
	

	
}
