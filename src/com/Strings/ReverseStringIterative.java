package com.Strings;

import java.util.HashMap;

public class ReverseStringIterative {
	public void reverseStringIterative(String s) {
		String stArray[] = s.split(" ");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		for (int i = stArray.length - 1 ; i >=0 ; i--) {
			hm.put(i, stArray[i]);
		}
		System.out.println(hm);
	}
	public static void main(String[] args) {
		ReverseStringIterative obj = new ReverseStringIterative();
		obj.reverseStringIterative("Reverse this string by iterative method");
	}
}
