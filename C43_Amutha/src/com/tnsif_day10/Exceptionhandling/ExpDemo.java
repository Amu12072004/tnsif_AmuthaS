package com.tnsif_day10.Exceptionhandling;
import java.util.Scanner;
public class ExpDemo {

public static void main(String args[]) {
Scanner sc =new Scanner (System.in);
	// TODO Auto-generated method stub
try {
	System.out.println("Enter the number");
	 int number =sc.nextInt();
	System.out.println( number %2==0? number+"is even":"is odd");//ternary operator
	return;
}

catch (Exception e) {
	System.err.println("invalid input");
}
finally {
	System.out.println("in finally");
	
}
}
}