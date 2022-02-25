package com.Ashoke1.Jdbc;

import java.io.InputStreamReader;
import java.sql.*;
import java.sql.PreparedStatement;
import java.io.BufferedReader;
public class Insertexample1 {
	public static void main(String a[])
	{
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");//load driver class for my sql database
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/regis","root","root");//connection for my sql jdbc
	
	
	PreparedStatement st = con.prepareStatement("insert into student values(?,?,?,?)");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//to get input from user
	
	do {
	System.out.println("enter id");
	int id = Integer.parseInt(br.readLine());
	
	System.out.println("enter name");
	String name= br.readLine();
	
	System.out.println("enter roll");
	int roll = Integer.parseInt(br.readLine());
	
	System.out.println("enter address");
	String address= br.readLine();
	
	st.setInt(1, id);
	st.setString(2, name);
	st.setInt(3, roll);
	st.setString(4, address);
	
st.executeUpdate();
System.out.println("insert successfully");
	
System.out.println("Do you want to continue: y/n");
String s = br.readLine();

if(s.startsWith("n")) {
break;	
}
}while(true);
	
	
	con.close();	

}
	catch(Exception e) {
		System.out.println(e);
		
	}

}
}
