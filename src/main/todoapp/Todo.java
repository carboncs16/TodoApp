package main.todoapp;

public class Todo {
	
	String id;
	String text;
	String user;
	String status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Todo { id : " + id + ", text : " + text + ", user : " + user + ", status : " + status + " }";
	}
	
	
	
}
