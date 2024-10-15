package com.service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.entities.Question;
@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer>{
	
	
	List<Question>findByQuizId(int quizId);

}
