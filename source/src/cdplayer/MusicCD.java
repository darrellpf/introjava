package cdplayer;

import java.util.*;

abstract class MusicCD {
	protected String		title;
	protected String		artist;
	protected List<Song>	allSongs = null;

	public MusicCD(String title, String artist) {
		this.title	= title;
		this.artist	= artist;
		allSongs	= new ArrayList<Song>();
	}

	// CDs are considered the same if their title and artist match

	@Override
	public boolean equals(Object what) {
		MusicCD myCD = (MusicCD) what;
		return title.equals(myCD.title) && artist.equals(myCD.artist);
	}

	// Add a song to a CD

	abstract public void add(Song aSong);

	// Get a song from the CD using a zero-based position

	abstract public Song get(int position);

	// Shuffle the order of the songs on the CD

	abstract public void shuffleSongs();

	// Return an iterator to the songs. Used to list all the songs on the CD

	abstract public Iterator<Song> iterator();

	// Return the number of songs on this cd

	abstract public int size();

	// Find the index of this song in the CD

	abstract public int indexOf(Song aSong);
}