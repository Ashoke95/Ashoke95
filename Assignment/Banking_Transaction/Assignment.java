package com;

import java.util.Scanner;

public class Assignment {
	
	public String Bankname,customer_name;
	private String acno;
	private int balance=50000;
	public String getBankname() {
		return Bankname;
	}
	public void setBankname(String bankname) {
		Bankname = bankname;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getAcno() {
		return acno;
	}
	public void setAcno(String acno) {
		this.acno = acno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	void display()
	
	
	{
		System.out.println("Bank name  "+this.getBankname()+"  Customer Name "+this.getCustomer_name()+" Account no "+this.getAcno());
	}
	
	
	void calculate()
	{
		char ans;
		
		int balance=getBalance();
		do 
		{
		
	
		System.out.println("Enter choice");
		System.out.println("1:Diposit Amount");
		System.out.println("2:Withdraw Amount");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter amount to deposit");
			int deposit=sc.nextInt();
			balance+=deposit;
			
			break;
		case 2:
			System.out.println("Enter amount to withdraw");
			int withdraw=sc.nextInt();
			balance-=withdraw;
			
			break;
			
		default:
			System.out.println("wrong input");
		
		}
		System.out.println("your final amount is  "+balance);
		
		System.out.println("Do you want to continue? Yes or No");
		 ans=sc.next().charAt(0);
		
		}
		
	while(ans=='y' || ans=='Y');
		System.out.println("Thank You for transaction");
		
	}
	
	public void getDetails() {}	
}