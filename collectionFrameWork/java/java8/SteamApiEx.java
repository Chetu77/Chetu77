package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp {
	int eid;
	String name;
	double salary;
	String designation;

	public Emp(int eid, String name, double salary, String designation) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}

}

public class SteamApiEx {

	public static void main(String[] args) {
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(new Emp(11, "chai", 250000, "sowftware"));
		a1.add(new Emp(12, "chetu", 350000, "manager"));
		a1.add(new Emp(13, "viru", 400000, "hr"));
		a1.add(new Emp(14, "jai", 500000, "testing"));
		a1.add(new Emp(15, "sam", 320000, "Hr"));
		System.out.println(a1);
		long count = a1.stream().count();
		System.out.println("employe count is:" + count);
		Stream<Emp> namesStartsWith = a1.stream().filter(a -> a.getName().startsWith("c"));

		System.out.println("Name start with c:" + namesStartsWith.collect(Collectors.toList()));
		long start_with_c = a1.stream().filter(a -> a.getName().startsWith("c")).count();
		System.out.println("starting with c:" + start_with_c);
		Stream<Emp> NamesStartsWith = a1.stream().filter(a -> a.getName().startsWith("c"));

		System.out.println("name start with"+NamesStartsWith.collect(Collectors.toList()));
		Object max_sal = a1.stream().collect(Collectors.maxBy(Comparator.comparingDouble(a -> a.salary)));
		System.out.println("maximum salary is:" + max_sal);
		Object min_sal = a1.stream().collect(Collectors.minBy(Comparator.comparingDouble(a -> a.salary)));
		System.out.println("minmum salary is:" + min_sal);
		double avg_sal = a1.stream().collect(Collectors.averagingDouble(a -> a.salary));
		System.out.println("the avagrage salary is:" + avg_sal);
		Stream<Emp> sort=a1.stream().sorted();
		System.out.println("sort is:"+sort);
		
		Stream<Emp> isEmpty=a1.stream().filter(a->a.getName().isEmpty());
		System.out.println("is empty:"+isEmpty);
	}

}
