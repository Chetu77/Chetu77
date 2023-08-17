package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BatchEx {
	public static void insert(List<PersonEntity> personEntities) throws SQLException, ClassNotFoundException{
      Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql:// localhost:3306/db1";
		Connection con = DriverManager.getConnection(url, "root", "root");
		String qq="insert into person values(?,?)";
		PreparedStatement ps=con.prepareStatement(qq);
		for(PersonEntity pe:personEntities) {
			ps.setInt(1,pe.getId());
			ps.setString(2,pe.getName());
			ps.addBatch();
			
		}
		ps.executeBatch();
	}
	


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<PersonEntity> l=new ArrayList<>();
		l.add(new PersonEntity(1,"chai"));
		l.add(new PersonEntity(2,"ram"));
		insert(l);
		System.out.println("record inserted successfully");
	}
}


