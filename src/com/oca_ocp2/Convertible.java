package com.oca_ocp2;

public class Convertible extends SportsCar{
	
	// Invoking a method using a reference of the class
	
	public void doThings() {
		SportsCar s = new SportsCar();
		s.goFast();
	}
	
	
// Function invocation without reference
	
//	if you see a method invoked (or a variable accessed) without the dot
//	operator (.), it means the method or variable belongs to the class where you see that
//	code
	
//	It also means that the method or variable is implicitly being accessed using the
//	this reference
	
	
//	A method of a class can be invoked without the object reference ie dot operator 
//	inside the same class of which the method belongs but only inside that class
//	not in the main method. For access any method in the main method ,
//	an object ref using dot operator is always required.
	
	public void doMore() {
		goFast();
	}
	
	public void ddoMore() {
		this.goFast();
	}
	
	
	public static void main(String[] args) {
		Convertible c = new Convertible();
		c.doThings();
		c.doMore();
	}
}
