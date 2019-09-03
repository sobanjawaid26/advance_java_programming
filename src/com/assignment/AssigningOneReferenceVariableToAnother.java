package com.assignment;

public class AssigningOneReferenceVariableToAnother {
	public static void main(String[] args) {
		MyObject obj = new MyObject();
		MyObject obj2 = obj;
		System.out.println(obj.name + " " + obj.size);
		
		obj.name = "MyObject";
		obj2.size = 20;
		System.out.println(obj.name + " " + obj.size);

	}
}

class MyObject{
	int size;
	String name;
}