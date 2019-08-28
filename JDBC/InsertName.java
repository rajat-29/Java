import java.sql.*;
import java.util.Scanner;

class InsertName
{
	public static void main(String[] args) throws Exception
	{
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter Name");
		String name1 = obj.nextLine();

		Class.forName("com.mysql.cj.jdbc.Driver");

 		Connection co = DriverManager.getConnection("jdbc:mysql://localhost/Uca","root", "");
 		Statement st = co.createStatement();
 		ResultSet rs = st.executeQuery("select * from Student where name = '"+name1+"'");

 		//System.out.println(name1);

 		if(rs.next())
 		{
 			System.out.println("Yes Found");
 		}
 		else
 		{
 			System.out.println("Enter Age");
			String age1 = obj.nextLine();
			//st.executeUpdate("insert into Student(Name,age) values('" +name1+ "','" +age1+ "'')");
			PreparedStatement ps = co.prepareStatement("insert into Student(Name,age) values(?,?)");
			ps.setString(1,name1);
			ps.setString(2,age1);
			ps.executeUpdate();
			System.out.println("Data Updated Successfully");
 		}
	}	
}