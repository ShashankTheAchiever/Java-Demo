package com.demo;

public class ForloopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// reverse number		

		String name = "Hiren Maru";
		int count=0;
		int count2=0;


		for(char n:name.toCharArray()) {
			count++;
		}
		
		for(int i=0;i<name.length();i++) {
			
			
			count2++;
			
		}
		
		System.out.println("Count of string char "+count);
		System.out.println("length of string  "+name.length());
		System.out.println("count2 of string    "+count2);
		
		
		
	}

}
