package com.oca_ocp3;

import com.oca_ocp2.MyPrivateClass;

public class ProtectedAccess extends MyPrivateClass{
	
	
//	 Notice, though, that the Child class is
//	 accessing the protected variable through inheritance. Remember that any time we
//	 talk about a subclass having access to a superclass member, we could be talking about
//	 the subclass inheriting the member, not simply accessing the member through a
//	 reference to an instance of the superclass (the way any other nonsubclass would
//	 access it)
//	 
//	 The preceding code declares the variable x as protected. This makes the
//	 variable accessible to all other classes inside the certification package, as well as
//	 inheritable by any subclasses outside the package.
//	 
//	 o far, we've established that a protected member has essentially package-level
//	 or default access to all classes except for subclasses. We've seen that subclasses
//	 outside the package can inherit a protected member. Finally, we've seen that
//	 subclasses outside the package can't use a superclass reference to access a protected
//	 member. For a subclass outside the package, the protected member can be
//	 accessed only through inheritance.
//	 
//	 Once the subclass-outside-the-package inherits the protected member, that
//	 member (as inherited by the subclass) becomes private to any code outside the
//	 subclass, with the exception of subclasses of the subclass
	
	
	public void method1() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		ProtectedAccess obj = new ProtectedAccess();
		obj.method1();
	}
}
