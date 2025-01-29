package com.demo;

public class StaticDemo {

	// nested class , variable , methods , staic block

	static int num = 90;
	static String MESSAGE = "hello world";

	static {

		System.out.println("static block");
	}

	static {

		System.out.println("static block 222");
	}

	public static void staticMethod() {
		num=600;
		System.out.println("staticMethod");

	}

	public void nonStaticMethod() {

		num=80;
		//MESSAGE="hello not ok";
		System.out.println("nonStaticMethod");
	//	staticMethod();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(MESSAGE);
		System.out.println(num);
		staticMethod();
		System.out.println("****************************************non static************************");
		StaticDemo s = new StaticDemo();
		s.nonStaticMethod();
		System.out.println(MESSAGE);
		
		System.out.println(num);
		
		
		// static block and data member issue 

	}

}
