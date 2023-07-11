package Main;

public class ConstructorOverloading {
		public ConstructorOverloading() {
			System.out.println("default");
			System.out.println("introduction:");
		}
		ConstructorOverloading(String name){
			System.out.println("name:"+name);
		}
		ConstructorOverloading(String scname , int rollno ){
			System.out.println("school name:"+scname+ "rollno:"+rollno);
			
		}
	public static void main(String[] args) {
		ConstructorOverloading c1=new ConstructorOverloading();
		ConstructorOverloading c2=new ConstructorOverloading("chai");
		ConstructorOverloading c3=new ConstructorOverloading("kchs", 7);

	}

}
