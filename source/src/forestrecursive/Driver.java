package forestrecursive;

public class Driver {
	
	static Clearing [] allClearings = {
			new Clearing(0, new int [] { 1, 2, 3} ),
			new Clearing(1, new int [] { 4, 5, 6} ),
			new Clearing(2, new int [] { 7} 	),
			new Clearing(3, new int [] { 8} 	),
			new Clearing(4, new int [] { } 		),
			new Clearing(5, new int [] { } 		),
			new Clearing(6, new int [] { } 		),
			new Clearing(7, new int [] { 9, 10} ),
			new Clearing(8, new int [] { } 		),
			new Clearing(9, new int [] { } 		),
			new Clearing(10, new int [] { } 	),			
	};
	
	boolean foundBeer = false;	

	public static void main(String[] args)  {
		new Driver();
	}
	
	Driver() {
		
		allClearings[10].addBeer();
		
		findBeer(allClearings[0]);
		
		if(foundBeer == true) {
			System.out.println("Found beer");
		}
		else {
			System.out.println("Didn't find beer");
			
		}
	}
	
	private void findBeer(Clearing aClearing) {
//		System.out.println("Checking clearing " + aClearing.getIdentifier());
		if(aClearing.doesHaveBeer() == true) {
			foundBeer = true;
			System.out.println("Path " + aClearing.getIdentifier());
			return;
		}
		
		for(Integer item : aClearing) {
			findBeer(allClearings[item]);
			if(foundBeer == true) {
				System.out.println("Pathx " + aClearing.getIdentifier());
				return;
			}
		}
		
	}

}
