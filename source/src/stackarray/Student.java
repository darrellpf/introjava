package stackarray;

public class Student {
	private String name;
	private int age;
	
	public Student(String inName, int inAge) {
		name = inName;
		age = inAge;
	}
	
	public void setAge(int inAge) {
		age = inAge;
	}
	
	@Override
	public String toString() {
		return
			"name: " + name +
			" age: " + age;
	}

}
