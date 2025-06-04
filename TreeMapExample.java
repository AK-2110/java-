package demo;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args)
	{
		TreeMap<Integer, String> tm=new TreeMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the number");
			int k=sc.nextInt();
			if(tm.containsKey(n))
			{
				System.out.println("already we have that number:");
				continue;
			}
			System.out.println("enter the name :");
			String s=sc.nextLine();
			tm.put(k, s);
		}
		for(String name:tm.values())
		{
			System.out.println(name);
		}
	}

}
