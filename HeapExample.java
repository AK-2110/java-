package demo;

import java.util.*;
public class HeapExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> minheap = new PriorityQueue<>();
		minheap.add(20);
		minheap.add(5);
		minheap.add(15);
		minheap.add(10);
		System.out.println("MINHEAP OUTPUT");
		while(!minheap.isEmpty()) {
			System.out.println(minheap.poll());
		}
		PriorityQueue<Integer> maxheap = new PriorityQueue<>();
		maxheap.add(20);
		maxheap.add(5);
		maxheap.add(15);
		maxheap.add(10);
		System.out.println("MAXHEAP OUTPUT ");
		while(!maxheap.isEmpty()) {
			System.out.println(maxheap.poll());
		}
	}

}
