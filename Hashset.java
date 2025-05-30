package demo;

import java.util.HashSet;

public class Hashset {
	public static void main(String[] args)
	{
		HashSet<String> de=new HashSet<String>();
		de.add("sai");
		de.add("ravi");
		de.add("siva");
		de.add("ravi");
		de.remove("sai");
		System.out.println(de);
	}

}
