package com.enums;

enum CoffeeSize {SMALL, MEDIUM, BIG};

class Coffee{
	CoffeeSize size;
}

//The key points to take away from these examples are that enums can be declared
//as their own class or enclosed in another class, and that the syntax for accessing an
//enum's members depends on where the enum was declared.


class Tea{
	enum TeaSize {SMALL, MEDIUM, BIG};
	TeaSize size;
}


public class CoffeeTest {
	
	public static void main(String[] args) {
		
		Coffee c = new Coffee();
		c.size = CoffeeSize.MEDIUM;
		
		Tea t = new Tea();
		t.size = Tea.TeaSize.MEDIUM;     // enclosing class name required


		System.out.println(c.size);
		System.out.println(t.size);

	}

}
