import java.sql.*;
 
 class JdbcProgram
 {
 	public static void main(String[] args) throws Exception
 	{
 		Class.forName("com.mysql.cj.jdbc.Driver");

 		Connection co = DriverManager.getConnection("jdbc:mysql://localhost/Uca","root", "");
 		Statement st = co.createStatement();
 		ResultSet rs = st.executeQuery("select * from Student");

 		while(rs.next())
 		{
 			System.out.println(rs.getString("Id"));
 			System.out.println(rs.getString("Name"));
 			System.out.println(rs.getString("Age"));
 		}
 		co.close();
 		
 	}
 }