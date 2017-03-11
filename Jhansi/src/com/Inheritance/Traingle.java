package com.Inheritance;

import java.math.BigDecimal;

public class Traingle extends Polygon {
	
	public BigDecimal getArea(){
		return height.multiply(width).divide(new BigDecimal("2"));
		
		
	}

	
}
