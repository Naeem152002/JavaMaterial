package com.service;

import java.util.List;

import com.entities.Quiz;

public interface QuizService {
	
	public Quiz createQuiz(Quiz quiz);
	
	public List<Quiz>getAllQuizs();
	
	public Quiz getSingleQuiz(int quizId);

}
