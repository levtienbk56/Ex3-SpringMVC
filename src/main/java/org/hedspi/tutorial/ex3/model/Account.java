package org.hedspi.tutorial.ex3.model;

public class Account {
	private int id;
	private String email;
	private String password;

	public Account() {

	}

	public Account(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public Account(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
