package bicycle;

public class Bicycle {

	private int		maxGear;
	private int		currentGear;
	private int		currentSpeed;
	private String		ownerName;

	public Bicycle(int gearCount) {
		maxGear = gearCount;

		currentGear		= 1;
		currentSpeed	= 0;
		ownerName		= "";
	}

	public void gearUp() {
		if (currentGear >= maxGear) {
			return;
		}
		
		currentGear++;
	}

	public void gearDown() {
		if (currentGear <= 1) {
			return;
		}
		
		currentGear--;
	}

	public void pedal() {
		currentSpeed += currentGear;
	}

	public void brake() {
		if (currentSpeed <= 0) {
			return;
		}
		currentSpeed--;
	}

	public void setOwnerName(String who) {
		ownerName = who;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public int getCurrentGear() {
		return currentGear;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public int getMaxGear() {
		return maxGear;
	}

	@Override
	public String toString() {
		return 
			"owner: " + ownerName + 
			" gear: " + currentGear +
			" speed: " + currentSpeed;
	}
}