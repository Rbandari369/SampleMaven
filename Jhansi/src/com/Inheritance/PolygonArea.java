package com.Inheritance;

import java.math.BigDecimal;

public class PolygonArea {


	public static void main(String args[]){
		
		Rectangle r = new Rectangle();
		r.setValues(new BigDecimal("5"),new BigDecimal("5"));
	
		System.out.println("Rectangle Area is"+r.getArea());
		
		Traingle t = new Traingle();
		t.setValues(new BigDecimal("6"),new BigDecimal("6"));
		
		System.out.println("Triangle Area is"+t.getArea());
	}
}
