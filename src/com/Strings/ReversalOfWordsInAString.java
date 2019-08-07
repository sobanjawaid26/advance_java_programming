package com.Strings;

public class ReversalOfWordsInAString {
	public static void main(String[] args) {
		String s1 = "my name is soban";
		String arr1[] = s1.split(" ");
		String arr2[] = new String[arr1.length];
		int n = arr1.length-1;
		//System.out.println(n);
		for (int i = n; i >= 0 ; i--) {
			arr2[n-i] = arr1[i];
			
			//System.out.print(arr1[i]);
			//System.out.print(" ");
		}
		System.out.println();
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i]);
//			System.out.print(" ");
//		}
//		System.out.println();
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i]);
//			System.out.print(" ");
//		}
	}
}
