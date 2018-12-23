package com;

public class AdditionNum {

	public static void main(String[] args) {
		AdditionNum c= new AdditionNum();
		
		c.add(11, 12);
		c.add(15, 17);
		c.add(4,7,8);
		c.add(6, 5, 5);
		c.add("bob");		
		
			
		// TODO Auto-generated method stub

	}
	public void add(int a, int b) {
		int c= a+b;
		System.out.println("add two numbers is "  +c);
	}
	public void add(int a, int b,int c){
		int d= a+b+c;
		System.out.println("addition of three numbers i s " +d);
	}
	public void add(String name) {
	System.out.println("name is " +name);
	}

}
