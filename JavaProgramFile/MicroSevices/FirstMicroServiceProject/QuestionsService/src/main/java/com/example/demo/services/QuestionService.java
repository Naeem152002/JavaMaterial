package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.QuestionDto;

public interface QuestionService {
	
	
	QuestionDto createQuestion(QuestionDto questionDto);
	
	QuestionDto updateQuestion(QuestionDto questionDto,int questionId);
	
	void deleteQuestion(int questionId);
	
	QuestionDto getSingleQuestion(int questionId);
	
	List<QuestionDto>getAllQuestions();
	
	List<QuestionDto>getQuestionsOfQuiz(int quizId);
	

}
