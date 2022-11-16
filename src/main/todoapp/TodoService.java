package main.todoapp;

import java.util.ArrayList;
import java.util.UUID;

public class TodoService {

	private ArrayList<Todo> todoList = new ArrayList<>();
	
	Todo createTodo(String user, String todoText) {
		try {
			Todo todo = new Todo();
			todo.setId(UUID.randomUUID().toString());
			todo.setText(todoText);
			todo.setUser(user);
			todo.setStatus("pending");			
			this.todoList.add(todo);
			return todo;
		} catch (Exception e) {
			System.out.println("Error occured while creating");
			return null;
		}
		
	}
	
	Todo markAsComplete(Integer index) {
		try {
			Todo todoToComplete = this.todoList.get(index);
			todoToComplete.setStatus("complete");
			Todo todoCompleted = this.todoList.set(index, todoToComplete);
			return todoCompleted;
			
		} catch (Exception e) {
			System.out.println("Entered index of todo item is not correct.");
			return null;
		}
	}
	
	Todo deleteTodo(int index) {
		try {
			return this.todoList.remove(index);			
		} catch (Exception e) {
			System.out.println("Entered index of todo item is not correct.");
			return null;
		}
	}
	
	void viewAllTodo() {
		for (int i = 0; i < this.todoList.size(); i++) {
			Todo todo = this.todoList.get(i);
			System.out.println("" + (i + 1) + ". " + todo.text + "(" + todo.status + ")" + " - " + todo.user);
		}
	}
	
	void viewSpecificUserTodo(String userName) {
		for (int i = 0; i < this.todoList.size(); i++) {
			Todo todo = this.todoList.get(i);
			if (todo.user.equals(userName)) {
				System.out.println("" + (i + 1) + ". " + todo.text + "(" + todo.status + ")" + " - " + todo.user);
			}
		}
	}
}
