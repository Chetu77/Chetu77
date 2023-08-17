package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class CheckConnectionEx {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver"); // registering driver
		Statement stmt;
		String url = "jdbc:mysql://localhost:3306/db2";
		Connection con = DriverManager.getConnection(url, "root", "root");// establish connection
		System.out.println(con);
		System.out.println("Database dbemp connection suceesfully establish");
	}

}
