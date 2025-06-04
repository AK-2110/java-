package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ExampleHashset {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the name"+ i +":");
			String s=sc.next();
			hs.add(s);
		}
		for(String arr:hs)
		{
			System.out.println(arr);
		}
		ArrayList<String> ALS=new ArrayList<String>(hs);
		for(String set:ALS)
		{
			System.out.println(set);
		}
		Iterator<String> it=ALS.iterator();
		while(it.hasNext())
		{
			String name=it.next();
			System.out.println(name);
		}
		sc.close();
	}
	

}
