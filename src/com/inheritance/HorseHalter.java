package com.inheritance;

public class HorseHalter {

}

class Horse{
	
	Halter myHalter;
	
	void tie(Rope rope) {
		myHalter.tie();
	}
}

class Halter{

	public void tie() {
		
	}
	
}

class Rope{
	
}
