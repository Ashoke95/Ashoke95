package com;

public class CheckVowel {

	public static void main(String[] args) {
	String s="Ashoke";int c=0;
	String s1=s.toLowerCase();
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
		{
		c++;
		}
	}
	
	System.out.println("No of vowel in the String is "+c);
	}
}
