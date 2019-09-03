package com.passingvariablesintomethods;

import java.awt.Dimension;

public class ReferenceTest {

	public static void main(String[] args) {
		Dimension d = new Dimension();
		d.width = 10;
		d.height = 20;
		System.out.println(d);
		ReferenceTest ref = new ReferenceTest();
		ref.modify(d);
		System.out.println("-------------");
		System.out.println(d);
		System.out.println("*************");
		
		
//		Notice when the Dimension object on line 4 is passed to the modify() method,
//		any changes to the object that occur inside the method are being made to the object
//		whose reference was passed. In the preceding example, reference variables d and dim
//		both point to the same object.
		
		
		int i = 10;
		System.out.println(i);
		ref.modifyPrimitive(i);
		System.out.println("-------------");
		System.out.println(i);
		
//		Notice that a did not change after it was passed to the method. Remember, it was
//		a copy of a that was passed to the method. When a primitive variable is passed to a
//		method, it is passed by value, which means pass-by-copy-of-the-bits-in-the-variable.
		
	}
	
	public void modify(Dimension dim) {
		dim.height = dim.height - 5;
	}
	
	public void modifyPrimitive(int i) {
		i = i + 1;
	}
}
