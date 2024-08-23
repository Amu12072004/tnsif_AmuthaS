package com.tnsif_day8.Polymorphism;

public class overloading {
	int num1;
	int num2; //data members
	int result;
	 void sum (int a,int b) {// method
  num1=a;
  num2=b;
  result=num1+num2;
  System.out.println("the result are:"+result);
	 }
	 void sum (int a,double b) {// method
		  num1=a;
		  num2= (int)b;
		  result=num1+num2;
		  System.out.println("the result are:"+result);
			 }
	 void sum (double a,double b) {// method
		  num1= (int)a;
		  num2=(int)b;
		  result=num1+num2;
		  System.out.println("the result are:"+result);
			 }

public static void main (String args[]) {
	overloading obj=new overloading();
	obj.sum(3,6);
}
}