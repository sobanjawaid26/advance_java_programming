package com.singledimensionalarray;

public class DefaultValuesOfAnArray {
	
	public void myFunction() {
		String s = null;
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		int [] firstSArray = new int[10];
		int [] secondSArray;
		
		System.out.println(firstSArray);

		for (int i = 0; i < firstSArray.length; i++) {
			System.out.println(firstSArray[i]);
		}
	}
	
}
