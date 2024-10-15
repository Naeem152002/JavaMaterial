package com.setter;

public class Question {
	private int id;
	private String quName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", quName=" + quName + "]";
	}
	public String getQuName() {
		return quName;
	}
	public void setQuName(String quName) {
		this.quName = quName;
	}

}
