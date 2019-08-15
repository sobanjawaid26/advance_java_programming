package com.casting;

public class Upcasting {
	
	public static void main(String[] args) {
		
		Son s = new Son();
		Father f = s;
		Father f2 = new Father();
		Son s2 = (Son)f2;
		
		
	}
	
}

class Father{
	
}

class Son extends Father{
	
}
