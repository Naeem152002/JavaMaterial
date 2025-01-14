package com.example.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.QuizDto;
import com.example.demo.entities.Quiz;
import com.example.demo.repository.QuizRepo;


@Service
public class QuizServiceImpl implements QuizService{

	@Autowired
	private QuizRepo quizRepo;
	
	@Autowired
	private QuestionClient questionClient;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public QuizDto createQuiz(QuizDto quizDto) {
		Quiz quiz=modelMapper.map(quizDto, Quiz.class);
		Quiz save=quizRepo.save(quiz);
		save.setQuestions(questionClient.getQuestionsOfQuiz(save.getId()));
		return modelMapper.map(save, QuizDto.class);
	}
	
	@Override
	public QuizDto updateQuiz(QuizDto quizDto, int quizId) {
	Quiz quiz=quizRepo.findById(quizId).orElseThrow(()->new RuntimeException("Quiz not found with Id="+quizId));
	quiz.setTitle(quizDto.getTitle());
	quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
	Quiz save=quizRepo.save(quiz);
	return modelMapper.map(save, QuizDto.class);
	}

	@Override
	public void deleteQuiz(int quizId) {
		Quiz quiz=quizRepo.findById(quizId).orElseThrow(()->new RuntimeException("Quiz not found with Id="+quizId));
		quizRepo.delete(quiz);
		
	}

	@Override
	public QuizDto getSingleQuiz(int quizId) {
		Quiz quiz=quizRepo.findById(quizId).orElseThrow(()->new RuntimeException("Quiz not found with Id="+quizId));
		quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
		return modelMapper.map(quiz, QuizDto.class);
	    }
	@Override
	public List<QuizDto> getAllQuizs() {
		List<Quiz>quizs=quizRepo.findAll();
		List<Quiz>newQuizList=quizs.stream().map(quiz->{
			quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		 
		return  newQuizList.stream().map(quiz->modelMapper.map(quiz, QuizDto.class)).collect(Collectors.toList());
	}

	
}
