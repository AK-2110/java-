package demo;
import java.util.HashMap;
import java.util.Scanner;

public class ExampleHashMap {
	public static void main(String[] args)
	{
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the name of 5 students:");

	        while (hm.size() < 5) {
	            System.out.print("Enter student ID (integer): ");
	            int n = sc.nextInt();
	            sc.nextLine();
	            if (hm.containsKey(n)) {
	                System.out.println("Student ID already exists. Please enter a different ID.");
	                continue;
	            }

	            System.out.print("Enter student name: ");
	            String k = sc.nextLine();

	            hm.put(n, k);
	        }

	        System.out.println("\nStudent names are:");
	        for (String studentName : hm.values()) {
	            System.out.println(studentName);
	        }
	        hm.put(305, "king");
	        System.out.println(hm);
	        hm.remove(305);
	        System.out.println(hm);
	        if(hm.containsKey(3))
	        {
	        	System.out.println("true");
	        }
	        else
	        {
	        	System.out.println("flase");
	        }
	        if(hm.containsValue("ravi"))
	        {
	        	System.out.println("true");
	        }
	        else
	        {
	        	System.out.println("flase");
	        }

	        sc.close();
}
}
