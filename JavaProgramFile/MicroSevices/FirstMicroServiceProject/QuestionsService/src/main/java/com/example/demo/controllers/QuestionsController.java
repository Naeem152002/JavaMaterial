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

import com.example.demo.dto.QuestionDto;
import com.example.demo.services.QuestionService;

@RestController
@RequestMapping("/api/question")
public class QuestionsController {

	@Autowired
	private QuestionService questionService;

	@PostMapping("/")
	public ResponseEntity<QuestionDto> createQuestion(@RequestBody QuestionDto questionDto) {
     return  ResponseEntity.ok(questionService.createQuestion(questionDto));
	}
	@PutMapping("/{questionId}")
	public ResponseEntity<QuestionDto> updateQuestion(@RequestBody QuestionDto questionDto,@PathVariable int questionId) {
		return  ResponseEntity.ok(questionService.updateQuestion(questionDto, questionId));
	}
	@DeleteMapping("/{questionId}")
	public ResponseEntity<?> deleteQuestion(@PathVariable int questionId) {
		questionService.deleteQuestion(questionId);
		return  ResponseEntity.ok("Question Deleted Successfully");
	}

	@GetMapping("/{questionId}")
	public ResponseEntity<QuestionDto> getSingleQuestion(@PathVariable int questionId) {
		return  ResponseEntity.ok(questionService.getSingleQuestion(questionId));
	}
	@GetMapping("/")
	public  ResponseEntity<List<QuestionDto>> getAllQuestions() {
		return ResponseEntity.ok(questionService.getAllQuestions());
	}
	@GetMapping("/quiz/{quizId}")
	public ResponseEntity<List<QuestionDto>> getQuestionsOfQuiz(@PathVariable int quizId) {
		return ResponseEntity.ok(questionService.getQuestionsOfQuiz(quizId));
	}
}