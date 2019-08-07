package com.Strings;

public class ConvertNumericStringToAnInteger {
	public static void main(String[] args) {
		ConvertNumericStringToAnInteger obj = new ConvertNumericStringToAnInteger();
		obj.convert("12345");
		int i = Integer.parseInt("7890");
	}
	public void convert(String s) {
		int res = 1;
		char charArray[] = s.toCharArray();
		for (char c : charArray) {
			int i = (int) c;
			System.out.println(c);
		}
	}
}
