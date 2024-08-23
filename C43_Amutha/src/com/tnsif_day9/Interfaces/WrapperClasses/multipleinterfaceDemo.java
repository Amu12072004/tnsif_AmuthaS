package com.tnsif_day9.Interfaces.WrapperClasses;

interface parent1{
	public void show();
}
interface parent2{
	public void disp();
}
class myclass{
	public void display() {
		System.out.println("method in class");
	}
}
class child extends myclass implements parent1,parent2{
	 @Override
	 public void disp() {
		 System.out.println("hello");
	 } 
	 @Override
	 
	 public void display() {
		 System.out.println("welcome");
	 }
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
 }
public class multipleinterfaceDemo {
public static void main(String args[]) {
	
child obj=new child();
obj.disp();
obj.display();
obj.show();

	}

}
