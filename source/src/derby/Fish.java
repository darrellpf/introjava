package derby;

public class Fish  implements Comparable<Fish>
{
private String	type;
private int		weight;

public Fish(String inType, int inWeight)
	{
	type	= inType;
	weight	= inWeight;
	}
	
public int compareTo(Fish yourFish)
	{
	return weight - yourFish.weight;
	}
	
@Override
public String toString()
	{
	return
		"Type: "	+ type		+
		" Weight "	+ weight;
	}
}
