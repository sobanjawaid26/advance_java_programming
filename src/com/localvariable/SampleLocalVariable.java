package com.localvariable;

public class SampleLocalVariable {
	
	public int returnInt() {
	
	//	int myLocalVar;
		
//		Typically, you'll initialize a local variable in the same line in which you declare it,
//		although you might still need to reassign it later in the method. The key is to
//		remember that a local variable must be initialized before you try to use it. The
//		compiler will reject any code that tries to use a local variable that hasn't been
//		assigned a value, because—unlike instance variables—local variables don't get
//		default values.
	
	//	before a local variable can be used, it must be initialized with a value
		
		int myLocalVar = 10;
		
	//	public int myAnotherLocalVar = 11;              //  Illegal modifier for parameter myAnotherLocalVar; only final is permitted
	//	private int myAnotherLocalVar  = 12;            //  Illegal modifier for parameter myAnotherLocalVar; only final is permitted
	//	static int myAnotherLocalVar  = 12;             //  Illegal modifier for parameter myAnotherLocalVar; only final is permitted
		
//		Local variable declarations can't use most of the modifiers that can be applied to
//		instance variables, such as public (or the other access modifiers), transient,
//		volatile, abstract, or static
		
		final int myAnotherLocalVar2  = 12;
		
	//	local variables can be marked final	

		return myLocalVar;
	}
	
	public void anotherReturnInt() {
		// int myInt = myLocalVar            //   myLocalVar cannot be resolved to a variable
	}
	
//	int newVar = myLocalVar;                           //   myLocalVar cannot be resolved to a variable
	
//	A local variable can't be referenced in any code outside the method in which it's
//	declared.
	
}
