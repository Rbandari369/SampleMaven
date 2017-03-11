package com.jhansi;


public class ConstructorExample {
	
	int a =10 ;
	
	int b = 100;
	
	public ConstructorExample(int a1, int b1) {
		
		a = a1;
		b = b1;
		
		System.out.println("Sum is: "   + (a+b));
	}
	
	public ConstructorExample(int a){
		System.out.println("a value is " + a);
		//a = a1;
		
		//this.a = a;
		System.out.println("a value is " + this.a);
	}
	
	public static void main(String args[]){
		
	    
	    ConstructorExample ex = new ConstructorExample(3);
	    
	    ConstructorExample ex1 = new ConstructorExample(3, 6);
	    
	    
	    
	    
		
	}

}
