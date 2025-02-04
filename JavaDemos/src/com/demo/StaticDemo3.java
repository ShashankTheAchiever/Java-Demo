package com.demo;

public class StaticDemo3 {

	static int age;
	int mobileNumber;

	static void setStaticVariable() {

		age = 60;

		// we can't assign/ modify/intiate value to non static variable in static method
		// mobileNumber=8437272;
		System.out.println("setStaticVariable method  age==>" + age);
	}

	void setNonStaticVariable() {

		// we can assign/modify/intiate value to static and non static variable in non
		// static method
		// only
		age = 60;

		mobileNumber = 8437272;

		System.out.println("setNonStaticVariable method   age==>" + age + "     mobileNumber==" + mobileNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticDemo3 s = new StaticDemo3();
		s.setNonStaticVariable();

		// we can call both static and non static method using object
		s.setStaticVariable();
		StaticDemo3.setStaticVariable();

	}

}
