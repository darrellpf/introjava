package phone;

public class CellPhone extends Phone {

	protected int planMinutes;
	
	public CellPhone(String inFirstName, String inLastName, int inNumber, int inPlanMinutes) {
		super(inFirstName, inLastName, inNumber);
		planMinutes		= inPlanMinutes;
		System.out.println("CellPhone constructor");
	}
	
	public int getPlanMinutes() {
		return planMinutes;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				" Plan minutes "	+ planMinutes;
	}
}
