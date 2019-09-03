package com.constructors;

public class MyClass {
		int i;
		String s;
		
	private MyClass() {
		
	}
	
	private MyClass(int i, String s) {
		this.i = i;
		this.s = s;
	}
	
	public static MyClass getMyClassObject() {
		return new MyClass();
	}
	
	public static void main(String[] args) {
		byte a = 3;
		byte b = 8;
		byte c = (byte) (a + b);
//		System.out.println(c);
		
		int j = 100;
		double k = 1000.99;
		int m = (int)k;
		System.out.println(m);
		double n = j;
		
		int x = (int)33.45;
		System.out.println(x);
	}
	
}
