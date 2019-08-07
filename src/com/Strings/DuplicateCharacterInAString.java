package com.Strings;

import java.util.HashMap;

public class DuplicateCharacterInAString {
	public void printDuplicateCharacters(String word) {
		char[] charArray = word.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (Character ch : charArray) {
			if(hm.containsKey(ch))
				hm.put(ch, hm.get(ch) + 1);
			else
				hm.put(ch, 1);
			//System.out.println(charArray[i]);
		}
        for (Character name : hm.keySet()) {
        	if(hm.get(name) > 1) {
        		System.out.println(name);
        	}
        }
	}
	public static void main(String[] args) {
		DuplicateCharacterInAString obj = new DuplicateCharacterInAString();
		obj.printDuplicateCharacters("SobanSawaid");
		
//		HashMap<String, Integer> hm = new HashMap<String, Integer>();
//		hm.put("a", 1);
//		hm.put("b", 2);
//		hm.put("c", 3);
//		
//		System.out.println(hm);
//		hm.remove("b");
//		System.out.println(hm);
//		
//		if(hm.containsKey("a"))
//			System.out.println("HashMap has 'a'.");
//		else 
//			System.out.println("HashMap does not has 'a'.");
//		if(hm.containsKey("d")) 
//			System.out.println("HashMap has 'd'.");
//		else 
//			System.out.println("HashMap does not has 'd'.");
	}
}
