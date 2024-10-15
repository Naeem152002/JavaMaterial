package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Integer> {

}
