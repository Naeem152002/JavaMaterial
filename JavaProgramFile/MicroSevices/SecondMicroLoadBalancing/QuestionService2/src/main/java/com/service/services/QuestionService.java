package com.service.services;

import java.util.List;

import com.service.entities.Question;

public interface QuestionService {
	
	
	public Question createQuestion(Question question);
	
	public List<Question>getAllQuestion();
	
	public Question getSingleQuestion(int questionId);
	
	
	public List<Question>findByQuizId(int quizId);

}
