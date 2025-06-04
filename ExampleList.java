package demo;
import java.util.ArrayList;
import java.util.Scanner;

public class ExampleList {

	public static void main(String[] args) {
		ArrayList<String> li=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String s=sc.toString();
		li.add("ravi");
		li.add("dai");
		li.add("ram");
		li.add("Sai");
		for(String arr:li)
		{
			System.out.println(arr);
		}
		

	}

}
