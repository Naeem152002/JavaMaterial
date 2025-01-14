package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Quiz;
import com.service.QuizService;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	@PostMapping("/")
	public Quiz createQuiz(@RequestBody Quiz quiz) {
		return quizService.createQuiz(quiz);
	}
	@GetMapping("/")
	public List<Quiz> getAllQuizs() {
		return quizService.getAllQuizs();
	}
	@GetMapping("/{quizId}")
	public Quiz getSingleQuiz(@PathVariable int quizId) {
		return quizService.getSingleQuiz(quizId);
	}

}
