package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql:// localhost:3306/db2";
		Connection con = DriverManager.getConnection(url, "root", "root");
		System.out.println(con);
		System.out.println("Db connected sucessfully");
        //String q="update  emp set  name=? where id=?";
		String q="delete from emp where id=?";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(1, 67);
		//ps.setString(1, "sam");
		//ps.setInt(3,77700);
		int i=ps.executeUpdate();
		System.out.println("record inserted:"+i);
		con.close();

	}

}
