package cdplayer;

public class PlayerDriver {
	boolean wasError = false;

	public static void main(String[] args) {
		new PlayerDriver();
	}

	public PlayerDriver() {
		Player theCDChanger = new Player();

		CD kermie = new CD("Green", "Kermit");
		kermie.add(new Song("It ain't easy being green",	183));
		kermie.add(new Song("Froggy went a courtin",		175));
		kermie.add(new Song("Web Foot Friend",				103));
		theCDChanger.add(kermie);

		CD ella = new CD("Priceless Jazz", "Ella Fitzgerald");
		ella.add(new Song("A Tisket, A Tasket",		165));
		ella.add(new Song("Goody, Goody",			162));
		ella.add(new Song("Someone watch over me",	156));
		ella.add(new Song("Old Devil Moon",			183));
		theCDChanger.add(ella);

		if (theCDChanger.get(0) != kermie)
			error("First cd in changer is incorrect");

		if (theCDChanger.get(1) != ella)
			error("First cd in changer is incorrect");

		// Play all the songs

		for (int cdIndex = 0; cdIndex < kermie.size(); cdIndex++) {
			if (theCDChanger.nextSong() != kermie.get(cdIndex))
				error("Wrong song played in order");
		}

		for (int cdIndex = 0; cdIndex < ella.size(); cdIndex++) {
			if (theCDChanger.nextSong() != ella.get(cdIndex))
				error("Wrong song played in order");
		}

		// check for proper wraparound

		if (theCDChanger.nextSong() != kermie.get(0))
			error("Wraparound unsuccessful");

		// Play a few random songs

		System.out.println("**Songs played randomly");

		for (int cdIndex = 0; cdIndex < 10; cdIndex++) {
			System.out.println(theCDChanger.nextRandomSong());
		}

		// Shuffle songs on the 2nd cd and play all the songs in order

		System.out.println("**Second CD shuffled, played in order");

		ella.shuffleSongs();

		// Play all the songs

		for (int cdIndex = 0; cdIndex < kermie.size(); cdIndex++) {
			System.out.println(theCDChanger.nextSong());
		}

		for (int cdIndex = 0; cdIndex < ella.size(); cdIndex++) {
			System.out.println(theCDChanger.nextSong());
		}

		if (wasError == false) {
			System.out.println("*** No errors found");
		}
	}

	private void error(String message) {
		wasError = true;
		System.out.println("*** Error: " + message);
	}
}