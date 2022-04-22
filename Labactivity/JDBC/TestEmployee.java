package com.crud.JDBCcrud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");//load driver class for my sql database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/core","root","root");//connection for my sql jdbc
		
		PreparedStatement st = con.prepareStatement("insert into Employee values(?,?,?,?,?,?)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//to get input from user
		Scanner sc=new Scanner(System.in);
		char ans;
		do
		{
			
			System.out.println("1:Display Data");
			System.out.println("2:Insert Data");
			System.out.println("3:update Data");
			System.out.println("4:Delete Data");
			System.out.println("5: Exit");
		
		   	System.out.println("Enter your choice");
			int ch = Integer.parseInt(br.readLine());
			String address, salary;String phone;
			String name;
			int id;
			switch(ch)
			{
			case 1:
					System.out.println("Display operation:");
					ResultSet rs=st.executeQuery("select*from Employee");
					while(rs.next())
					{
						System.out.println(rs.getInt("id")+"\t"+rs.getString(2)+"\t "+rs.getString(3)+"\t"+rs.getString(4)+"\t "+rs.getString(5)+"\t"+rs.getNString(6));
					}
					
					break;
			case 2:
				System.out.println("insert operation:");
				System.out.println("how many data you want to insert?");
				int n=Integer.parseInt(br.readLine());
				for(int i=0;i<n;i++)
				{
				System.out.println("enter id");
		        id = Integer.parseInt(br.readLine());
				
				System.out.println("enter name");
				name= br.readLine();
				
				System.out.println("enter address");
				 address = br.readLine();
				
				System.out.println("enter salary");
				  salary = br.readLine();
				 System.out.println("enter email");
				 String email = br.readLine();
				 System.out.println("enter phone");
				 phone = br.readLine();
				
				st.setInt(1, id);
			    st.setString(2, name);
				
			    st.setString(3, address);
				st.setString(4, salary);
				st.setString(5, email);
				st.setString(6, phone);
			    st.executeUpdate();
			    
				System.out.println("data inserted successfully! thank You");
				}	
				break;
			case 3:
				System.out.println("Update Data:");
				System.out.println("enter your id in which you want to update");
				id = Integer.parseInt(br.readLine());
				System.out.println("which field you want to update");
				System.out.println("\n 1.Name \n 2.Address \n 3.salary \n 4.phone\n 5.exit ");
				System.out.println("Enter option for update :");
				int ch11=Integer.parseInt(br.readLine());
				switch(ch11)
				{
				case 1:System.out.println("enter name for update");
				        name=br.readLine();
				        st.executeUpdate("update Employee set  name='"+name+"' where id="+id);
						System.out.println("Data updated successfully!");
						break;
				case 2:System.out.println("enter Address for update");	
				     address = br.readLine();
				     st.executeUpdate("update Employee set  address='"+address+"' where id="+id);
					 System.out.println("Data updated successfully!");
						break;
				case 3:System.out.println("Enter salary for update");
				 	salary = br.readLine();
				 	 st.executeUpdate("update Employee set  salary='"+salary+"' where id="+id);
					 System.out.println("Data updated successfully!");
						break;
						
				case 4:System.out.println("Enter salary for update");
			 			phone = br.readLine();
			 			st.executeUpdate("update Employee set  phone='"+phone+"' where id="+id);
			 			System.out.println("Data updated successfully!");
			 			break;
					
				case 5:
					System.out.println("exit");
					break;		
				default:System.out.println("Invalid choice");		
				
				}
				
				break;
				
					
			case 4:
				
				  System.out.println("Delete Data:");
				  System.out.println("enter your id which you want to delete ");
					id = Integer.parseInt(br.readLine());
				  st.executeUpdate("delete from Employee where id="+id);
					System.out.println("Hi data deleted successfully");
					break;
				
			case 5:
				System.out.println("exit");
				break;
			default:
				System.out.println("Invalid choice");
					break;
			}
			
		System.out.println("Do you want to process again ? y/n");
		ans=sc.next().charAt(0);
		}
		
		while(ans=='y'||ans=='Y');
		System.out.println("Thank You!");
		
		con.close();	
		}
			
	}
	
