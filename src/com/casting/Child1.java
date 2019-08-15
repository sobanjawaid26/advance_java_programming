package com.casting;

public class Child1 extends Parent {
	
	public void firstParentMethod() {
		System.out.println("Inside first child method");
	}
	
	// OverLoaded
			public void firstParentMethod(String s) {
				System.out.println("Inside first child overloaded method " + s );
			}
		
	
	public void secondParentMethod() {
		System.out.println("Inside second child method");
	}
	
	public static void main(String[] args) {
		
//		All the compiler can do is verify that the two types are in the same
//		inheritance tree, so that depending on whatever code might have come before the
//		downcast, it's possible that animal is of type Dog. The compiler must allow things
//		that might possibly work at runtime. However, if the compiler knows with certainty
//		that the cast could not possibly work, compilation will fail
		
		Parent p1 = new Parent();
		Child1 p2 = new Child1();
 		Parent p3 = p2;
 		Child1 c1 = (Child1)p1;
 		// String s = (String)p1;
		
		
//		p1.firstParentMethod();
//		p1.secondParentMethod();
//		System.out.println();
//		
//		p2.firstParentMethod();
//		p2.secondParentMethod();
//		System.out.println();
//		
//		p3.firstParentMethod("soban");
//		p3.secondParentMethod();
//		System.out.println();
	}
	
}
