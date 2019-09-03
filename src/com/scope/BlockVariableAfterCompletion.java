package com.scope;

public class BlockVariableAfterCompletion {

	public static void main(String[] args) {
		
//		Attempting to use a block variable after the code block has completed.
//		It's very common to declare and use a variable within a code block, but be
//		careful not to try to use the variable once the block has completed:
		
		for (int i = 0; i < 4; i++) {
			boolean test = false;
			if(i == 3) {
				test = true;
				System.out.println(test);
			}
		}
		System.out.println(test);
		//    'test' is an ex-variable,
		//     it has ceased to be...
	}
	
}
