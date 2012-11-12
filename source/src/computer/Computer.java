package computer;

public class Computer {

	private int		memorySize;
	private int		diskSize;
	private boolean	hasDVD;

	public Computer() {
		memorySize	= 0;
		diskSize	= 0;
		hasDVD		= false;
	}

	public Computer(int inMemorySize, int inDiskSize, boolean inHasDVD) {
		memorySize	= inMemorySize;
		diskSize	= inDiskSize;
		hasDVD		= inHasDVD;
	}

	public int getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(int inMemorySize) {
		memorySize = inMemorySize;
	}

	public void setDiskSize(int disk) {
		diskSize = disk;
	}

	public void setHasDVD(boolean inHasDVD) {
		hasDVD = inHasDVD;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public boolean getHasDVD() {
		return hasDVD;
	}

	@Override
	public String toString() {
		return 
		"Memory: "	+ memorySize +
		" Disk: "	+ diskSize +
		" DVD: "	+ hasDVD;
	}

}