package com.AdvancedJavaProgramming;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	public static void main(String[] args) {
		// Without using generics, we have to cast the object into respective type, String in this type
		ArrayList l = new ArrayList();
		l.add("A");
		String name = (String) l.get(0);
		l.add(1);  // NO ERROR
		
		/////////////////////////////////////////////////////////////////////////////////////////////////
		
		// With generics we do not need to cast the object as we mention the object type in 
		// Collection declaration itself
		// Advantage of using generics is that the compiler only checks
		ArrayList<String> ll = new ArrayList<String>();
		ll.add("A");
		String name1 =  ll.get(0);
		// ll.add(2);   // ERROR : The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
		
	}
}
