package com.entities;

import java.util.List;

import lombok.Data;
@Data
public class Question {  
private int id;  
private String qname;  
private List<Answer> answers;
  
}  