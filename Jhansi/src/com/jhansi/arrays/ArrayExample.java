package com.jhansi.arrays;

public class ArrayExample {
	
	private static int a[] = {3,4,5,5,6,6,9};
	
	public static void main(String[] args){
		
		
		System.out.println("\nArray elements are:");
		
		for (int i = 0; i < a.length; i++){
			
			System.out.println("\n"+ a[i]);
		}
		
	//for addition in arrays, you need an another variable to store//
	
		int total = 0;
		for (int i = 0; i < a.length; i++){
			total += a[i]; //total = total + a[i];//
				
		}
		System.out.println("The total is: "  + total );
		
		
		// for largest values//
		
		int max = a[0];
		for (int i = 0; i < a.length; i++){
			if (a[i]> max){
				max = a [i];
				
			}
			
		}
		System.out.println("The max is: " + max);
	}
	
	

}
