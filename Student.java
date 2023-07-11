package Main;

public class Student {
	int rno;
	String name;
	public Student() { //default constructor
		rno=77;
		name="jai";
	}//parameter constructor
	public Student(int rno,String nm) {
		this.rno=67;
		name=nm="suri";
	}
	public Student(String nm) {
		rno=99;
	}
	public Student(Student s) {
		rno=s.rno;
		name=s.name;
	}
	void display() {
		System.out.println("Student rollno:" +rno);
		System.out.println("Student name:" +name);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.rno=1;
		s.name="chai";
		s.display();
		Student s1 = new Student();
		s1.rno=2;
		s1.name="chetu";
		s1.display();
		Student s4 = new Student();
		s4.display();
		Student s2 = new Student();
		s2.display();	
		Student s3= new Student(67, "suri");
		s3.display();
		Student s6 = new Student(s1);
		s6.display();
		Student s5 = new Student("rrrr");
		s5.display();
		
	
	}

}
