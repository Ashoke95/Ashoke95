package com;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHasMap {
	
	static Map<String,Integer> map=new HashMap<>();
	
	public static void sortbykey()
	{
		TreeMap<String,Integer> key=new TreeMap<>(map);
		for(Map.Entry<String,Integer> sort:key.entrySet())
		
		{
			System.out.println("key="+sort.getKey()+"  "+"value= "+sort.getValue());
		}
	}
	
	public static void main(String a[])
	{
		 map.put("Rahul", 30);
	        map.put("Nobin", 100);
	        map.put("AShoke", 80);
	        map.put("Rima", 55);
	        map.put("MUkesh", 50);
	        sortbykey();
	 
	}
	

}
