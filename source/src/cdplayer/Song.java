package cdplayer;

public class Song {
	private String	title;
	private int		playTime;

	Song(String title, int playTime) {
		this.title		= title;
		this.playTime	= playTime;
	}

	public String getTitle() {
		return title;
	}

	public int getPlayTime() {
		return playTime;
	}

	@Override
	public String toString() {
		return title + " " + playTime;
	}

	@Override
	public boolean equals(Object what) {
		if(what == null) return false;
		
		Song mySong = (Song) what;
		return title.equals(mySong.title);
	}
}