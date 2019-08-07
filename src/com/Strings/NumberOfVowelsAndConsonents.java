package com.Strings;

public class NumberOfVowelsAndConsonents {
	public static void main(String[] args) {
		NumberOfVowelsAndConsonents obj = new NumberOfVowelsAndConsonents();
		obj.count("soban");
	}
	public void count(String s) {
		int count = 0 ;
		char charArray[] = s.toCharArray();
		for (char c : charArray) {
			if(c=='a' || c=='e' || c == 'i' ||c=='o' ||c=='u') {
				count++;
			}
		}
		int c  = s.length() - count;
		System.out.println("Vowels -> " + count + " consonants -> " + c);
	}
}
