package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dfs2 {
	private Map<String, List<String>> people = new HashMap<String,List<String>>();
	private Set<String> visited = new HashSet<String>();
	public void findSocialCircle(String person,String connectedPeople) {
		people.computeIfAbsent(person,k -> new ArrayList<>()).add(connectedPeople);
		people.computeIfAbsent(connectedPeople, k -> new ArrayList<>()).add(person);
	}
	public void findSocialCircleiterative(String currentperson) {
		if(visited.contains(currentperson)) return;
		visited.add(currentperson);
		System.out.println("socialcircle:" + currentperson);
		for(String neighbor : people.getOrDefault(currentperson, new ArrayList<String>())) {
			 findSocialCircleiterative(neighbor);
		}
	}
	public static void main(String[] args) {
		Dfs2 people= new Dfs2();
		
		people.findSocialCircle("person 1", "person 3");
		people.findSocialCircle("person 2", "person 1");
		people.findSocialCircle("person 3", "person 4");
		System.out.println("DFs traversal starting from socialcircle:");
		people. findSocialCircleiterative("person 1");
	}
}