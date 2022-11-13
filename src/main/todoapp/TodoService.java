package main.todoapp;

import java.util.ArrayList;
import java.util.UUID;

public class TodoService {

	private ArrayList<Todo> todoList = new ArrayList<>();
	
	Todo createTodo(String user, String todoText) {
		Todo todo = new Todo();
		
        todo.setId(UUID.randomUUID().toString());
		todo.setText(todoText);
		todo.setUser(user);
		todo.setStatus("pending");
		
		this.todoList.add(todo);
		
		return todo;
	}
	
	Todo markAsComplete(Integer index) {
		Todo todoToComplete = this.todoList.get(index);
		todoToComplete.setStatus("complete");
		Todo todoCompleted = this.todoList.set(index, todoToComplete);
		return todoCompleted;
	}
	
	Todo deleteTodo(int index) {
		return this.todoList.remove(index);
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
