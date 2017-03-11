package com.Inheritance;

import java.math.BigDecimal;

public class Rectangle extends Polygon {

	public BigDecimal getArea(){
		return height.multiply(width);
		
	}
}
