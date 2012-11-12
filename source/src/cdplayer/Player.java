package cdplayer;

import java.util.*;

public class Player extends CDPlayer<MusicCD> {
	Random				randCD;
	Random				randSong;
	Iterator<Song>		currentSongIter	= null;
	Iterator<MusicCD>	currentCDIter	= null;

	public Player() {
		super();

		randCD		= new Random();
		randSong	= new Random();
	}

	public void add(MusicCD theCD) {
		allCDs.add(theCD);
	}

	public void remove(int cdNumber) {
		allCDs.remove(cdNumber);
	}

	public Song nextRandomSong() {
		int	maxCDIndex	= randCD.nextInt(allCDs.size());
		currentCD		= allCDs.get(maxCDIndex);

		int maxSongIndex	= randSong.nextInt(currentCD.size());
		currentSong			= currentCD.get(maxSongIndex);

		return currentSong;
	}

	public Song nextSong() {
		if (currentCDIter == null) {
			playAtFirstCDFirstSong();
			return currentSong;
		}

		if (currentSongIter.hasNext() == true) // change song on current cd
			{
			currentSong = currentSongIter.next();
		} else // change CD too
			{
			if (currentCDIter.hasNext()) {
				currentCD		= currentCDIter.next();
				currentSongIter	= currentCD.iterator();
				currentSong		= currentSongIter.next();
			} else // no more cd's either, start at the beginning
				{
				playAtFirstCDFirstSong();
			}
		}
		return currentSong;
	}

	private void playAtFirstCDFirstSong() {
		currentCDIter	= allCDs.iterator();
		currentCD		= currentCDIter.next();
		currentSongIter	= currentCD.iterator();
		currentSong		= currentSongIter.next();
	}

	@Override
	public String toString() {
		return allCDs.toString();
	}

	public MusicCD get(int position) {
		return allCDs.get(position);
	}

	public MusicCD currentCD() {
		return currentCD;
	}

	public Song currentSong() {
		return currentSong;
	}

	public int size() {
		return allCDs.size();
	}

	public Iterator<MusicCD> iterator() {
		return allCDs.iterator();
	}
}