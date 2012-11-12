package forest;

public class ForestDriver {
	
	static Clearing [] allClearings = {
			new Clearing(0, new int [] { 1, 2, 3}	),
			new Clearing(1, new int [] { 4, 5} 		),
			new Clearing(2, new int [] { 6, 7, 8}	),
			new Clearing(3, new int [] { 8} 	),
			new Clearing(4, new int [] { } 		),
			new Clearing(5, new int [] { } 		),
			new Clearing(6, new int [] { 9 } 	),
			new Clearing(7, new int [] { }		),
			new Clearing(8, new int [] { 10 } 	),
			new Clearing(9, new int [] { } 		),
			new Clearing(10, new int [] { } 	),			
	};
	
	static StackInterface<Clearing> toDoList;


	public static void main(String[] args)  {
		
		boolean foundBeer = false;
		
		allClearings[9].addBeer();
	
		toDoList = new StackLinked<Clearing>();
		toDoList.push(allClearings[0]);
		
		Clearing currentClearing = null;
		
		while((toDoList.size() > 0) && ! foundBeer) {
			currentClearing = toDoList.pop();
			if(currentClearing.getWasVisited() == true) {
				printGoingBackTo(toDoList);
				continue;
			}
			
			System.out.println("Going forward to clearing: " + currentClearing.getIdentifier());

			currentClearing.setWasVisited();
			toDoList.push(currentClearing);
			
			if(currentClearing.doesHaveBeer() == true) {
				foundBeer = true;
				break;
			}
			
			pushAllPaths(currentClearing, toDoList);
		}
		
		if(foundBeer == true) {
			System.out.println("found beer at: " + currentClearing.getIdentifier());
			System.out.println("Path was ");
			printAllMarked(toDoList);
		}
		else {
			System.out.println("didn't find beer");		
		}
		
	}
	
	public static void printGoingBackTo(StackInterface<Clearing> allClearings) {
		StackInterface<Clearing> remembered = new StackLinked<Clearing>();
		while(allClearings.size() > 0) {
			Clearing thisClearing = allClearings.pop();
			remembered.push(thisClearing);
			if(thisClearing.getWasVisited() == true) {
				System.out.println("Going back to " + thisClearing.getIdentifier());
				while(remembered.size() > 0) {
					allClearings.push(remembered.pop());
				}
				return;
			}
		}
	}
	
	public static void printAllMarked(StackInterface<Clearing> allClearings) {
		for(Clearing spot : allClearings) {
			if(spot.getWasVisited() == true) {
				System.out.print(" " + spot.getIdentifier());
			}
		}
		
		System.out.println();
	}
		
	public static void pushAllPaths(Clearing current, StackInterface<Clearing> toDo) {
		for(Integer item : current) {
			toDo.push(allClearings[item]);
		}
	}

}
