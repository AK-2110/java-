package demo;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> st = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of 5 students:");

        while (st.size() < 5) {
            System.out.print("Enter student ID (integer): ");
            int n = sc.nextInt();
            sc.nextLine();
            if (st.containsKey(n)) {
                System.out.println("Student ID already exists. Please enter a different ID.");
                continue;
            }

            System.out.print("Enter student name: ");
            String k = sc.nextLine();

            st.put(n, k);
        }

        System.out.println("\nStudent names are:");
        for (String studentName : st.values()) {
            System.out.println(studentName);
        }

        sc.close();
    }
}
