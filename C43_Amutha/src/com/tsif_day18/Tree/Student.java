package com.tsif_day18.Tree;
 class Student implements Comparable 
{
	private int rollNo;
	private String name;
	private float per;

	public Student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
