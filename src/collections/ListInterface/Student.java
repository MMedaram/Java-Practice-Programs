package collections.ListInterface;

public class Student {

	String name;
	int age;
	int id;

	public String getName() {
		return name;
	}

	
	public int getAge() {
		return age;
	}

	
	public int getId() {
		return id;
	}




	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}


	
}
