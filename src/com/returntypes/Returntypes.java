package com.returntypes;

import java.awt.Color;

public class Returntypes {
	

	
	public int returnMe() {
		char c = 'c';
		return c;
		
//		In a method with a primitive return type, you can return any
//		value or variable that can be implicitly converted to the declared return type.
		
	}
	
	public int returnMeAgain() {
		float f = 3.11f;
		return (int ) f;
		
//		In a method with a primitive return type, you can return any
//		value or variable that can be explicitly cast to the declared return type.
		
	}
}
