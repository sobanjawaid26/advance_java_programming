package com.casting;

public interface IParent extends IFather, IMother {

	public Apple eat();
	
	public void sleep();
	
	public void poo();
}

interface IFather{
	
	public void fatherInterfaceMethod();
	
}

interface IMother{
	public void motherInterfaceMethod();
}
