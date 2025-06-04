package demo;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println("enter the number:"+i+":");
			int k=sc.nextInt();
			ts.add(k);
		}
		for(int g:ts)
		{
			System.out.println(g);
		}
		System.out.println(ts.contains(10));
		System.out.println(ts.higher(11));
		System.out.println(ts.first());
		sc.close();
	}
	public static void main1(String[] args)
	{
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("sai");
		ts1.add("ravi");
		ts1.add("ram");
		ts1.add("janu");
		System.out.println(ts1);
	}

}
