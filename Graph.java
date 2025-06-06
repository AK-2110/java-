package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Graph {
	static class graph{
		private Map<Integer,List<Integer>> adj = new HashMap<Integer, List<Integer>>();
		void addedge(int u, int v) {
			adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
			adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
		}
		void printGraph() {
			for(int node : adj.keySet()) {
				System.out.println("Node" + node + "is connected to:");
				
			for(int neighbor : adj.get(node)) {
				System.out.println(neighbor + " ");
				}
			}
		}
	}
	public static void main(String[] args) {
		graph g = new graph();
		g.addedge(1, 2);
		g.addedge(1, 3);
		g.addedge(1, 4);
		g.addedge(2, 5);
		g.printGraph();
		
	}
}
