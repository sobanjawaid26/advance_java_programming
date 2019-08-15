package com.arrays;

public class MyArray {
	
	public static void main(String[] args) {
		
//		In Java, arrays are objects that store multiple variables of the same type or variables
//		that are all subclasses of the same type
		
//		 Arrays can hold either primitives or object
//		 references, but an array itself will always be an object on the heap, even if the array
//		 is declared to hold primitive elements. In other words, there is no such thing as a
//		 primitive array, but you can make an array of primitives.
		
//		When declaring an array reference, you should always put the array brackets
//		immediately after the declared type, rather than after the identifier (variable
//		name). That way, anyone reading the code can easily tell that, for example,
//		key is a reference to an int array object, and not an int primitive.
		
//	int[5] scores;

		
//		The preceding code won't compile. Remember, the JVM doesn't allocate space until you
//		actually instantiate the array object. That's when size matters.
		
		Electronics e1 = new Electronics();
		Electronics e2 = new Electronics();
		Electronics e3 = new Electronics();

		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		Laptop l3 = new Laptop();
		
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		Mobile m3 = new Mobile();

		Electronics [] ElectronicsArray = new Electronics[9];
		
		ElectronicsArray[0] = e1;
		ElectronicsArray[1] = e2;
		ElectronicsArray[2] = e3;
		ElectronicsArray[3] = l1;
		ElectronicsArray[4] = l2;
		ElectronicsArray[5] = l3;
		ElectronicsArray[6] = m1;
		ElectronicsArray[7] = m2;
		ElectronicsArray[8] = m3;
		
		for (Electronics electronics : ElectronicsArray) {
			System.out.println(electronics);
		}

		
	}
}
