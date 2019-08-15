package com.AdvancedJavaProgramming;

import java.util.ArrayList;

public class GenericMethods {
	public static void main(String[] args) {
		
		
		// If we take type in collections as Object(supermost class), then in that particular collection
		// we can insert any type of non primitive data type since they all are of Object typr, but this 
		// throws a ClassCastException at runtime
		// 
		// To overcome this we take them as <T> type so that whatever type objetcs are inserted in the 
		// collections they are of same type, if different types are inserted then it will show 
		// a compile time error
		
		ArrayList<Object> a = new ArrayList<Object>();
		a.add("a");
		a.add(1);
		for (Object object : a) {
			System.out.println(object);
		}
		
		ArrayList<T> a1 = new ArrayList<T>();
		a1.add("a");
		a1.add(1);
		for (Object object : a1) {
			System.out.println(object);
		}
		
	}
}
