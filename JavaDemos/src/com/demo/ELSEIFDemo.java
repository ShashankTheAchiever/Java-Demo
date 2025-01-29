package com.demo;

import java.util.Scanner;

public class ELSEIFDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sent1="Hiren is dev";
		String sent2="Shashank is student";
		
		
		if(sent1=="Hiren isk dev") {
			
			System.out.println("equals");
			
		}else if (sent2==sent1) {
			
			System.out.println("not equals");
			
		}else if (sent2==sent1) {
			
			System.out.println("sent2!=sent1    ===> not equals");
			
		}else {
			
			System.out.println("something else");
			
		}
		
		
		
		System.out.println("+++++++++++++++++++++SWITCH DEMO++++++++++++++++");
		
		
		System.out.println("enter month");
		Scanner cs =new Scanner(System.in);
		int val =cs.nextInt();
		
		
		// rule switch
		switch(val){
			
		
		
		case 1 ->
			System.out.println("Jan month ");
	
		case 2->
			System.out.println("feb month ");
			
		case 3->
		System.out.println("March month ");
		
			
		default->
			System.out.println("Default value if nothing matched");
			
			
		}
		
		
		
		
		
	}

}
