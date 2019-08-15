package com.inheritance;

public class MyFirstInheritance {
	public static void main(String[] args) {
		
		MyFirstInheritance obj = new MyFirstInheritance();
		IOSMobile ios = new IOSMobile();
		AndroidMobile android = new AndroidMobile();
		
		obj.genericCall(ios);
		obj.genericCall(android);
		
		//ios.call();
		//android.call();
		
	}
	
	void genericCall(Mobile m) {
		m.call();
	}
	
}

class Mobile {
	void call() {
		System.out.println("Calling from mobile");
	}
}

class IOSMobile extends Mobile{
	void call() {
		System.out.println("Calling from Ios");
	}
}

class AndroidMobile extends Mobile{
	void call() {
		System.out.println("Calling from Android mobile");
	}
}

