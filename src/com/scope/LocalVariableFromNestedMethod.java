package com.scope;

public class LocalVariableFromNestedMethod {
	
	
	public static void main(String[] args) {
		
	}
	
//	Attempting to access a local variable from a nested method.
//	When a method, say go(), invokes another method, say go2(), go2() won't
//	have access to go()'s local variables. While go2() is executing, go()'s local
//	variables are still alive, but they are out of scope. When go2() completes, it
//	is removed from the stack, and go() resumes execution. At this point, all of
//	go()'s previously declared variables are back in scope
	
	void go() {
		int x = 2;
		go2();
		x++;
	}
	
	void go2(){
		x++;     //   // won't compile, x is local to go()
	}
}

