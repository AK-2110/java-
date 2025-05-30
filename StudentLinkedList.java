package demo;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentLinkedList {

	public static void main(String[] args) {
		LinkedList<String> std=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name of 5 students:");
		for(int i=1;i<=5;i++)
		{
			System.out.println("enter the name of students:"+i+":");
			String name=sc.nextLine();
			std.add(name);
		}
		System.out.println("student names are:");
		for(String student:std)
		{
			System.out.println(student);
		}
sc.close();
	}

}
