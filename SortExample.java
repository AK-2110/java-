package demo;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Manaswin");
		names.add("Akshai");
		names.add("Manoj");
		names.add("Ganesh");
		names.add("Hussain");
		Collections.sort(names);
		System.out.println(names);
	}

}
