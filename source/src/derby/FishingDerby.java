package derby;

public class FishingDerby {

public static void main(String[] args)
	{
	Derby fishFestival = new Derby("Sooke Fishing Days");
	
	fishFestival.addEntrant(new EntrantBucket("Fred", "Flintstone"));
	fishFestival.addEntrant(new EntrantBucket("Barney", "Rubble"));
	fishFestival.addEntrant(new EntrantBucket("Ethel", "Mertz"));
	
	fishFestival.addFish("Fred", "Flintstone", new Fish("Carp", 11));
	fishFestival.addFish("Fred", "Flintstone", new Fish("Trout", 66));
	fishFestival.addFish("Fred", "Flintstone", new Fish("Carp", 33));
	
	fishFestival.addFish("Barney", "Rubble", new Fish("Carp", 55));
	fishFestival.addFish("Barney", "Rubble", new Fish("Carp", 22));
	fishFestival.addFish("Barney", "Rubble", new Fish("Carp", 88));
	
	fishFestival.addFish("Ethel", "Mertz", new Fish("Carp", 2));
	fishFestival.addFish("Ethel", "Mertz", new Fish("Carp", 77));
	fishFestival.addFish("Ethel", "Mertz", new Fish("Carp", 44));
	
	System.out.println("The winner is " + fishFestival.findWinner());
	
	System.out.println("The contestants and their biggest fish are");
	
	for(EntrantBucket who : fishFestival) {
		System.out.println(	who.getLastName()	+ " " +
		        			who.getFirstName()	+ " " +
		        			who.getBiggestFish());
		}
	}
}
