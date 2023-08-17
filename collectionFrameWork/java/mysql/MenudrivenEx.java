package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MenudrivenEx {
	int id;
	String name;



	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql:// localhost:3306/db2";
		Connection con = DriverManager.getConnection(url, "root", "root");
		System.out.println(con);
		System.out.println("Db connected sucessfully");
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		int salary;
		while(true) {
			System.out.println("1. add data");
			System.out.println("2. display data");
			System.out.println("3.exit");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				    System.out.println("enter id");
					id=sc.nextInt();
					System.out.println("enter name");
					name=sc.next();
					System.out.println("enter salary");
					salary=sc.nextInt();
					String q="insert into emp(id,name,salary) values(?,?,?)";
					
					PreparedStatement ps=con.prepareStatement(q);
					ps.setInt(1, id);
					ps.setString(2, name);
					ps.setInt(3, salary);
					int i=ps.executeUpdate();
					System.out.println("record inserted:"+i);
				
				
				break;
			case 2:
				
				break;
			case 3:
				System.exit(0);
				break;
			default:
				 System.out.println("invalid choice");
				 break;
				
				
			}
			
		
		}
        
		

	}

}
