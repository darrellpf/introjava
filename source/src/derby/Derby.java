package derby;

import java.util.*;

public class Derby implements Iterable<EntrantBucket>{
private String				name;
private List<EntrantBucket>	allEntrants;

public Derby(String inName) {
	name		= inName;
	allEntrants	= new ArrayList<EntrantBucket>();
	}
	
public void addEntrant(EntrantBucket who) {
	allEntrants.add(who);
	}
	
public void addFish(String firstName, String lastName, Fish aFish) {
	EntrantBucket fakeEntrant = new EntrantBucket(firstName, lastName);
	
	int realPosition = allEntrants.indexOf(fakeEntrant);
	if(realPosition == -1) {
		return;
	}
	
	EntrantBucket actualEntrant = allEntrants.get(realPosition);
	actualEntrant.addFish(aFish);
}
	
public EntrantBucket findWinner() {
	return Collections.max(allEntrants);
	}
	
public Iterator<EntrantBucket> iterator() {
	return allEntrants.iterator();
	}
}