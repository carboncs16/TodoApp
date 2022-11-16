package main.todoapp;

import java.util.Scanner;

public class Main {
	 

	public static void main(String[] args) {
		TodoService todoService = new TodoService();
		
		todoService.createTodo("Punya", "My First Todo");
		todoService.createTodo("Punya", "My Second Todo");
		
		while (true) {
			System.out.println("1. List all todo:");
			System.out.println("2. Enter a todo:");
			System.out.println("3. Delete a todo:");
			System.out.println("4. Mark a todo as complete:");
			System.out.println("5. Print a users' Todos");
			System.out.println("6. Exit");
			System.out.println("Enter your choice:");
	        Scanner in = new Scanner(System.in);
	        
	        switch (in.nextLine()) {
				case "1":
					todoService.viewAllTodo();
					System.out.println("");
					break;
					
				case "2":
					System.out.println("Enter the todo:");
					String text = in.nextLine();
					System.out.println("Enter the user:");
					String user = in.nextLine();
					
					Todo todo = todoService.createTodo(user, text);
					if (todo != null) {
						System.out.println("Below todo created successfully");
						System.out.println(todo);
					}
					break;
				
				case "3":
					System.out.println("Enter the index to be deleted:");
					int index = in.nextInt();
					Todo todoRemoved = todoService.deleteTodo(index - 1);
					if (todoRemoved != null) {
						System.out.println("Below todo got removed successfully");
						System.out.println(todoRemoved);
					}
					break;
					
				case "4":
					System.out.println("Enter the index to mark as complete:");
					int idx = in.nextInt();
					Todo todoCompleted = todoService.markAsComplete(idx - 1);
					if (todoCompleted != null) {
						System.out.println(todoCompleted);
					}
					break;
					
				case "5":
					System.out.println("Enter the user name:");
					String userName = in.nextLine();
					todoService.viewSpecificUserTodo(userName);
					System.out.println("");
					break;
					
				case "6":
					System.exit(0);
					in.close();
					break;
	
				default:
					System.out.println("Please enter valid option\n");
					break;
			}
	        
		}
	}

}
