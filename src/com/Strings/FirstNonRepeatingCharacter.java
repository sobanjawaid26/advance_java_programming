package com.Strings;

import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {
	public void getFirstNonRepeatingCharacter(String s) {
		char[] charArray = s.toCharArray();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if(lhm.containsKey(charArray[i]))
				lhm.put(charArray[i], lhm.get(charArray[i]) + 1);
			else
				lhm.put(charArray[i], 1);
		}
		//System.out.println(lhm);
		for (Character c : lhm.keySet()) {
			if(lhm.get(c) == 1) {
				System.out.println(c);
				return;
			}
		}
	}
	public static void main(String[] args) {
		FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();
		obj.getFirstNonRepeatingCharacter("sobanjawaidsobnjwid");
	}
//	 public static char firstNonRepeatingChar(String word) {
//	 	Set<Character> repeating = new HashSet<>();
//	    List<Character> nonRepeating = new ArrayList<>();
//	    for (int i = 0; i < word.length(); i++) {
//	      char letter = word.charAt(i);
//	      if (repeating.contains(letter)) {
//	         continue; } 
//	      if (nonRepeating.contains(letter)) {
//	         nonRepeating.remove((Character) letter);
//	         repeating.add(letter);
//		  }
//	      else {
//	         nonRepeating.add(letter);
//	      } 
//	    } 
//	return nonRepeating.get(0);
//	              }
	 
	 

}
