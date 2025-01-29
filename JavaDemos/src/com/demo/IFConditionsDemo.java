package com.demo;

public class IFConditionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;
		float val1 = 30.57959595555550f;
		float val2 = 40.73994344444449430f;

		if (num1 == num2) {

			System.out.println("Numbers are equal ");
		} else {

			System.out.println("Numbers are not equal ");
		}

		boolean isValid = num1 != num2;

		if (!isValid) {

			System.out.println("Numbers are equal ");
		} else {

			System.out.println("Numbers are not equal ");
		}

		if (!true) {

			System.out.println("true ");
		} else {

			System.out.println("false ");
		}

	}

}
