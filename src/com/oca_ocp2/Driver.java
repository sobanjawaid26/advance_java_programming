package com.oca_ocp2;

public class Driver {
	public void doDriverStuff(){
		
		// Invoking an inherited method
		
		SportsCar car = new SportsCar();
		car.goFast();
		
		Convertible con = new Convertible();
		con.goFast();
	}
	
}
