package com.oca_ocp;

public class InterClassMemberAccess {
	public static void main(String[] args) {
		Moo m = new Moo();
		m.useAZoo();
	}
}
class Zoo {
public String coolMethod() {
return "Wow baby";
}
}
class Moo {
public void useAZoo() {
Zoo z = new Zoo();
// If the preceding line compiles Moo has access
// to the Zoo class
// But... does it have access to the coolMethod()?
System.out.println("A Zoo says, " + z.coolMethod());
// The preceding line works because Moo can access the
// public method
}

}