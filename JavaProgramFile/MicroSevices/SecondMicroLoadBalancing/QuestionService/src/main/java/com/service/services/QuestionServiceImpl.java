package com.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.entities.Question;
import com.service.repo.QuestionRepo;
@Service
public class QuestionServiceImpl implements QuestionService {
	
	
	@Autowired
	private QuestionRepo questionRepo;

	@Override
	public Question createQuestion(Question question) {
		return questionRepo.save(question);
	}

	@Override
	public List<Question> getAllQuestion() {
		return questionRepo.findAll();
	}

	@Override
	public Question getSingleQuestion(int questionId) {
		Question question=questionRepo.findById(questionId).orElseThrow(()->new RuntimeException("Question not found with this Id"));
		return question;
	}

	@Override
	public List<Question> findByQuizId(int quizId) {
		return questionRepo.findByQuizId(quizId);
	}

}
