package com.oca_ocp2;

public class SportsCar {
	
	// Invoking a method declared in the same class
	
	public void goFast() {
		System.out.println("Going Fast");
	}
	
	public void doSomething() {
		System.out.println("Doing Something");
		goFast();
	}
	
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.doSomething();
	}
}
