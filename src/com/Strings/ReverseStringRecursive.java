package com.Strings;



public class ReverseStringRecursive {
	public static void main(String[] args) {
		ReverseStringRecursive obj = new ReverseStringRecursive();
		String res = obj.reverse("soban");
		System.out.println(res);
	}
	public String reverse(String s) {
		if(s.length() <= 1) 
			return s;
		else
			return reverse(s.substring(1,s.length())) + s.charAt(0);
	}
}
