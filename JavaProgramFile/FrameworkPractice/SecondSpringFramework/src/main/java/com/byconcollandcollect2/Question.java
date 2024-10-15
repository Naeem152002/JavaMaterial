package com.byconcollandcollect2;

public class Question {
	private int quId;
	private String quesName;
	public Question() {
		super();
	}
	@Override
	public String toString() {
		return "Question [quId=" + quId + ", quesName=" + quesName + "]";
	}
	public Question(int quId, String quesName) {
		super();
		this.quId = quId;
		this.quesName = quesName;
	}

}
