package derby;

import java.util.*;

public class EntrantBucket implements Comparable<EntrantBucket> {
private String		firstName;
private String		lastName;
private List<Fish>	allFish;

public EntrantBucket(String inFirstName, String inLastName) {
	firstName	= inFirstName;
	lastName	= inLastName;
	allFish		= new ArrayList<Fish>();
	}
	
@Override
public String toString() {
	return
		"FirstName: "	+ firstName +
		" LastName: "	+ lastName	+
		" Fish: "		+ allFish;
	}
	
public String getFirstName() {
	return firstName;
	}
	
public String getLastName() {
	return lastName;
	}
	
public void addFish(Fish aFish) {
	allFish.add(aFish);
	}
	
public Fish getBiggestFish() {
	return Collections.max(allFish);
	}
	
@Override
public boolean equals(Object what) {
	if(what == null) return false;
	
	EntrantBucket someone = (EntrantBucket) what;
	
	if( ! firstName.equals(someone.firstName)) {
		return false;
	}
	
	if( ! lastName.equals(someone.lastName)) {
		return true;
	}
	
	return true;
	}
	
public int compareTo(EntrantBucket someone) {
	Fish myBiggestFish		= getBiggestFish();
	Fish yourBiggestFish	= someone.getBiggestFish();
	
	return myBiggestFish.compareTo(yourBiggestFish);
	}	
}

