import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Check {

	public static void main(String[] args) 
	{
//		Collection<String> c = new ArrayList<>();//Duplicates Allowed output in same order
//		Collection<String> c = new HashSet<>();//Alphabetical Duplicates not allowed
//		Collection<String> c = new LinkedHashSet<>();// elements stored in order of adding
		Collection<String> c = new TreeSet<>();//NULL value not considered elements stored in sorted order
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
//		c.add(null);
//		c.add(null);
//		c.add(null);
		System.out.println(c.toString());
	

	}

}
