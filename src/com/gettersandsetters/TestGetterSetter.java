package com.gettersandsetters;

public class TestGetterSetter {

	public static void main(String[] args) {
		MyGettersAndSetter obj = new MyGettersAndSetter();
		
		obj.setVar1("HELLO");
		System.out.println(obj.getVar1());
		
		obj.setVar2(10);
		System.out.println(obj.getVar2());
		
		obj.setVar3(true);
		System.out.println(obj.getVar3());

	}
	
}
