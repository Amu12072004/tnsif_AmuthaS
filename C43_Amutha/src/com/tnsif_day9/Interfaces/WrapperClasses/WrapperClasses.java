package com.tnsif_day9.Interfaces.WrapperClasses;
public class WrapperClasses {
		public static void main(String[] args) {
			// Unboxing
			Integer i = new Integer(10);
			System.out.println(i);
			int b = i.intValue();//predefine method 
			System.out.println(b);

			// Without using intValue()
			int c = i;
			System.out.println(c);
			
			//Autoboxing-converting implicity
			int a = 100;
			Integer i1 = a;
			System.out.println(i1);
		}
	}
