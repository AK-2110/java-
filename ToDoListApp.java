package ak;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> tasks = new ArrayList<>();
		
		while (true) {
			System.out.println("Simple To-Do-List-App");
			System.out.println("1.Add a Task");
			System.out.println("2 view a Task");
			System.out.println("3 Delete a Task");
			System.out.println("4 Exit a Task");
			System.out.println("Choose an option (1-4)");
			
			int choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				System.out.println("Enter your Task");
				String task = sc.nextLine();
				tasks.add(task);
				System.out.println("Task Added Succesfully");
			}else if(choice ==2) {
				if(tasks.isEmpty()) {
					System.out.println("No Task FOUND");
					}else {
						for(int i =0;i<tasks.size();i++) {
							System.out.println("yes found");
						}	
				}
			}else if(choice == 3) {
				if(tasks.isEmpty()) {
					System.out.println("Nothing to delete");
				}else {
					System.out.println("Enter Task Number to Delete");
					int tasknum = sc.nextInt();
					if(tasknum>=1 && tasknum <= tasks.size()) {
						tasks.remove( - 1);
						System.out.println("Task Deleted");
					}else {
						System.out.println("Invalid Number");
					}
				}
			}else if(choice == 4) {
				System.out.println("Goodbye !!");
				break;
			}else {
				System.out.println("please choose a Valid Option");
			}
		}
		sc.close();
	}

	
}
