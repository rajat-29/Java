import java.sql.*;

class Mdata
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co = DriverManager.getConnection("jdbc:mysql://localhost/Uca","root", "");

		PreparedStatement ps = co.prepareStatement("select * from Student");
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rm = rs.getMetaData();
		for(int i=1;i<=rm.getColumnCount();i++)
		{
			System.out.println(rm.getColumnName(i) + " " + rm.getColumnTypeName(i));
		}
		co.close();
	}
}