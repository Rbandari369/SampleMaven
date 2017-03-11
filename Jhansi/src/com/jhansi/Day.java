package com.jhansi;


public class Day {

	void sleeping() 
	{
		System.out.println("---Sleeping");
	} 
	
	void playing()
	{
		System.out.println("---Playing");
		
	}
	
	void cooking()
	{
		System.out.println("--- cooking");
	}
	
	
	void watchingTv()
	{
		System.out.println("---Watching TV");
		
	}

	void eating() 
	{
		System.out.println("---Eating");
	} 

	void drinkingWater()
	{
		System.out.println("---Drinking Water");
	} 

	void reading()
	{
		System.out.println("---Reading");
	} 

	public static void main(String args[]) {
		
		 
		Day day1 = new Day(); // Object creation(instantiation) 
		                     // 1. Day is a Class 
		                     // 2. day1 is an instance or object of Day class
		System.out.println("Day 1");
		day1.cooking();
		day1.eating();
		day1.drinkingWater();
		
		
		Day day2 = new Day();
		System.out.println("Day 2");
		day2.eating();
		day2.drinkingWater();
		day2.playing();
		
		Day day3 = new Day();
		System.out.println("Day 3");
		day3.cooking();
		day3.eating();
		day3.drinkingWater();
		day3.sleeping();
		
		Day day4 = new Day();
		System.out.println("Day 4");
		day4.eating();
		day4.drinkingWater();
		day4.sleeping();
		day4.watchingTv();
		day4.playing();
		
		
		Day day5 = new Day();
		System.out.println("Day 5");
		day5.cooking();
		day5.drinkingWater();
		day5.sleeping();
		day5.watchingTv();
		day5.reading();
		
		Day day6 = new Day();
		System.out.println("Day 6");
		day6.eating();
		day6.drinkingWater();
		day6.sleeping();
		day6.playing();
		
		
		Day day7 = new Day();
		System.out.println("Day 7");
		day7.eating();
		day7.drinkingWater();
		day7.sleeping();
		day7.watchingTv();
		day7.reading();

		Day day8 = new Day();
		System.out.println("Day 8");
		day8.eating();
		day8.drinkingWater();
		day8.playing();
		day8.watchingTv();
		

		Day day9 = new Day();
		System.out.println("Day 9");
		day9.cooking();
		day9.drinkingWater();
		day9.sleeping();
		day9.reading();
		

		Day day10 = new Day();
		System.out.println("Day 10");
		day10.cooking();
		day10.eating();
		day10.drinkingWater();
		day10.sleeping();
		day10.playing();
		day10.reading();
		
		
	}

}

