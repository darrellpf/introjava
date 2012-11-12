package hashchain;

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
		System.out.println("equals: " + this + " with " + who);
		
		if( ! lastName.equals(who.lastName)) {
			return false;
		}
		
		return firstName.equals(who.firstName);
	}
	
	public int compareTo(Student another) {
		System.out.println("equals: " + this + " with " + another);
		
		int comparison = firstName.compareTo(another.firstName);
		
		if(comparison != 0) {
			return comparison;
		}
		
		return lastName.compareTo(another.lastName);
	}
	
	public int hashCode() {
		System.out.println("hashCode: " + this);

		return lastName.hashCode() * firstName.hashCode();
	}

}
