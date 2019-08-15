package com.oca_ocp3;

import com.oca_ocp2.MyPrivateClass;

public class MyClassExtendingProtectedSubclass extends ProtectedAccess{
	public void method2() {
		System.out.println(name);
	}
	
	public void method3() {
		MyPrivateClass p = new MyPrivateClass();
		System.out.println(p.name);
	}
	
//	You can be certain that any local variable declared with an access modifier will
//	not compile. In fact, there is only one modifier that can ever be applied to local
//	variables—final
	
	public void method4() {
		private int x = 5;
		System.out.println(x);
	}
	
//	So if class Neighbor
//	instantiates a Child object, then even if class Neighbor is in the same package as
//	class Child, class Neighbor won't have access to the Child's inherited (but
//	protected) variable name
	
	public static void main(String[] args) {
		MyClassExtendingProtectedSubclass obj = new MyClassExtendingProtectedSubclass();
		obj.method4();
	}
	
}
