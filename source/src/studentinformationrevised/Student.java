package studentinformationrevised;

public class Student {
	private	String	firstName;
	private	String	lastName;
	private	int		age;
	
	public Student() {
		firstName	= "";
		lastName	= "";
		age			= 0;
	}
	
	public Student(String inFirstName, String inLastName, int inAge) {
		firstName	= inFirstName;
		lastName	= inLastName;
		age			= inAge;
	}
	
	public void setFirstName(String inFirstName) {
		firstName = inFirstName;
	}
	
	public void setLastName(String inLastName) {
		lastName = inLastName;
	}
	
	public void setAge(int inAge) {
		age = inAge;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return
			"Firstname: "	+ firstName +
			" Lastname: "	+ lastName +
			" age:"			+ age;
	}
}
