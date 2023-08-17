package mysql;

public class PersonEntity {
     int id;
	String name;
	
	

	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", name=" + name + "]";
	}



	public PersonEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

}
