package computer;

public class ComputerDriver {

	public static void main(String[] args) {

		/* Make a new computer object, using the default constructor */

		Computer myComputer = new Computer();

		/* Print the values the easy way. Should all be zero-ish */

		System.out.println(myComputer);

		/* Fill in the values using setters */

		myComputer.setDiskSize		(13);
		myComputer.setMemorySize	(192);
		myComputer.setHasDVD		(true);

		/* use getters to print the values */

		System.out.println("Filled values for myComputer are");

		System.out.print("Disk : "		+ myComputer.getDiskSize	());
		System.out.print(" Memory : "	+ myComputer.getMemorySize	());
		System.out.print(" CD Rom : "	+ myComputer.getHasDVD		());
		System.out.println();

		/* Print the easy way, letting the class give us the values via toString */

		System.out.println(myComputer);

		/* Make another computer object, this time using the 3-arg constructor */

		Computer office = new Computer(128, 20, true);

		System.out.println(office);
	}
}