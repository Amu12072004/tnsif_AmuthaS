package com.tnsif_day10.Exceptionhandling;

public class throwsandthrow {

public void Demo()
{
	int a=5/10;
	System.out.println(a);
}
public void Show(){
	try{
		Demo();
		//throws new exception();
		//syntax for throw
		}
	catch(Exception e) {
		System.out.println("Exception-->"+e);
	}finally {
		System.out.println("hello world");
	}
	}
}
