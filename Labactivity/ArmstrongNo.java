package com;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		 int r,s = 0;
		System.out.println("Enter no");
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		int m=n;
		while(n>0)
		{
			r=n%10;
			s=(int) (s+Math.pow(r, 3));
			n=n/10;
		}
		if(m==s)
			System.out.println("number "+m+" is Armstrong");
		else
			System.out.println("Number "+m+" is not Armstrong");
	}

}
