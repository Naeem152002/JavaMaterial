package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Quiz;
import com.repo.QuizRepo;
@Service
public class QuizServiceImpl implements QuizService{
	
	@Autowired
	private QuizRepo quizRepo;
	
	@Autowired
	private QuestionClient questionClient;

	@Override
	public Quiz createQuiz(Quiz quiz) {
		return quizRepo.save(quiz);
	}

	@Override
	public List<Quiz> getAllQuizs() {
		List<Quiz>quizs=quizRepo.findAll();
		List<Quiz>newQuizList=quizs.stream().map(quiz->{
			quiz.setQuestions(questionClient.findByQuizId(quiz.getQuizId()));
			return quiz;
		}).collect(Collectors.toList());
		return newQuizList;
	}

	@Override
	public Quiz getSingleQuiz(int quizId) {
	 Quiz quiz=quizRepo.findById(quizId).orElseThrow(()->new RuntimeException("User not found"));
	 quiz.setQuestions(questionClient.findByQuizId(quiz.getQuizId()));
		return quiz;
	}

}
