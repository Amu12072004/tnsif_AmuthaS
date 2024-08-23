package com.tnsif_day9.Interfaces.WrapperClasses;
interface one{
	int age=20;// final&static 
	void show();// default public abstract
}
class two implements one{
	@Override
	public void show() {
		System.out.println("interface method one"); 
	}
}
public class InterfaceDemo {
	public static void main(String args[]) {
		two obj = new two ();
		obj.show();
		
	}

}


