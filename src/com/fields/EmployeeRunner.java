package com.fields;

public class EmployeeRunner {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("soban");
		e1.setTitle("Developer");
		e1.setManager("Mohit");
		
		Employee e2 = new Employee();
		e2.setName("sandeep");
		e2.setTitle("Developer");
		e2.setManager("Mohit");
		
		System.out.println(e1.getName());
		System.out.println(e2.getManager());
	}

}
