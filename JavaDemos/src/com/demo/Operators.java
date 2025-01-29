package com.demo;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//  Arithmatic op  + - * /  %
		// relational   ==  < >  <= >=  !=
		//Logical op  && , || , !
 		
	//  Arithmatic op  + - * /  %
		int num1=10;
		int num2=20;
		float val1=30.57959595555550f;  // increase decimal point value 
		float val2=40.73994344444449430f;
		
		int ans = num1+num2;
		boolean isValid=false;
		 
		 
		System.out.println("ans "+ans);
		
		System.out.println("num1+num2 ="+(num1+num2));
		
		
		System.out.println("val1*val2=="+val1*val2);
		
		
		// relational   ==  < >  <= >=  !=
		System.out.println("****************relational*****************************");
		
		System.out.println("(num1>num2) ="+(num1>num2));
		System.out.println("(num1>num2) ="+(num1>num2));
		System.out.println("(num1=>num2) ="+(num1>=num2));
		System.out.println("(num1<=num2) ="+(num1<=num2));
		
		System.out.println("(num1!=num2) ="+(isValid=num1!=num2));
		System.out.println("(isValid) ="+isValid);
		
		System.out.println("(num1==num2) ="+(num1==num2));
		
		
		
		//Logical op  && , || , !
		
		System.out.println("****************Logical*****************************");
		
		
		System.out.println("num1!=num2  && isValid is true ? "+(isValid && num1==num2) );
		
		System.out.println("num1!=num2  || isValid is true ? "+(isValid || num1!=num2) );
		
		System.out.println(" !valid  ? "+ !isValid);
		

	}

}
