package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DfsExample {
	private Map<String, List<String>> homemap = new HashMap<String, List<String>>();
	private Set<String> vis = new HashSet<String>();
	public void assRoom(String room,String connectedRoom) {
		homemap.computeIfAbsent(room,k -> new ArrayList<>()).add(connectedRoom);
		homemap.computeIfAbsent(connectedRoom, k -> new ArrayList<>()).add(room);
	}
	public void dfs(String currentroom) {
		if(vis.contains(currentroom)) return;
		vis.add(currentroom);
		System.out.println("Visited:" + currentroom);
		for(String neighbor : homemap.getOrDefault(currentroom, new ArrayList<String>())) {
			dfs(neighbor);
		}
	}
	public static void main(String[] args) {
		DfsExample home = new DfsExample();
		
		home.assRoom("LIVING ROOM", "KITCHEN");
		home.assRoom("LIVING ROOM", "BEDROOM" );
		home.assRoom("BEDROOM", "BATHROOM");
		System.out.println("DFs traversal starting from living room:");
		home.dfs("LIVING ROOM");
	}
}
