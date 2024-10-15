package com.example.demo.dto;



import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuizDto {
	
	
	private int id;
	private String title;
	
 private List<Question>questions=new ArrayList<>();
	

}
