package com.constructors;

public class Runner {
	
	//Constructor
	public Runner(){
		System.out.println("Runner instance created");
	}
	//  Instance variables and methods
	public int i = 4;
	public void doMore() {
		System.out.println("Doing more");
	}
	
	// Static variables and methods
	static String s = "yes";
	static void doSomething() {
		//  static method cannot access an instance (non-static) variable
		int x = i;
		
		//   static method cannot access a non-static method
		doMore();        //       Cannot make a static reference to the non-static method doMore() from the type Runner
		
		
		//    static method can access a static method or variable
		staticMethod();
		System.out.println("no");
	}
	
	static void staticMethod() {
		System.out.println("Inside static method");
	}
	public static void main(String[] args) {
		
		MyClass m = MyClass.getMyClassObject();
		
		System.out.println(m);
		System.out.println(s);
		doSomething();
		System.out.println("--------------------");
		
		Runner r = new Runner();
		System.out.println(r.s);
		r.doSomething();
		
		
		
	}
	
}
