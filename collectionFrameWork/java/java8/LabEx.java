package java8;import javax.naming.ldap.StartTlsRequest;

interface Myinterface{
	int add(int a,int b);	
}
interface Evenodd{
	boolean even(int a);
}
 interface Revstring{
	 String rev(String str);
 }


public class LabEx {

	public static void main(String[] args) {
		Myinterface mf= (int a,int b)->a+b;
		System.out.println("sum is:"+mf.add(4, 5));
		
		Evenodd eo=(int a)->a%2==0;
		  System.out.println("even num is:"+eo.even(5));

		Revstring sr=(String str)->
		{
			String revs=" ";
			for(int i=str.length()-1;i>=0;i--) {
				char c=str.charAt(i);
				revs=revs+c;
				
			}
			return revs;
		};
			System.out.println("reverse string is:"+sr.rev("welcome"));
		}
		
		
	}


