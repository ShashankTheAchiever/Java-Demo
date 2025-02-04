package com.demo.oop;

public class ThisDemo1 {

	double pi;
	int gravity;

	public void testMethod(int value) {

		System.out.println("testMethod===>" + value);

	}

	public ThisDemo1 testMethod2() {

		System.out.println("testMethod2===>");

		return this;
	}

	public void setValues(double pi, int gravity) {

		this.pi = pi;

		this.gravity = gravity;

		this.testMethod(this.gravity);

	}

	public ThisDemo1() {

		System.out.println("ThisDemo1 const");

	}

	public ThisDemo1(int val) {

		this();
		System.out.println("ThisDemo1 const with value " + val);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisDemo1 t = new ThisDemo1();
//
		t.setValues(3.14, 10);

		System.out.println(t.pi);
		System.out.println(t.gravity);

		ThisDemo1 t2 = new ThisDemo1();
		System.out.println("*****************************");
		t2.setValues(3.14, 50);

		// this keyword return current class object regardless of calling sequance
		ThisDemo1 t3 = t2.testMethod2();
		// t2.setValues(3.14, 509);

		System.out.println("t3==>" + t3.gravity);
		System.out.println("t3==>" + t3.pi);

		System.out.println("*****************************");

		ThisDemo1 T4 = new ThisDemo1(600);

	}

}
