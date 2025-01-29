package com.demo.fundemo;

class Car {

	int count = 0;
	public int count2 = 0;

	public void displayName() {

		System.out.println("this is display function from CAR class");

	}

	public String getCarNumber() {

		return "GJ 007 bonds car";
	}

	public int addCars(int count) {

		this.count = count;

		return this.count;
	}

	public int[] getSum(int x, int y) {

		count2++;
		int array[] = new int[2];
		int z = x + y;

		array[0] = z;
		array[1] = 60 + 79;

		return array;
	}

}

public class FunctionDemo1 {

	public static void main(String[] args) {

		Car c = new Car();

		c.displayName();

		String carnum = c.getCarNumber();
		System.out.println(c.getCarNumber() + "  carnum =" + carnum);

		System.out.println("first obj car count= " + c.addCars(10));

		System.out.println(c.hashCode());
		System.out.println("******************************************");
		c = new Car();

		System.out.println("second obj car count= " + c.addCars(40));
		System.out.println(c.hashCode());

		int array[] = c.getSum(50, 90);

		System.out.println(array[0] + "=====>" + array[1]);

		System.out.println(c.getSum(50, 90)[0]);

		for (int i : c.getSum(50, 90)) {

			System.out.println("====>" + i);

		}

		/*
		 * for(int i=0; i<c.getSum(90, 50).length;i++) {
		 * 
		 * 
		 * System.out.println("i==>"+c.getSum(90, 60)[i]);
		 * 
		 * }
		 */

		System.out.println("count" + c.count2);

	}

}
