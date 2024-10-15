package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.QuizDto;

public interface QuizService {
	
	QuizDto createQuiz(QuizDto quizDto);
	QuizDto updateQuiz(QuizDto quizDto,int quizId);
	void deleteQuiz(int quizId);
	
	QuizDto getSingleQuiz(int quizId);
	
	List<QuizDto>getAllQuizs();
	
	

}
