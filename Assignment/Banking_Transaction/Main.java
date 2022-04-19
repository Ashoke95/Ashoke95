package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m=new Main();
		m.getDetails();
			
	}

	void getDetails()
	{
		
		Assignment as=new Assignment();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bank name");
		String Bankname=sc.nextLine();
		System.out.println("Enter Customer name");
		String customer_name=sc.nextLine();
		System.out.println("Enter Account No");
		String acno=sc.nextLine();
		as.setBankname(Bankname);
		as.setAcno(acno);
		as.setCustomer_name(customer_name);
		
		as.getDetails();
		as.calculate();
		as.display();
		
	}	
}
