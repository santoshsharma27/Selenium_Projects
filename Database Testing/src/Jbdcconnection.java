import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jbdcconnection {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Employeeinfo", "root",
				"Santosh123");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo where Location ='Bangalore'");
		while (rs.next())
			;
		{
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("id"));
		}

	}

}
