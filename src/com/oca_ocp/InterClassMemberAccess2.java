package com.oca_ocp;

public class InterClassMemberAccess2 {
	public static void main(String[] args) {
		Moo1 m = new Moo1();
		m.useMyCoolMethod();
	}
}
class Zoo1 {
public String coolMethod() {
return "Wow baby";
}
}
class Moo1 extends Zoo1 {
public void useMyCoolMethod() {
// Does an instance of Moo inherit the coolMethod()?
System.out.println("Moo1 says, " + this.coolMethod());
// The preceding line works because Moo can inherit the
// public method
// Can an instance of Moo invoke coolMethod() on an
// instance of Zoo?Declare Class Members (OCA Objectives 2.1, 2.2, 2.3, 2.4, 2.5, 4.1, 4.2, 6.2, and 6.6) 31
Zoo1 z = new Zoo1();
System.out.println("Zoo1 says, " + z.coolMethod());
// coolMethod() is public, so Moo can invoke it on a Zoo
// reference
}
}
