package com.AdvancedJavaProgramming;


public class SubstitutionPrinciple {
	public static void main(String[] args) {
		
		// Substitution Principle
		// If u have a variable of a given type, you can assign it to a subtype of that type
		// Does not apply to types of lists
		Building building = new Building();
		Building office = new Office();
	}
	class Building{

		@Override
		public String toString() {
			return "Building";
		}
		
	}
	class Office extends Building{

		@Override
		public String toString() {
			return "Office";
		}
		
	}
}
