package com.Ashoke1.Jdbc;
import java.sql.*;
import java.util.Scanner;
public class Insertexample3 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int ch, sid, sage;
		String sname;
		try {
			Connection con = Helper.makeCon();
			//execute queries with DB
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/regis","root","root");
			
			Statement st = con.createStatement();

			do {
				System.out.println("1. Insert \n 2. Update \n 3. Delete \n 4. Display \n 5. Exit");
				System.out.println("Enter your choice");
				ch = Integer.parseInt(s.nextLine());
				System.out.println("---------------");
				switch (ch) {
				case 1:
					System.out.println("how many record you want ?");
					int n = Integer.parseInt(s.nextLine());

					for (int i = 0; i < n; i++) {
						System.out.println("Enter id");
						int id = Integer.parseInt(s.nextLine());
						System.out.println("Enter your name");
						String name = s.nextLine();
						System.out.println("Enter your roll");
						int roll = Integer.parseInt(s.nextLine());
						System.out.println("Enter your address");
						String address = s.nextLine();
                         
					
						st.executeUpdate("insert into student values(" + id + ", '" + name + "', " + roll +",'"+address+ ")");
						System.out.println("record inserted");
					}
					break;

				case 2:
					System.out.println("Enter id");
					sid = Integer.parseInt(s.nextLine());
					System.out.println("Enter your age");
					sage = Integer.parseInt(s.nextLine());
					st.executeUpdate("update student set sage='" + sage + "'where sid =" + sid);
					System.out.println("record updated");
					break;

				case 3:
					System.out.println("Enter id");
					sid = Integer.parseInt(s.nextLine());
					st.executeUpdate("delete from student where sid=" + sid);
					System.out.println("record deleted");
					break;

				case 4:
					ResultSet rs = st.executeQuery("select * from student");
					while (rs.next()) {
						System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3)+ "\t"+ rs.getString(4));
					}

				case 5:
					System.exit(0);
				}
			} while (ch != 5);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
