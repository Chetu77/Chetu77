package oops;

public class Student implements College, Hostel {

	public static void main(String[] args) {
		Student s=new Student();
		s.displayCollege();
		s.displayHostel();
		
	}

	@Override
	public void displayHostel() {
		String name="vijaya college";
		int id =123;
		System.out.println("college name: "+name+"id is "+id);
			
		
	}

	@Override
	public void displayCollege() {
		String name1="ATB";
		String add="banglore";
		System.out.println("hostel name: "+name1+"address is "+add);
		
		
	}




	
}
