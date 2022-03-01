package com.Ashoke1.Jdbc;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
public class Insertexam2 {

	public static void main(String[] args) {
		int ch,ch1,id,roll;
		char ans;
		String name="",address;
		try
		{
			Connection con = Helper.makeCon();
		PreparedStatement st = con.prepareStatement("insert into student values(?,?,?,?)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//to get input from user
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Hi see all the option and then choose");
		    System.out.println();
			System.out.println("1:Display Data");
			System.out.println("2:Insert Data");
			System.out.println("3:update Data");
			System.out.println("4:Delete Data");
			System.out.println("5: Exit");
		
		   	System.out.println("Enter your choice");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
			case 1:
					System.out.println("Display operation:");
					ResultSet rs=st.executeQuery("select*from student");
					while(rs.next())
					{
						System.out.println(rs.getInt("id")+"\t"+rs.getString(2)+"\t "+rs.getInt(3)+"\t"+rs.getString(4));
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
				
				System.out.println("enter roll");
				 roll = Integer.parseInt(br.readLine());
				
				System.out.println("enter address");
				 address= br.readLine();
				
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
				System.out.println("enter your id in which you want to update");
				id = Integer.parseInt(br.readLine());
				System.out.println("which field you want to update");
				System.out.println("\n 1.Name \n 2.Roll \n 3.Address \n 4.update all field \n 5.exit\n ");
				System.out.println("Enter option for update :");
				ch1=Integer.parseInt(br.readLine());
				
				switch(ch1)
				{
				case 1:
					
					System.out.println("enter name");
					 name= br.readLine();
				
					st.executeUpdate("update student set  name='"+name+"' where id="+id);
					System.out.println("Data updated successfully!");
					break;
					
				case 2:
					  System.out.println("enter roll");
					roll =  Integer.parseInt(br.readLine());
					st.executeUpdate("update student set  roll='"+roll+"' where id="+id);
					System.out.println("Data updated successfully!");
					break;
					
					
				case 3:
					 
					System.out.println("enter address");
				    address= br.readLine();
				
					st.executeUpdate("update student set  address='"+address+"' where id="+id);
					System.out.println("Data updated successfully!");
					break;
				
				case 4:
					System.out.println("enter name");
					 name= br.readLine();
					 
					  System.out.println("enter roll");
						int roll1 =  Integer.parseInt(br.readLine());
						System.out.println("enter address");
						String  address1= br.readLine();
					st.executeUpdate("update student set  name='"+name+"',roll='"+roll1+"',address='"+address1+"' where id="+id);
					System.out.println("Data updated successfully!");
					break;
					
				case 5:
					System.out.println("exit");
					break;
				default:
					System.out.println("Invalid choice");
						break;	
				}
				
				break;
				
					
			case 4:
				
				  System.out.println("Delete Data:");
				  System.out.println("enter your id which you want to delete ");
					id = Integer.parseInt(br.readLine());
				  st.executeUpdate("delete from student where id="+id);
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
		
		while(ans=='y');
		System.out.println("Thank You!");
		
		con.close();	
		}
		
		
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
}
