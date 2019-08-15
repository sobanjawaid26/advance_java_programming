package com.oca_ocp;

public interface IMyInterface {
	
//	Because interface constants are defined in an interface,
//	they don't have to be declared as public, static, or final. They must be
//	public, static, and final, but you don't actually have to declare them that
//	way. 
	
	int LENGTH = 10;
	String COLOR = "blue";
	
	
	void doSomething();
	void doSomethingElse();
}
