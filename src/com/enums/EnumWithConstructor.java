package com.enums;

enum LaptopSize{
	SMALL(13), MEDIUM(15), LARGE(17);
	
	LaptopSize(int size){
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	private int size;
}

class Laptop{
	LaptopSize dimen;
}

public class EnumWithConstructor {
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		l1.dimen = LaptopSize.MEDIUM;
		
		System.out.println(l1.dimen.getSize());
	}
}
