package jdbcexample;

import java.sql.*;

public class simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//load driver class for my sql database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/regis","root","root");//connection for my sql jdbc
		Statement st=con.createStatement();//provide all the queries with db
		ResultSet rs=st.executeQuery("select*from student");//return object of ResultSet
		while(rs.next()) //to iterate multiple values
		{
			System.out.println(rs.getInt("id")+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(2));
		}
		con.close();
		}

		catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
