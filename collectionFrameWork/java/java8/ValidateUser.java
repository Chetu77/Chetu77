package java8;

import java.util.Scanner;

@FunctionalInterface
interface Validate{
	boolean login(String uname,String password);
	
}

public class ValidateUser {
	boolean login(String uname,String password) {
		Validate v=(String u,String p)->{
			return(uname.equals("chetu")&& password.equals("123"))?true:false;
		};
		return v.login(uname, password);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter usename and password");
		String uname=sc.next();
		String password=sc.next();
		ValidateUser vc=new ValidateUser();
		System.out.println(vc.login(uname, password));
		

	}

}
