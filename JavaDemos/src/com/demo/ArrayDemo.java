package com.demo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 10, 20, 30, 40 ,50,90,42,76,56,45};

		for (int i = 0; i < num.length; i++) {

			System.out.println(num[i]);

		}

		for (int n : num) {
			System.out.println("2 nd way to iterate=" + n);
		}
		
		
		
		
		int num2[]= new int[10];
		int k=0;
		
		for(int i=num.length-1;i>=0;i--) {
			
			
			
			for(int j=k;j<=k;j++) {
				
				num2[j]=num[i];
				System.out.println(j+"num2[j]==>"+num2[j]);
				
			}
			
			k++;
		}

	}
	
	
	
	
	
	
	
	
	
	

}
