package com.tnsif_day8.Polymorphism;

import com.tnsif_day3.oops.Encapsulation;

public class overriding {
	String name; // data member &instance variable
	int age;
	String dept;
	public String getName() { //naming convension 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "oops concept [Name="+name +",Age="+age+",Dept="+dept+"]";
	}
	
	public static void main(String[] args) {
		
		Encapsulation obj=new Encapsulation ();
		obj.setName("Amu");
		obj.setAge(20);
		obj.setDept("ECE");
	System.out.println(obj.name);
	System.out.println(obj.age);
	System.out.println(obj.dept);
	}
}