package com.dependencyconstructor.collection;

public class Question {
	
	private String question ;

	@Override
	public String toString() {
		return "Question [question=" + question + "]";
	}

	public Question(String question) {
		super();
		this.question = question;
	}
	

}
