package com.oca_ocp;

public class MyClassImplementingMyInterface implements IMyInterface{

	
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSomethingElse() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		// LENGTH = 20;  
		// The final field IMyInterface.LENGTH cannot be assigned
		// You can't change the value of a constant! Once the value has been assigned, the
		// value can never be modified. 
		
		System.out.println(COLOR);
		System.out.println(LENGTH);
	}

}
