package com.demo.model;

class A {

	private int value1 = 0;
	private int value2 = 0;
	private float decimalVal = 10.0f;

	public int getValue1() {
		
		return value1;
	}

	public void setValue1(int value) {
		value1 = value;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}

	public float getDecimalVal() {
		return decimalVal;
	}

	public void setDecimalVal(float decimalVal) {
		this.decimalVal = decimalVal;
	}

}

public class B {

	public static void main(String... args) {

		A a = new A();
		a.setValue1(20);
		a.setValue2(30);
		a.setDecimalVal(30.60f);
		System.out.println("values =" + (a.getValue1() + a.getValue2()));
		
		
	}

}
