package cdplayer;

import java.util.*;

public abstract class CDPlayer<E extends MusicCD> {
	// A list of all of the CDs currently in the machine

	protected List<E> allCDs = null;

	// The current CD being played

	protected E currentCD = null;

	// The current song being played

	protected Song currentSong = null;

	public CDPlayer() {
		allCDs = new ArrayList<E>();
		currentCD = null;
	}

	// Add a cd to the player. The player will hold many cd's

	abstract public void add(E theCD);

	// Remove a particular CD. The position is zero based.

	abstract public void remove(int position);

	// Get a CD at the position indicated, again, zero based
	abstract public E get(int position);

	// Determine the current CD in the player

	abstract public E currentCD();

	// Determine the current song being played

	abstract public Song currentSong();

	// Select a random song to play

	abstract public Song nextRandomSong();

	// Play the next song. Changes to the next CD if necessary.
	// Goes back to the first CD after last CD, last song.
	// Don't use a circular queue, just go back to the first CD, first song.

	abstract public Song nextSong();

	// Return an iterator for the player. Used to list all the CDs
	// that are in the machine

	abstract public Iterator<E> iterator();

	// Return a debugging string with a list of all the cds in the player

	abstract public String toString();

	// Return a count of the number of cds in the player
	abstract public int size();
}