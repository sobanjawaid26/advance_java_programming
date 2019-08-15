package com.oca_ocp;

public class MyClassExtendingAnAbstractClass extends MyAbstractClass {

	@Override
	public void doSomethingAbstract() {
		System.out.println("Doing Something Abstract");
	}
	public static void main(String[] args) {
		MyClassExtendingAnAbstractClass obj = new MyClassExtendingAnAbstractClass();
		obj.doSomethingAbstract();
		obj.getColour();
	}

}
