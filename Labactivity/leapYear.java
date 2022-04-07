package com;
public class leapYear {
public static void main(String[] args) {
		for(int year=1950;year<=2024;year++)
		{
	        if(((year % 4 == 0) && (year % 100 != 0)) ||
	            (year % 400 == 0))
	        System.out.println(year+" is a leap year");
	        else
	        System.out.println(year+" is not a leap year");
		}
	}
     }