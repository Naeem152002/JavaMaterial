package com.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.entities.Question;

//@FeignClient(url="http://localhost:8082",value="Question-Client")
@FeignClient(name="Question-Service")
public interface QuestionClient {
	
	@GetMapping("/api/question/quiz/{quizId}")
	public List<Question> findByQuizId(@PathVariable int quizId) ;
		
	

}
