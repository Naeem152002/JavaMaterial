package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.QuizDto;
import com.example.demo.entities.Quiz;
import com.example.demo.services.QuizService;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	@PostMapping("/")
	public  ResponseEntity<QuizDto> createQuiz(@RequestBody QuizDto quizDto) {
		return ResponseEntity.ok(quizService.createQuiz(quizDto));
	}
	
	@PutMapping("/{quizId}")
	public  ResponseEntity<QuizDto> updateQuiz(@RequestBody QuizDto quizDto,@PathVariable int quizId) {
		return ResponseEntity.ok(quizService.updateQuiz(quizDto, quizId));
	}
	@DeleteMapping("/{quizId}")
	public  ResponseEntity<?> deleteQuiz(@PathVariable int quizId) {
		quizService.deleteQuiz(quizId);
		return ResponseEntity.ok("Quiz deleted Successfully");
	}
	@GetMapping("/{quizId}")
	public  ResponseEntity<QuizDto> getSingleQuiz(@PathVariable int quizId) {
		return ResponseEntity.ok(quizService.getSingleQuiz(quizId));
	}
	
	
	@GetMapping("/")
	public  ResponseEntity<List<QuizDto>> getAllQuizs() {
		return ResponseEntity.ok(quizService.getAllQuizs());
	}
	
	
	

}
