package java8;
class Student implements Cloneable{  

    int rollno;  

    String name;  

    //class constructor

    Student(int rollno,String name){  

        this.rollno=rollno;  

        this.name=name;  

    }  

   

    //clone method 

    public Object clone()throws CloneNotSupportedException{     

        return super.clone();  

    }  

}

public class CloneableEX {
	public static void main(String[] args)  {

		try{  

	        Student s1=new Student(1,"Mayaa");  

	        //clone the s1 object

	        Student s2=(Student)s1.clone();  

	   

	        System.out.println("Original Student object: " + s1.rollno+" "+s1.name);  

	        System.out.println("Cloned Student object: " + s2.rollno+" "+s2.name);  

	   

	    }catch(CloneNotSupportedException c){} 

 

	}

 

}


