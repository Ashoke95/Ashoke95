package com.Ashoke1.Jdbc;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
public class Insertexam2 {

	public static void main(String[] args) {
		int ch,id;
		char ans;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/regis","root","root");
		PreparedStatement st = con.prepareStatement("insert into student values(?,?,?,?)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//to get input from user
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Hi see all the option and then choose");
		    System.out.println();
			System.out.println("1:Select Data");
			System.out.println("2:Insert Data");
			System.out.println("3:update Data");
			System.out.println("4:Delete Data");
		
		   	System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
					System.out.println("Select operation:");
					ResultSet rs=st.executeQuery("select*from student");
					while(rs.next())
					{
						System.out.println(rs.getInt("id")+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
					}
					
					break;
			case 2:
				System.out.println("insert operation:");
				System.out.println("how many data do you insert?");
				int n=Integer.parseInt(br.readLine());
				for(int i=0;i<n;i++)
				{
				System.out.println("enter id");
		        id = Integer.parseInt(br.readLine());
				
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
				System.out.println("data inserted successfully! thank You");
				}	
				break;
			case 3:
				System.out.println("Update Data:");
				System.out.println("enter your id");
				id = Integer.parseInt(br.readLine());
				 
				System.out.println("enter name");
				String name= br.readLine();
			
				st.executeUpdate("update student set  name='"+name+"' where id="+id);
				System.out.println("Data updated successfully!");
				break;
				
					
			case 4:
				
				  System.out.println("Delete Data:");
				  System.out.println("enter your id which you want to delete ");
					id = Integer.parseInt(br.readLine());
				  st.executeUpdate("delete from student where id="+id);
					System.out.println("Hi data deleted successfully");
					break;
				
			default:
				System.out.println("Invalid choice");
					break;
			}
			
		System.out.println("Do you want to process again ? y/n");
		ans=sc.next().charAt(0);
		}
		
		while(ans=='y');
		System.out.println("Thank You!");
		
		con.close();	
		}
		
		
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
}
