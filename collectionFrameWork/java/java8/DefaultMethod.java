package java8;

interface Inf{
	public void abstruct();
	
	default void display() {
		System.out.println("default method");
	}
	
	public static void display1() {
		System.out.println("static method");
	}
	
}
interface Inf2{
public void abstruct1();
	
	default void display3() {
		System.out.println("abc");
	}
	
	public static void display4() {
		System.out.println("xyz");
	}
	
}

public class DefaultMethod implements Inf,Inf2{
	

	

	public static void main(String[] args) {
		DefaultMethod dm=new DefaultMethod();
		dm.abstruct();
		dm.display();
		dm.abstruct1();
		dm.display3();
		Inf.display1();
		Inf2.display4();
		
		
		
	}

	@Override
	public void abstruct() {
		System.out.println("abstruct method");
	}

	@Override
	public void abstruct1() {
		System.out.println("abstruct method2");
		
	}

}
	
