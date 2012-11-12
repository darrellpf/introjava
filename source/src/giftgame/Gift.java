package giftgame;

public class Gift {
	private String	name;
	private Gift	nextGift;

	public Gift(String description, Gift nextOne) {
		name = description;
		nextGift = nextOne;
	}

	public Gift getNextGift() {
		return (nextGift);
	}

	@Override
	public String toString() {
		return name;
	}
}