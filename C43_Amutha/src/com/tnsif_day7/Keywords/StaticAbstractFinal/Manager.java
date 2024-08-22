package com.tnsif_day7.Keywords.StaticAbstractFinal;

final  class Demo {// final class 
	final String name="gayu";//final variable
	final void show() {// final method
		System.out.println("final statement");
		// name="Amu"; cant change once u declare
	}
}
class value{
	void voice() {
		System.out.println("mike");
	}
}
class value1 extends value{
	void disp() {
		System.out.println("hello");
	}
}
	public class Manager{
			public static void main(String args[]) {
				value1 obj=new value1();
				
			obj.disp();
			

}}
