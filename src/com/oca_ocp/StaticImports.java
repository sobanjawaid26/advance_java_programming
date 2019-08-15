package com.oca_ocp;

import static java.lang.System.out;
import static java.lang.Integer.*;

class Runner {
	public static void main(String[] args) {
		
		// with static imports
		out.println(MIN_VALUE);
		out.println(toHexString(42));
		
		//  without static imports
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(42));
	}
}

