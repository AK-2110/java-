package demo;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class ExampleLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of students:");
		int n=sc.nextInt();
		for(int i = 0;i <= n;i++)
		{
			System.out.println("enter the name"+i+":");
			String s=sc.nextLine();
			ll.add(s);
		}
		for(String arr:ll)
		{
			System.out.println(arr);
		}
		Collections.sort(ll);
		for(int i=0;i<ll.size();i++)
		{
		System.out.println(ll.get(i));
		}
		Collections.reverse(ll);
		for(int i=0;i<ll.size();i++)
		{
		System.out.println(ll.get(i));
		}
		System.out.println(ll.remove(0));
		System.out.println(ll.contains("janu"));
		System.out.println(ll.contains(0));
		sc.close();
	}

}
