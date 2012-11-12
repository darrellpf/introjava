package bicycle;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BicycleTest {
	
	public static final int MAX_GEARS = 15;
	
	Bicycle myBike;

	@Before
	public void setUp() throws Exception {
		myBike = new Bicycle(MAX_GEARS);
	}
	
	@Test
	public void constructorOK() {
		String owner = myBike.getOwnerName();
		assertTrue(owner.equals(""));
		
		int maxGears = myBike.getMaxGear();
		assertTrue(maxGears == MAX_GEARS);

		int startGear = myBike.getCurrentGear();
		assertTrue(startGear == 1);

		int startSpeed = myBike.getCurrentSpeed();
		assertTrue(startSpeed == 0);
	}
	
	@Test
	public void goesThroughAllGearsUp() {
		int expectedGear = 1;
		for(int i = 0; i < MAX_GEARS; i++) {
			assertTrue(myBike.getCurrentGear() == expectedGear);
			expectedGear++;
			myBike.gearUp();
		}
		
		assertTrue(myBike.getCurrentGear() == MAX_GEARS);
	}
	
	@Test
	public void gearCantExceedMaximum() {
		for(int i = 0; i < MAX_GEARS * 10; i++) {
			myBike.gearUp();
		}
		
		int currentGear = myBike.getCurrentGear();
		assertTrue(currentGear == MAX_GEARS);
	}

}
