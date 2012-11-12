package hashmap;


public class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private int age;
	
	public Student(String inLastName, String inFirstName, int inAge) {
		firstName = inFirstName;
		lastName = inLastName;
		age = inAge;
	}
	
	public void setAge(int inAge) {
		age = inAge;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return
			"firstName: " + firstName +
			" lastName: " + lastName +
			" age: " + age;
	}
	
	@Override
	public boolean equals(Object what) {
		Student who = (Student) what;
		
		if( ! lastName.equals(who.lastName)) {
			return false;
		}
		
		return firstName.equals(who.firstName);
	}
	
	public int compareTo(Student another) {
		int comparison = lastName.compareTo(another.lastName);
		
		if(comparison != 0) {
			return comparison;
		}
		
		return firstName.compareTo(another.firstName);
	}
	
	public int hashCode() {
		return lastName.hashCode() * firstName.hashCode();
	}

}
