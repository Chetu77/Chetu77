package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class CallablestatEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql:// localhost:3306/db3";
		Connection con = DriverManager.getConnection(url, "root", "root");
		CallableStatement statement =  (CallableStatement) con.prepareCall("{call student_procedure()}");

		statement.execute();
		statement.close();
	

		System.out.println("Stored procedure called successfully!");
	}

}
