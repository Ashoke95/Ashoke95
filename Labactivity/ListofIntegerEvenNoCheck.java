package com;

import java.util.ArrayList;
import java.util.List;

public class ListofIntegerEvenNoCheck {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(6);
		li.add(81);
		li.add(20);
		li.add(12);
		li.add(4);
		li.add(12);
		System.out.println(li);
		if(isListEven(li))
		{
		    System.out.println("List not contains only even elements");
		}
		else
		{
			System.out.println("List contains only even elements");
	}
	
	}
     static boolean isListEven(List<Integer> li) {
		
		for(int i:li)
		{
			if(i%2!=0)
		
		return true;
	}
		return false;
}
}