package cdplayer;

import java.util.*;

public class CD extends MusicCD {
	public CD(String title, String artist) {
		super(title, artist);
	}

	public void add(Song name) {
		allSongs.add(name);
	}

	public void shuffleSongs() {
		Collections.shuffle(allSongs);
	}

	public Iterator<Song> iterator() {
		return allSongs.iterator();
	}

	@Override
	public boolean equals(Object what) {
		if(what == null) return false;
		
		CD otherCD = (CD) what;
		return title.equals(otherCD.title);
	}

	@Override
	public String toString() {
		return title + " by " + artist;
	}

	public int size() {
		return allSongs.size();
	}

	public Song get(int position) {
		return allSongs.get(position);
	}

	public int indexOf(Song aSong) {
		return allSongs.indexOf(aSong);
	}
}