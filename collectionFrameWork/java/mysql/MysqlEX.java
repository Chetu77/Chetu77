package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class MysqlEX  {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		java.sql.Statement stmt;
		String url = "jdbc:mysql:// localhost:3306/db2";
		Connection con = DriverManager.getConnection(url, "root", "root");
		System.out.println(con);
		System.out.println("Db connected sucessfully");
		stmt= con.createStatement();
		String query= "insert into emp values(5,'virat',50000)";
		stmt.execute(query);
		
		

	}
}



