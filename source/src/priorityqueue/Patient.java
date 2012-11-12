package priorityqueue;

public class Patient implements Comparable<Patient>{
String	firstName;
String	lastName;
String	complaint;
int		priority;
    
Patient(String inFirstName, String inLastName, String inComplaint, int inPriority) {
    firstName	= inFirstName;
    lastName	= inLastName;
    complaint	= inComplaint;
    priority	= inPriority;
}

public int compareTo(Patient who) {
    return priority - who.priority;
}

@Override
public String toString() {
    return
    	" firstname: "	+ firstName	+
    	" lastname: "	+ lastName	+
    	" complaint: "	+ complaint	+
    	" priority: "	+ priority;
}

}
