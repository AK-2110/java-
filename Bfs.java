package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Bfs {

	public static void main(String[] args) {
		Map<String,List<String>> house = new HashMap<String,List<String>>();
		house.put("livingroom",Arrays.asList("kitchen","bedroom","studyroom"));
		house.put("kitchen",Arrays.asList("bedroom"));
		house.put("bedroom",Arrays.asList("balcony"));
		house.put("studyroom",new ArrayList<String>());
		house.put("bathroom",new ArrayList<String>());
		house.put("balcony",new ArrayList<String>());
		System.out.println("Explore the house using bfs starting from livingroom.");
		bfs(house,"livingroom");
	}
	private static void bfs(Map<String, List<String>> house, String startroom) {
		Queue<String> queue = new LinkedList<>();
		Set<String> visited = new HashSet<>();
		queue.add(startroom);
		visited.add(startroom);
		while(!queue.isEmpty()) {
			
		}
	}

}
