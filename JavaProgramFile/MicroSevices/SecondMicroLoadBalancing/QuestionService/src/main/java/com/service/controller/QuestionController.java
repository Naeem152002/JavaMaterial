package com.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.entities.Question;
import com.service.services.QuestionService;

@RestController
@RequestMapping("/api/question")
public class QuestionController {
	
	
	@Autowired
	private QuestionService questionService;

	@PostMapping("/")
	public Question createQuestion(@RequestBody Question question) {
		return questionService.createQuestion(question);
	}
	@GetMapping("/")
	public List<Question> getAllQuestions() {
		return questionService.getAllQuestion();
	}
	@GetMapping("/{questionId}")
	public Question getSingleQuestion(@PathVariable int questionId) {
		return questionService.getSingleQuestion(questionId);
	}
	@GetMapping("/quiz/{quizId}")
	public List<Question> findByQuizId(@PathVariable int quizId) {
		return questionService.findByQuizId(quizId);
	}
}
