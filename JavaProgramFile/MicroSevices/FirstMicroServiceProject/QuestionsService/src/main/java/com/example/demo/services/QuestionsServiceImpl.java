package com.example.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.QuestionDto;
import com.example.demo.entities.Question;
import com.example.demo.repository.QuestionRepo;

@Service
public class QuestionsServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepo questionRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	
	@Override
	public QuestionDto createQuestion(QuestionDto questionDto) {
	
		Question question=modelMapper.map(questionDto, Question.class);
	     Question save=questionRepo.save(question);
	     return modelMapper.map(save, QuestionDto.class);
	}
	@Override
	public QuestionDto updateQuestion(QuestionDto questionDto, int questionId) {
		Question question=questionRepo.findById(questionId).orElseThrow(()-> new RuntimeException("Question not found with Id"+questionId));
		question.setQuestion(questionDto.getQuestion());
		question.setQuizId(questionDto.getQuizId());
		 Question save=questionRepo.save(question);
		return modelMapper.map(save, QuestionDto.class);
	}
	
	@Override
	public void deleteQuestion(int questionId) {
		Question question=questionRepo.findById(questionId).orElseThrow(()-> new RuntimeException("Question not found with Id"+questionId));
		questionRepo.delete(question);
	}
	@Override
	public QuestionDto getSingleQuestion(int questionId) {
		Question question=questionRepo.findById(questionId).orElseThrow(()-> new RuntimeException("Question not found with Id"+questionId));
		return modelMapper.map(question, QuestionDto.class);
	}
	@Override
	public List<QuestionDto> getAllQuestions() {
		List<Question>listQuestion=this.questionRepo.findAll();
		return listQuestion.stream().map(question->modelMapper.map(question, QuestionDto.class)).collect(Collectors.toList());
	}

	@Override
	public List<QuestionDto> getQuestionsOfQuiz(int quizId) {
		List<Question> listQuestion=this.questionRepo.findByQuizId(quizId);
		return listQuestion.stream().map(question->modelMapper.map(question, QuestionDto.class)).collect(Collectors.toList());
	}


	

	
	

}
